package inventory;
import accounts.*;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import utility.SanitizerException;
import java.util.ArrayList;
import search.Search;
import inventory.MovieNotFoundException;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

/**
 * This is a utility class that encapsulates the interface of all classes that
 * deal with managing rental movies.
 *
 *
 * Last updated: 1 April
 * @author Mitch
 * version 0.3
 *
 */
public class RentalMovieManagement {



    // methods

    public enum Status
    {
        AVAILABLE, RENTED, OVERDUE, RESERVED
    }

    /**
     * This method finds the availability of the specified RentalMovie
     * @param barcode the unique barcode number of the Rental Movie
     * @return the status of the RentalMovie
     * @pre The barcode number must correspond to a RentalMovie
     * @throws MovieNotFoundException if the barcode number does not exist
     * @throws SQLException if the RentalMovie information cannot be read from
     * the database
     */
    public static String getStatus(String barcodeNum)
            throws MovieNotFoundException, SQLException
    {
        RentalMovie rentalMovie = new RentalMovie(barcodeNum);
        return rentalMovie.getStatus();
    }



    /**
     * This method finds the availability status of a specified RentalMovie.
     * @param rentalMovie a reference to the Rental Movie we are interested in
     * @return the status of the RentalMovie
     * @throws MovieNotFoundException if the passed movie is null
     */
    private static String getStatus(RentalMovie rentalMovie)
            throws MovieNotFoundException
    {
        if (rentalMovie == null)
        {
            throw new MovieNotFoundException("MovieNotFoundException: "
                    + "No movie was supplied.");
        }
        return rentalMovie.getStatus();
    }




    /**
     * This method gets the condition of a Rental Movie specified by its
     * barcode number.  Possible conditions are good, lost, and damaged.
     * @param barcodeNum the unique barcode number corresponding to the
     * RentalMovie you are interested in
     * @return A string specifying the condition of the movie
     * @throws MovieNotFoundException if the barcode does not correspond to
     * any rental movie.
     * @throws SQLException if the RentalMovie object cannot be created
     * because of lack of connection to the database.
     * @pre the barcode number must correspond to an existing RentalMovie
     */
    public static String getCondition(String barcodeNum)
            throws MovieNotFoundException, SQLException
    {
        RentalMovie rentalMovie = new RentalMovie(barcodeNum);
        return rentalMovie.getCondition();
    }


    /**
     * These are the possible conditions of a RentalMovie
     */
    public enum Condition
    {
        GOOD, LOST, DAMAGED
    }


    /** This method sets the condition of the instanced RentalMovie to a specified
     * value and updates the database.
     * @param barcodeNum The barcode number of the Rental Movie whose condition
     * you want to change
     * @param condition The condition that you want to set for the instanced
     * RentalMovie.  It must match either good, lost, or broken, case insensitive.
     * @throws IllegalArgumentException if the condition does not match
     * @throws SQLException if a connection to the database cannot be made or if
     * more than one row is changed
     * @throws MovieNotFoundException if the barcode cannot be found
     * @post one and only one row is changed
     */
    private static void setCondition(String barcodeNum, String condition)
            throws IllegalArgumentException, SQLException,
                MovieNotFoundException
    {
        if (condition == null)
            return;
        Condition.valueOf(condition.toUpperCase());
        String query = setConditionGenerateSQL(barcodeNum, condition);
        int rowsChanged = updateDatabase(query);
        if (rowsChanged > 1)
        {
            throw new SQLException("SQLException: database corrupted");
        }
        if (rowsChanged < 1)
        {
            throw new MovieNotFoundException("MovieNotFoundException: "
                    + "cannot find barcode number");
        }

    }



    /** This method sets the condition of the instanced RentalMovie to a specified
     * value and updates the database.
     * @param rentalMovie The  Rental Movie whose condition
     * you want to change
     * @param condition The condition that you want to set for the instanced
     * RentalMovie.  It must match either good, lost, or broken, case insensitive.
     * @throws IllegalArgumentException if the condition does not match
     * @throws SQLException if a connection to the database cannot be made or if
     * more than one row is changed
     * @throws MovieNotFoundException if the barcode cannot be found
     * @post one and only one row is changed
     */
    private static void setCondition(RentalMovie rentalMovie, String condition)
            throws IllegalArgumentException, SQLException,
                MovieNotFoundException
    {
        String barcodeNum = rentalMovie.getBarcodeNum();
        setCondition(barcodeNum, condition);
    }



    /**
     * This method sends an update query to the Database
     * @param query an SQL query
     * @return the number of rows affected.
     * @throws SQLException
     */
    private static int updateDatabase(String query)
            throws SQLException
    {
        java.sql.Connection connection = utility.DataSource.getConnection();
        try
        {
            java.sql.Statement statement = connection.createStatement();
            return statement.executeUpdate(query);
        }
        finally
        {
            connection.close();
        }

    }
    
    
    
