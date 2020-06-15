package com.company;

public class Main {

    public static void main(String[] args) {

        //Connect.connect();
      //  DbFunc.createNewDatabase("test.db");
       // DbFunc.createNewTable();
//Connect.openConnection();
        DbOperations app = new DbOperations();
        app.selectAll();
        Connect.closeConnection();

//        Driver driver = new SQLiteDriver("database.sql");    // We create a driver first (provided by JPersis) and create an JPersis object:
//        JPersis jpersis = new JPersis(driver);
//
//        User user = new User();
//        user.setName("Max");
//
//      //  Next we need our mapper. JPersis will provide a mapper for you:
//
//        UserMapper mapper = jpersis.map(UserMapper.class);
//
//       // Let's insert our user and check if it worked:
//
//        mapper.insert(user); // returns true, seems to be okay!
//        mapper.count(); // returns 1, there is a user in the database
//        mapper.findByUserName("Max"); // Hey Max, how are you doing?
//
//	// write your code here
       // Path sqlite_database_file_path = "";
//        jdbc:sqlite:sqlite_database_file_path
//        jdbc:sqlite:sample.db
//        jdbc:sqlite:C:/sqlite/db/chinook.db

    }




}
