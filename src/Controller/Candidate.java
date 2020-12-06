package Controller;

import java.sql.Blob;

public class Candidate extends User
{
    private final String political_party;
    
    public Candidate(String email, String password, String political_party, String first_name, String last_name, Blob photo)
    {
        super(email,password, first_name, last_name, photo);
        this.political_party = political_party;
    }
        @Override
    public String toString()
    {
        return "candidate";
    }
    public String getPolitical_party()
    {
        return political_party;
    }
}