    /**
     * This method generates a simple sql query for updating a table
     * @param tableName
     * @param attributeName
     * @param setAttributeTo
     * @param whereCondition
     * @return
     */
    private static String generateUpdateSQL(String tableName, String attributeName,
            String setAttributeTo, String whereCondition)
    {
        String command = "UPDATE " + tableName
                + " SET " + attributeName + " = '" + setAttributeTo + "'"
                + " WHERE " + whereCondition;
        return command;
    }



    /**
     * This method generates an SQL query to set the condition of the RentalMovie
     * eg
     * UPDATE VideoRental
     * SET Condition = 'lost'
     * WHERE (RentalID = 1021 AND SKU = 10010010011)
     * @param barcodeNum
     * @param condition
     * @return
     */
    private static String setConditionGenerateSQL(String barcodeNum, String condition)
    {
        String[] splitBarcode = {null, null};
        splitBarcode(barcodeNum, splitBarcode);
        final int SKU_INDEX = 0;
        final int RENTAL_ID_INDEX = 1;

        String where = "(RentalID = '" + splitBarcode[RENTAL_ID_INDEX]
                + "' AND SKU = '" + splitBarcode[SKU_INDEX] + "')";
        String query = generateUpdateSQL("VideoRental", "Condition", condition, where);
        
        return query;
    }



    /**
     * This method splits a barcode into its SKU and rentalID and returns them
     * by writing them into a passed array of length 2.
     * @param barcodeNum
     * @param overwriteThisArray
     * @throws IllegalArguementException if the barcode is not the right length
     * or the array is not length 2
     * TODO: move this method to the appropriate class, probably RentalMovie
     */
    private static void splitBarcode(String barcodeNum, String[] overwriteThisArray)
            throws IllegalArgumentException
    {
        int SKU_length = 11; // TODO: make this a static constant in GenrealMovie
        int rentalID_length = 4; // TODO: make this a static constant in RentalMovie

        if (barcodeNum == null || barcodeNum.length() != SKU_length + rentalID_length)
        {
            throw new IllegalArgumentException("IllegalArgumentException: Invalid barcode number");
        }

        if (overwriteThisArray == null || overwriteThisArray.length != 2)
            // the number of results from splitting the barcode number is 2
        {
            throw new IllegalArgumentException("IllegalArgumentException: Array to overwrite is the wrong size.");
        }

        String SKU = barcodeNum.substring(0, SKU_length);
        String rentalID = barcodeNum.substring(SKU_length);

        overwriteThisArray[0] = SKU;
        overwriteThisArray[1] = rentalID;

    }



    /**
     * This method rents out a RentalMovie, updating both the RentalMovie
     * and the Customer's account in the database.
     * @param barcodeNum the barcode number of the RentalMovie
     * @param memberID the unique ID of the customer who is renting
     * @return the due date of the movie
     * @pre the barcode number must correspond to an existing movie
     * @pre the memberID must correspond to an existing member
     * @pre the movie's status must be available
     * @throws MovieNotFoundException if the movie does not exist
     * @throws CustomerNotFoundException if the customer does not exist
     * @throws MovieNotAvailableException if the movie is not available
     */
    public static GregorianCalendar rent(String barcodeNum, String memberID)
            throws MovieNotFoundException, CustomerNotFoundException,
            MovieNotAvailableException, SQLException
    {
        return rent(new RentalMovie(barcodeNum), new Customer(memberID));
    }


