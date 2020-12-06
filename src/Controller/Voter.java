package Controller;

public class Voter extends User
{

    private final String state;
    private final String candidate_email;

    public Voter(String email, String password, String first_name, String last_name, String State, String candidate_email)
    {
        super(email, password, first_name, last_name);
        this.state = State;
        this.candidate_email = candidate_email;
    }

    @Override
    public String toString()
    {
        return "voter";
    }

    public String getState()
    {
        return state;
    }

    public String getCandidate_email()
    {
        return candidate_email;
    }
}
