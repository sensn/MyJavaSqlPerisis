package com.company;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLOutput;

/**   https://www.sqlitetutorial.net/sqlite-java/
 *
 * @author sqlitetutorial.net
 */
public class Connect {
    /**
     * Connect to a sample database
     */
    //public static String url = "jdbc:sqlite:./res/chinook.db";
    public static String url = "jdbc:sqlite:./res/test.db";
     static Connection conn = null;
    public static void connect() {
       // Connection conn = null;
        conn = null;
        try {
            // db parameters
           // String url = "jdbc:sqlite:C:/sqlite/db/chinook.db";

            // create a connection to the database
            conn = DriverManager.getConnection(url);

            System.out.println("Connection to SQLite has been established.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println( "error");
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
                System.out.println( "error");
            }
        }
    }

    public static void openConnection() {

      //  Connection conn = null;
        conn = null;
        try {
            // db parameters
            // String url = "jdbc:sqlite:C:/sqlite/db/chinook.db";

            // create a connection to the database
            conn = DriverManager.getConnection(url);

            System.out.println("Connection to SQLite has been established.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println( "error opening DB");


    }
    }
        public static void closeConnection() {
            try {
                if (conn != null) {
                    conn.close();
                    System.out.println( " You has CLOSED DB-Connection!");
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
                System.out.println( "error closing DB");
            }
        }


    /**
     * @param args the command line arguments
     */
  /*  public static void main(String[] args) {

        connect();

    }*/


}