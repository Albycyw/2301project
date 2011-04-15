package account;

/**
 * Account Manager class
 * 
 * @author mattp
 * @version 1.0 April 3, 2011
 * @version 1.1 April 4
 *      -added isDuplicatedID()
 * @version 1.2 
 *	-added barcodeGenerator (incomplete)
 *	-added JDBCConnetion package
 *	-fixed demote(), promote() and editAccount()
 *
 * April 11
 * -added incomplete SQL statements; needs revision, see TODOs
 * -most methods are missing proper queries
 *
 * April 14
 * First pass: SQL queries for createEmployee
 * First pass: SQL queries for createCustomer
 * Completed implementation for generateNewID
 * Added helper methods
 *
 * Moved all unused methods to bottom
 * Changed name from generateBarcode to generateNewID
 */
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import jdbconnection.JDBCConnection;

public class AccountManagement
{

    private Account account;
    private JDBCConnection JDBC;
    private Connection connection;
    private Statement st;

    /**
     * Default constructor with no parameters
     */
    public AccountManagement() throws SQLException, ClassNotFoundException
    {
        JDBC = new JDBCConnection();
        //connection = JDBCConnection.getJDBCConnection();
    }

    /**
     * Create an employee account
     * @param position the position of the employee (Manager/Staff)
     * @param accountID the account ID of the account
     * @param Fname the first name of the user
     * @param Lname the last name of the user
     * @param address the address of the user
     * @param phoneNum the phone number of the user
     */
    public void createEmployee(int employeeID, String position, String Fname, String Lname, Address address, String phoneNum)
            throws SQLException, java.lang.Exception
    {
        int accountID = this.generateNewAccountID();
        int addressID = this.generateAddressID();
        account = new Employee(position, employeeID, Fname, Lname, address, phoneNum);
        try
        {
            st = JDBC.createStatement();
            String addressInsert = this.createAddressInsertSQL(address, addressID);
            String accountInsert = this.createAccountInsertSQL(accountID, addressID, Fname, Lname);
            String employeeInsert = "INSERT INTO employee (employeeID, accountID, position) value("
                    + employeeID + ","
                    + accountID + ",'"
                    + position + "')";
            st.executeUpdate(addressInsert);
            st.executeUpdate(accountInsert);
            st.executeUpdate(employeeInsert);
        }
        finally
        {
            JDBC.closeConnection();
        }
    }

    /**
     * Create a customer account
     * @param DL the driver license number of the user
     * @param accountID the accountID of the account
     * @param Fname the first name of the user
     * @param Lname the last name of the user
     * @param address the address of the user
     * @param phoneNum the phone number of the user
     * @throws SQLException
     * @throws java.lang.Exception
     */
    public void createCustomer(int customerID, String DL, String Fname, String Lname, Address address, String phoneNum)
            throws SQLException, java.lang.Exception
    {
        int accountID = this.generateNewAccountID();
        int addressID = this.generateAddressID();
        account = new Customer(DL, customerID, Fname, Lname, address, phoneNum);
        try
        {
            st = JDBC.createStatement();
            String addressInsert = this.createAddressInsertSQL(address, addressID);
            String accountInsert = this.createAccountInsertSQL(accountID, addressID, Fname, Lname);

            String customerInsert = "INSERT INTO customer (customerID, accountID, driversLicense) value("
                    + customerID + ","
                    + accountID + ",'"
                    + DL + "')";
            st.executeUpdate(addressInsert);
            st.executeUpdate(accountInsert);
            st.executeUpdate(customerInsert);
        }
        finally
        {
            JDBC.closeConnection();
        }
    }

    /**
     * Generates a new employeeID or customerID from the database for a employee or customer
     * @param accountType The account type to generate a new ID for (employee or customer)
     * @return A new ID for a customer or employee
     * @throws SQLException
     */
    public int generateNewID(String accountType) throws SQLException
    {
        st = JDBC.createStatement();
        String table = accountType;
        String column = accountType + "ID";
        String SQL = "SELECT " + column + " FROM " + table;
        ResultSet rs = st.executeQuery(SQL);
        rs.last();
        int LastID = rs.getInt(column);
        int newID = LastID + 1;
        return newID;
    }

