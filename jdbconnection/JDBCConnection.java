package jdbconnection;
import java.sql.*;

/**
 * This class gets a connection to our database for the caller.  It is the
 * caller's responsibility to close the connection when he is done.
 * @author Kristan
 *
 * 4 April: Mitch
 * changed getJDBCConnection to a static method
 * added a synonym method to make calling easier
 * added a closeConnection() method so that the database connection can be
 * released on command
 * removed all catch blocks since they are not dealing with errors at this level
 * changed the class to be public
 */
public class JDBCConnection {

    //this is the connection variable that will make the connection to MySql DB
   private Connection conn = null;
   private Statement st =null;

   //Constructor that calls getConnection to create the connection.

   public JDBCConnection()
   throws SQLException, ClassNotFoundException{
      this.conn = getJDBCConnection();
  }



   /**
    * This method closes the database connection.  If an instance of
    * JDBCConnection is created, this closeConnection() method MUST be called
    * when the user is done with the connection.  It is preferable for you to
    * put this method in a finally block.
    * @throws SQLException
    */
   public void closeConnection()
           throws SQLException
    {
       if (conn != null)
       {
           conn.close();
       }
       conn = null;
   }


    // makes the connection.
   /**
    * Returns a connection the database.  It is the caller's responsibility to
    * close this connection when he is finished.
    * Synonym for getConnection()
    * @return a connection to the database
    * @throws SQLException if a connection to the database cannot be made
    * @throws ClassNotFoundException if the driver cannot be found
    */
  public static Connection getJDBCConnection()
      throws SQLException, ClassNotFoundException{
      //Load the JDBC driver.
      Class.forName("com.mysql.jdbc.Driver");
      //connection to the database.
      String url = "jdbc:mysql://174.132.159.251:3306/kpoirier_CPSC2301?user=kpoirier_User&password=foobar";
      return DriverManager.getConnection(url);
    
  }


 /**
* Returns a connection the database.  It is the caller's responsibility to
* close this connection when he is finished.
* Synonym for getJDBCConnection()
* @return a connection to the database
* @throws SQLException if a connection to the database cannot be made
* @throws ClassNotFoundException if the driver cannot be found
*/
public static Connection getConnection()
      throws SQLException, ClassNotFoundException
{
  return getJDBCConnection();
}



/**
 *
 * @return
 * @throws SQLException
 */
  public Statement createStatement()
    throws SQLException{
      //try{
        st = conn.createStatement();
     // }
     // catch(Exception egg){System.err.println(egg.getMessage());}
      return st;
  }




  /**
   *
   * @return
   * @throws SQLException
   */
  public Statement prepareStatement()
    throws SQLException{
      //try{
          st = conn.createStatement();
     // }
      //catch(Exception egg){System.err.println(egg.getMessage());}
      return st;
  }
}