    /**
     * This method rents out a RentalMovie, updating both the RentalMovie
     * and the Customer's account in the database.
     * @param movie the movie that you want to rent out
     * @param customer the customer who is renting
     * @return the due date of the movie
     * @pre the barcode number must correspond to an existing movie
     * @pre the memberID must correspond to an existing member
     * @pre the movie's status must be available
     * @throws MovieNotFoundException if the movie does not exist
     * @throws CustomerNotFoundException if the customer does not exist
     * @throws MovieNotAvailableException if the movie is not available
     * @post the movie's status is changed to rented.
     */
    private static GregorianCalendar rent(RentalMovie movie, Customer customer)
            throws MovieNotFoundException, CustomerNotFoundException,
            MovieNotAvailableException, SQLException
    {
        if (movie == null || !movie.getStatus().equalsIgnoreCase("available"))
        {
            throw new MovieNotAvailableException("MovieNotAvailableException:"
                    + " movie is not available");
        }

        if (customer == null)
        {
            throw new CustomerNotFoundException("CustomerDoesNotExistException:"
                    + " no Customer specified");
        }

        rentMovieUpdateDatabase(movie, "VideoRental", "Status",
                "rented");
        
        rentMovieUpdateDatabase(movie, "VideoRental", "MemberID", "" + customer.getAccountID());

        int rentalTime = movie.getRentalTime();

        GregorianCalendar dueDate = new GregorianCalendar();
        dueDate.add(Calendar.DATE, rentalTime);

        movie.setStatus("rented");

        return dueDate;
        
        
    }

    
    
    
    /**
     * Updates the database that the movie is rented out
     * @param movie
     * @throws MovieNotFoundException if the movie is not found in the db
     */
    private static void rentMovieUpdateDatabase(RentalMovie movie, String tableName,
            String attributeName, String setAttributeTo)
            throws MovieNotFoundException, SQLException
    {
        String barcodeNum = movie.getBarcodeNum();
        String movieWhere = generateMovieWhere(barcodeNum);
        
        String movieCommand = generateUpdateSQL(tableName, attributeName,
                setAttributeTo, movieWhere);

        int rowsChanged = updateDatabase(movieCommand);
        
        if (rowsChanged == 0)
        {
            throw new MovieNotFoundException("MovieNotFoundException:"
                    + " Could not find movie in database.");
        }
    }
    
    
    
    /**
     * Refactored code.  Generates a WHERE statement to specify the specific
     * RentalMovie that has the barcodeNum
     * @param barcodeNum
     * @return
     */
    private static String generateMovieWhere(String barcodeNum)
    {
        
        String[] splitBarcode = {null, null};
        splitBarcode(barcodeNum, splitBarcode);
        final int SKU_INDEX = 0;
        final int RENTAL_ID_INDEX = 1;
        String where = "RentalID = '" + splitBarcode[RENTAL_ID_INDEX] + "'"
                + "AND SKU = '" + splitBarcode[SKU_INDEX] + "'";
        return where;
    }
    
    
    
    
    /**
     * Gets the category of the movie
     * @param barcodeNum the barcodeNumber of the RentalMovie
     * @return the category of the movie
     * @throws SQLException
     * @throws MovieNotFoundException
     */
    public static String getCategory(String barcodeNum)
            throws SQLException, MovieNotFoundException
    {
        RentalMovie movie = (RentalMovie) Search.previewMovie(barcodeNum);
        return movie.getCategory();
    }
    
    
    
    /**
     * Gets the format of the specified movie
     * @param barcodeNum
     * @return the format of the movie
     * @throws SQLException
     * @throws MovieNotFoundException
     */
    public static String getFormat(String barcodeNum)
            throws SQLException, MovieNotFoundException
    {
        RentalMovie movie = new RentalMovie(barcodeNum);
        return movie.getFormat();
    }
    

    /**
     * all possible categories
     */
    public enum Category
    {
        NEW_RELEASE, SEVEN_DAY_RENTAL, FOR_SALE, DISCOUNT
    }



    /**
     * Sets the category of the movie to one of the following: new release, 
     * seven day rental, for sale
     * When the category is set to for sale, the database is changed to reflect
     * this.
     * TODO: where are the categories in the database? assuming that they're
     * in VideoRental table for now.
     * @param barcodeNum the unique barcodeNumber of the movie
     * @param category the category to change to
     * @throws SQLException
     * @throws MovieNotFoundException
     * @throws IllegalArgumentException if the category is not a valid category
     */
    public static void changeCategory(String barcodeNum, String category)
            throws SQLException, MovieNotFoundException
    {
        Category cat = Category.valueOf((category.replaceAll(" ", "_")).toUpperCase());
        if (cat == Category.FOR_SALE)
        {
            changeToSale(barcodeNum);
            return;
        }

        String where = generateMovieWhere(barcodeNum);
        String command = generateUpdateSQL("VideoRental", "Category",
                category.toLowerCase(), where);
        updateDatabase(command);
        // TODO: check for number of rows changed
    }



    /**
     * Changes a rental movie to a sale movie and updates the database
     * @param barcodeNum
     * @throws MovieNotFoundException
     * @throws SQLException
     */
    private static void changeToSale(String barcodeNum)
            throws MovieNotFoundException, SQLException
    {
        RentalMovie movie = (RentalMovie) Search.previewMovie(barcodeNum);

        // TODO: disallow if movie is not available or condition not good?

        String[] keys = {null, null};
        splitBarcode(barcodeNum, keys);
        String[] deleteColumnNames = {"SKU", "rentalID"};
        String deleteQuery = generateDeleteSQL("VideoRental", deleteColumnNames, keys);
        String[] insertColumnNames = { "condition", "SKU", "saleID" };
        String[] values = { movie.getCondition(), keys[0], keys[1] };
        String insertQuery = generateInsertSQL("VideoSales", insertColumnNames, values);


        java.sql.Connection conn = utility.DataSource.getConnection();
        try
        {

            Statement stat = conn.createStatement();
            stat.executeQuery(deleteQuery);
            stat.execute(insertQuery);
        }
        finally
        {
            conn.close();
        }

    }
    
    

