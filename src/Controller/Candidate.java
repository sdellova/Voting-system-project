package Controller;
     
import java.util.ArrayList;

public class Candidate extends User
{
    private ArrayList<Voter> votes;
    
    public Candidate(String email, String password, String political_party, String first_name, String last_name)
    {
        super(email,password, first_name, last_name); 
    }
        @Override
    public String toString()
    {
        return "candidate";
    }
}
