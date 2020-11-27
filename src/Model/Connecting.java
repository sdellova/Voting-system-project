package Model;

import java.sql.*;

public class Connecting
{
    public static Connection connect()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("driver ok");
        String url="jdbc:mysql://localhost:3306/Company?autoReconnect=true&useSSL=false";
        String user="root";
        String pass="";
        Connection conn = DriverManager.getConnection(url, user, pass);
        System.out.println("connexion ok");
        return conn;
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
            return null;
        }
    }
    public static void main(String[]args)
    {
        System.out.print("aaa");
        Connection conn = connect(); 
    }
}
