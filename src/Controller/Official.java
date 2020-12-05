package Controller;

public class Official extends User
{
    private enum VotingState {OPEN, PAUSED, CLOSED};
    private VotingState votingState = VotingState.CLOSED;
    public Official(String email, String password, String first_name, String last_name)
    {
        super(email,password, first_name, last_name); 
    }
    public void startVoting()
    {
        votingState = VotingState.OPEN;
    }
    public void pauseVoting()
    {
        votingState = VotingState.PAUSED;
    }
    public void finishVoting()
    {
        votingState = VotingState.CLOSED;
    }
    @Override
    public String toString()
    {
        return "official";
    }
}
