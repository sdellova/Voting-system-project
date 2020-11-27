package Model;

import java.sql.*;

public class Connecting
{
    public static Connection connect()
    {
        try
        {
        String url="jdbc:mysql://localhost:3306/voting-system-project";
        String user="root";
        String pass="";
        Connection conn = DriverManager.getConnection(url, user, pass);
        System.out.println("connexion ok");
        return conn;
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage() + "ERRORRRRRRRRRRRRRRRRRRRRRRR");
            return null;
        }
    }
}
