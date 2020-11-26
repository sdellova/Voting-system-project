package Model;

import java.sql.*;

public class Connexion
{
    public static void Connexion()
    {
        // TODO code application logic here
        String url="jdbc:mysql://localhost:3306/Company?autoReconnect=true&useSSL=false";
        String user="root";
        String pass="mot de passe";
        Connection conn = DriverManager.getConnection(url, user, pass);
        try{
        Statement stmt = conn.createStatement();

        ResultSet rs = stmt.executeQuery("Select namejob from job");

        while(rs.next()){
            System.out.println(rs.getString(1)+" ");
        }
        String sqlStatement = "";

        //int rows = stmt.executeUpdate(sqlStatement);
        conn.close();
        }catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static void Main(String[]args)
    {
        Connexion(); 
    }
}