    /**
     * Generates a new accountID from the database for a new account
     * @return The next accountID for the address table
     * @throws SQLException
     */
    private int generateNewAccountID() throws SQLException
    {
        st = JDBC.createStatement();
        String table = "account";
        String column = "accountID";
        String SQL = "SELECT " + column + " FROM " + table;
        ResultSet rs = st.executeQuery(SQL);
        rs.last();
        int LastAccountID = rs.getInt(column);
        int newAccountID = LastAccountID + 1;
        return newAccountID;
    }

    /**
     * Generates a new addressID from the database for a new address
     * @return The next addressID for the address table
     * @throws SQLException
     */
    private int generateAddressID () throws SQLException
    {
        st = JDBC.createStatement();
        String table = "address";
        String column = "addressID";
        String SQL = "SELECT " + column + " FROM " + table;
        ResultSet rs = st.executeQuery(SQL);
        rs.last();
        int LastAccountID = rs.getInt(column);
        int newAccountID = LastAccountID + 1;
        return newAccountID;
    }

    /**
     * Prepares a SQL statement to insert a new account
     * @param accountID accountID generated from generateNewAccountID
     * @param addressID addressID generated from generateAddressID
     * @param Fname The first name
     * @param Lname The last name
     * @return
     */
    private String createAccountInsertSQL (int accountID, int addressID, String Fname, String Lname)
    {
            String SQL = "INSERT INTO account (accountID, addressID, firstName, lastName) value("
            + accountID + ","
            + addressID + ",'"
            + Fname + "','"
            + Lname + "')";

            return SQL;
    }

    private String createAddressInsertSQL (Address address, int addressID) throws SQLException
    {
        String SQL = "INSERT INTO address (addressID, houseNumber, streetName, city, province, country, postalCode) value ("
        + addressID + ","
        + address.getHouseNumber() + ",'"
        + address.getStreetName() + "','"
        + address.getCity() + "','"
        + address.getProvince() + "','"
        + address.getCity() + "','"
        + address.getPostalCode() + "')";

        return SQL;
    }

    /**
     * Edit an existing account
     * @param aAccount the account
     * @param accountType the type of the account
     */
    public void editAccount(Object aAccount, String accountType)
    {
        if (accountType.equals("employee"))
        {
            Employee employee = (Employee) aAccount;
            account = employee;
        } else if (accountType.equals("customer"))
        {
            Customer customer = (Customer) aAccount;
            account = customer;
        }
    }

    /**
     * Edits personal information with 4 attributes
     * @param Fname the first name of the user
     * @param Lname the last name of the user
     * @param address the address of the user
     * @param phoneNum the phone number of the user
     */
    public void editPersonalInfo(String Fname, String Lname, Address address, String phoneNum)
    {
        account.setPersonalInfo(Fname, Lname, address, phoneNum);
    }

    /**
     * Edits personal information with 5 attributes
     * @param DL the driver license id of the customer
     * @param Fname the first name of the user
     * @param Lname the last name of the user
     * @param address the address of the user
     * @param phoneNum the phone number of the user
     */
    public void editPersonalInfo(String DL, String Fname, String Lname, Address address, String phoneNum)
    {
        Customer customer = (Customer) account;
        customer.setPersonalInfo(Fname, Lname, address, phoneNum);
        customer.setDL(DL);
        account = customer;
    }

    /**
     * Promote an employee to manager
     */
    public void promoteEmployee()
    {
        Employee employee = (Employee) account;
        employee.setPosition("Manager");
        account = employee;
    }

    /**
     * Demote a manager to employee
     */
    public void demoteManager()
    {
        Employee employee = (Employee) account;
        employee.setPosition("Employee");
        account = employee;
    }
}
//    /**
//     * Check if an account id already exists in the database
//     * @param ID an account ID
//     * @param userType the type of user (employee/customer)
//     * @return boolean
//     * @throws SQLException
//     */
//    private boolean isDuplicatedID(int ID, String accountType)
//            throws SQLException, ClassNotFoundException, java.lang.Exception
//    {
//        String table = accountType;
//        String column = accountType;
//        int constraint = ID;
//        String query = "SELECT " + column + "ID FROM " + table + " WHERE " + column + "ID = " + constraint;
//        Statement statement = connection.createStatement();
//        boolean result = statement.execute(query);
//        return result;
//    }
//    /**
//     * Set log in information
//     * @param loginID the log in ID/username of the account
//     * @param password the password of the account
//     */
//    public void setLogin(String loginID, String password)
//    {
//        account.setLogin(loginID, password);
//    }
//    /**
//     * Change the status of the account (Active/Inactive)
//     */
//    public void changeStatus()
//    {
//        account.changeStatus();
//    }