    /**
     * Generates a delete query
     * DELETE FROM tableName WHERE columns[0] = 'keys[0]' AND ... AND
     * columns[n] = 'keys[n]'
     * @param tableName
     * @param columns
     * @param keys
     * @return
     * @throws SQLException
     */
    private static String generateDeleteSQL(String tableName, String[] columns, String[] keys)
            throws SQLException
    {
        if (columns.length != keys.length)
        {
            throw new SQLException("SQLException: column/value mismatch");
        }
        String query = "DELETE FROM "+tableName+" WHERE ";
        for (int i = 0; i < columns.length; i++)
        {
            query = query + columns[i] + " = '"+keys[i]+"'";
            if (i != columns.length - 1)
            {
                query += " AND ";
            }
        }
        return query;

    }
    



    /**
     * Generates an sql query for inserting a new row into a table
     * @param tableName
     * @param columnNames an array containing the names of the columns to change
     * @param values an array containing the values ot put in the columns
     * @return
     * @throws SQLExceptoin
     */
    private static String generateInsertSQL(String tableName, String[] columnNames, String[] values)
            throws SQLException
    {
        if (columnNames.length != values.length)
        {
            throw new SQLException("SQLException: column/value mismatch");
        }
        String query = "INSERT INTO "+tableName+" (";
        for (int i = 0; i < columnNames.length; i++)
        {
            query += columnNames[i];
            if (i != columnNames.length - 1)
            {
                query += ", ";
            }
        }
        query += ") VALUES (";
        for (int i = 0; i < values.length; i++)
        {
            query = query + "'"+values[i]+"'";
            if (i != values.length - 1)
            {
                query += ", ";
            }
        }
        query += ")";
        return query;
        
    }



    /**
     * This method gets the specified movie's title
     * @param barcodeNum
     * @return
     * @throws SQLException
     * @throws MovieNotFoundException
     */
    public static String getTitle(String barcodeNum)
            throws SQLException, MovieNotFoundException
    {
        RentalMovie movie = (RentalMovie) Search.previewMovie(barcodeNum);
        return movie.getTitle();
    }



    /**
     * This method updates all the attributes of the RentalMovie associated with
     * the barcodeNum
     * @param barcodeNum the barcode number of the RentalMovie whose information
     * you want to change
     * @param info an array of information, with each String in the array
     * corresponding to an attribute of RentalMovie
     * It should be an array of length 4.
     * The order should be category, format, condition, status.
     * If you don't want to change one, it should be null in the array
     * @throws SQLException
     * @throws MovieNotFoundException
     */
    public static void editCopy(String barcodeNum, String[] info)
            throws SQLException, MovieNotFoundException
    {
        final int EXPECTED_INFO_LENGTH = 4;
        if (info.length != EXPECTED_INFO_LENGTH)
        {
            throw new IllegalArgumentException("info length wrong");
        }
        editCopy(barcodeNum, info[0], info[1], info[2], info[3]);



    }



    // TODO: Problem with putting category in VideoRental
    /**
     * Alternate call of editCopy(String,String[])
     * Changes the attributes of the RentalMovie to the specified ones.
     * If you don't want to change any attributes, then send them as null
     * @param barcodeNum
     * @param category
     * @param format
     * @param condition
     * @param status
     * @throws MovieNotFoundException
     * @throws SQLException
     */
    public static void editCopy(String barcodeNum, String category,
            String format, String condition, String status)
            throws MovieNotFoundException, SQLException
    {
        RentalMovie movie = (RentalMovie) Search.previewMovie(barcodeNum);
        setCategory(movie, category);
        setFormat(movie, format);
        setCondition(movie, condition);
        setStatus(movie, status);
    }




    /**
     * Synonym for changeCategory
     * @param movie
     * @param category
     * @throws SQLException
     * @throws IllegalArgumentException
     * @throws MovieNotFoundException
     */
    private static void setCategory(RentalMovie movie, String category)
            throws SQLException, IllegalArgumentException, MovieNotFoundException
    {
        String barcodeID = movie.getBarcodeNum();
        changeCategory(barcodeID, category);
        movie.setCategory(category);

    }




    private static void setFormat(RentalMovie movie, String format)
    {
        
    }



    
    
    

}