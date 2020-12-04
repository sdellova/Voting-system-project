package Controller;

import Model.Connecting;

public class Voter extends User
{
    private final String state;
    private boolean hasAlreadyVoted = false;
    
    public Voter(String email, String password, String first_name, String last_name, String State)
    {
        super(email,password, first_name, last_name); 
        this.state=State; 
    } 
    public void setHasAlreadyVoted(boolean value)
    {
        hasAlreadyVoted = value;
    }
    public boolean getHasAlreadyVoted()
    {
        return hasAlreadyVoted;
    }
}
