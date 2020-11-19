package Controller;
     
import com.mysql.jdbc.Connection;
import java.sql.*;

public class Candidate extends User
{
    public Candidate(String email, String password)
    {
        super(email,password); 
    }
    
}
