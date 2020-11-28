package Model;

import java.sql.*;

public class Connecting {
   
  

    public static Connection getDBConnection(String DBName) {
        try {
            String url = "jdbc:mysql://localhost:3306/" + DBName;
            String user = "root";
            String pass = "";
            Connection conn = DriverManager.getConnection(url, user, pass);
            System.out.println("connexion ok");
            return conn;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    public static void initDB() {
        String createDB = "CREATE DATABASE IF NOT EXISTS voting";
        String createTable1 = "CREATE TABLE IF NOT EXISTS candidate"
                + "(firstname TEXT(30), "
                + "lastname TEXT(30))";
        String createTable2 = "CREATE TABLE IF NOT EXISTS user"
                + "(firstname TEXT(30), "
                + "lastname TEXT(30))";
        String createTable3 = "CREATE TABLE IF NOT EXISTS voter"
                + "(firstname TEXT(30), "
                + "lastname TEXT(30))";
        try {
            Connection dbConnection = getDBConnection("");
            Statement statement = dbConnection.createStatement();
            //execute the SQL statement
            statement.execute(createDB);
            dbConnection = getDBConnection("voting");
            statement = dbConnection.createStatement();
            statement.execute(createTable1);
            statement.execute(createTable2);
            statement.execute(createTable3);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
