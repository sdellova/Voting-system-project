package Model;

import Controller.Candidate;
import Controller.Voter;
import java.sql.*;
import java.util.ArrayList;

public class VoterDAO
{

    public static ArrayList<Voter> getVoters()
    {
        ArrayList<Voter> voters = new ArrayList<>();
        try
        {
            Connection connection = Connecting.getDBConnection();
            Statement statement = connection.createStatement();
            String getVoters = "SELECT voter.*, user.* FROM voter,user "
                        + "WHERE voter.v_email = user.u_email";
            ResultSet result = statement.executeQuery(getVoters);
            while (result.next())
            {
                voters.add(new Voter(result.getString("u_email"), result.getString("u_password"), result.getString("u_first_name"), result.getString("u_last_name"), result.getString("state"), result.getString("candidate_email")));
            }
        } catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
        return voters;
    }

    public void castVote(Candidate candidate, Voter voter)
    {
        if (voter.getHasAlreadyVoted())
        {
            return;
        } else
        {
            try
            {
                Connection connection = Connecting.getDBConnection();
                Statement statement = connection.createStatement();
                String insertVote = "INSERT INTO voter(candidate_email)"
                        + "VALUES"
                        + "('" + candidate.getEmail() + "');";
                statement.execute(insertVote);
                voter.setHasAlreadyVoted(true);
            } catch (SQLException e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
}
