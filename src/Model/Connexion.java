package Model;

import java.net.Socket;
import java.sql.*;

public class Connexion
{
    Connexion connexion;
    Statement statement;
    String SQL;
    String url; 
    String name;
    String firstname;
    String password; 
    Socket user;
    int port; 
    int Id;
    String Host; 
    
    public Connexion(String url, String name, String firstname, String password, String Host,int port, int Id )
    {
        this.Host=Host; 
        this.firstname = firstname;
        this.name = name;
        this.password = password;
        this.port = port; 
        this.url =url; 
        this.Id= Id;
        
    }

    public Connexion(String Host_Connexion, String Iphost, int Port, String Password_Connexion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    // fonction pour faire la connection a la base de donnée 
    public Connexion connexion()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            connexion = DriverManager.getConnexion(url, firstname, name,Id, password); 
        }catch (Exception e) // mesaage d'erreur
        {
            System.err.println(e.getMessage());
        }
        return connexion; 
        
    }
    // fonction pour fermer la base de donnée 
    public Connexion closeconnexion()
    {
        try 
        {
            connexion.closeconnexion();
        }catch(Exception e)
        {
            System.err.println(e.getMessage());
        }
        return connexion;
    }
    
    // execution de la requete 
    public ResultSet executeQuery (String sql)
    {
        connexion(); 
        ResultSet resultset = null; 
        try
        {
            statement  = connexion.createStatement();
            resultset = statement.executeQuery(sql);
            System.out.println(sql);
        }catch(SQLException ex)
        {
            System.err.println(ex.getMessage());
        }
        return resultset; 
    }
    // Pour execution des requetes 
    public String executeUpdate(String sql)
    {
        connexion(); 
        String result ="";
        try
        {
            result = sql;
            statement = connexion.createStatement();
            statement.executeUpdate(sql);
                 
        }catch(SQLException ex)
        {
            result =ex.toString(); 
        }
        return result; 
    }
    // fonction de requete pour afficher tous 
    public ResultSet querySelectall(String nameTable)
    {
        connexion(); 
        SQL = "SELECT * FROM " + nameTable;
        System.out.println(SQL);
        return this.executeQuery(SQL);
    }
    // afficher tout + parametre condition 
    public ResultSet querySelectall(String nameTable, String condition)
    {
        connexion();
        SQL="SELECT * FROM " + nameTable + "WHERE"+ condition ;
        return this.executeQuery(SQL);
    }
    public ResultSet querySelect(String[] nameColone, String nameTable)
    {
        connexion(); 
        int i; 
        SQL = "Select"; 
        
        for (i = 0; i<= nameColone.length - 1 ; i++)
        {
            SQL += nameColone[i];
            if(i<nameColone.length-1)
            {
                SQL+=",";
            }
            
        }
         SQL+= "FROM" + nameTable;
        return this.executeQuery(SQL); 
    }
    
    public ResultSet SelectCommand(String[] nameColone, String nameTable, String condition)
    {
        connexion(); 
        int i; 
        SQL = "Select"; 
        
        for(i=0; i<= nameColone.length - 1; i++)
        {
            SQL += nameColone[i];
            if (i<nameColone.length-1)
            {
                SQL+=",";
                
            }
            
        }
        SQL+="FROM"+ nameTable+"WHERE"+condition; 
        return this.executeQuery(SQL);
    }
    
    // fonction d'entre de donnée 
    public String queryInsert(String nameTable, String[] TableContent)
    {
        connexion(); 
        int i ; 
        SQL = "INSERT INTO"+nameTable + "VALUES(";
        
        for (i = 0; i<= TableContent.length -1 ; i++ )
        {
            SQL += "'"+ TableContent[i]+"'";
            if(i<TableContent.length - 1)
            {
                SQL+=",";
            }
        }
        SQL+= ")"; 
        return this.executeUpdate(SQL);
        
    }
    
    public String queryInsert(String nameTable, String[] nameColone, String[] TableContent )
    {
        connexion(); 
        int i ; 
        SQL = "INSERT INTO"+ nameTable+"("; 
        for (i= 0; i <= nameColone.length -1 ; i++ )
        {
            SQL+= nameColone[i];
            if (i <nameColone.length -1)
            {
                SQL += ","; 
            }
        }
        SQL += ") VALUES(";
        for (i=0; i<= TableContent.length-1; i++)
        {
            SQL+="'"+TableContent[i] + "'"; 
            if(i<TableContent.length-1)
            {
                SQL += ","; 
            }
        }
        SQL+=")";
        return this.executeUpdate(SQL);
    }
    
    public String queryUpdate(String nameTable, String[] nameColone, String[]TableContent, String condition)
    {
        connexion(); 
        int i ; 
        SQL = "UPDATE"+ nameTable+ "SET"; 
        
        for(i = 0; i <= nameColone.length -1; i++)
        {
            SQL+= nameColone[i]+"='"+TableContent[i]+"'"; 
            if( i< nameColone.length-1)
            {
                SQL += ","; 
            }
        }
        SQL += "WHERE"+condition ; 
        return this.executeUpdate(SQL); 
    }
    
    // fonction pour la requete suprimer avec parametre
    
    public String queryDelete(String nameTable, String condition )
    {
        connexion(); 
        SQL ="DELETE FROM" + nameTable + "WHERE"+ condition ; 
        return this.executeUpdate(SQL); 
    }
    
}
