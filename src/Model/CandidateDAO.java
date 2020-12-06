package Model;

import Controller.Candidate;
import java.sql.*;
import java.util.ArrayList;

public class CandidateDAO
{

    public static ArrayList<Candidate> getCandidates()
    {
        ArrayList<Candidate> candidates = new ArrayList<>();
        try
        {
            Connection connection = Connecting.getDBConnection();
            Statement statement = connection.createStatement();
            String getCandidates = "SELECT candidate.*, user.* FROM candidate,user "
                        + "WHERE candidate.c_email = user.u_email";
            ResultSet result = statement.executeQuery(getCandidates);
            while (result.next())
            {
                candidates.add(new Candidate(result.getString("u_email"), result.getString("u_password"), result.getString("political_party"), result.getString("u_first_name"), result.getString("u_last_name"), result.getBlob("photo")));
            }
        } catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
        return candidates;
    }

    public static Candidate getCandidateByEmail(String email)
    {
        try
        {
            Connection connection = Connecting.getDBConnection();
            Statement statement = connection.createStatement();
            String getCandidate = "SELECT * FROM candidate "
                    + "WHERE c_email = '" + email + "'";
            ResultSet result = statement.executeQuery(getCandidate);
            while (result.next())
            {
                return (new Candidate(email, result.getString("c_password"), result.getString("political_party"), result.getString("c_firstname"), result.getString("c_lastname"), result.getBlob("photo")));
            }
        } catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
        return null;
    }

}
