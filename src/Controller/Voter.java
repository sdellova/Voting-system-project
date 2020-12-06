package Controller;

import java.sql.Blob;

public class Voter extends User
{

    private final String state;
    private final String candidate_email;

    public Voter(String email, String password, String first_name, String last_name, String State, String candidate_email, byte[] photo)
    {
        super(email, password, first_name, last_name, photo);
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
