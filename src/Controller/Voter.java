package Controller;

public class Voter extends User
{
    private String state;
    
    public Voter(String State,String email, String password )
    {
        super(email,password); 
        this.state=State; 
    } 
    
    public void castVote(String candidateName)
    {
        
    }
}
