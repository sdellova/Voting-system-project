package Model;

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
                voters.add(new Voter(result.getString("u_email"), result.getString("u_password"), result.getString("u_first_name"), result.getString("u_last_name"), result.getString("state"), result.getString("candidate_email"), result.getBytes("photo")));
            }
        } catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
        return voters;
    }

    public static boolean hasAlreadyVoted(String voterEmail)
    {
        boolean hasAlreadyVoted = false;
        try
        {
        Connection connection = Connecting.getDBConnection();
        Statement statement = connection.createStatement();
        String str = "SELECT candidate_email FROM voter WHERE v_email = '" + voterEmail + "'";
        ResultSet result = statement.executeQuery(str);
        while(result.next())
        {
            if(result.getString("candidate_email") != null)
            {
                hasAlreadyVoted = true;
            }
        }
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
        return hasAlreadyVoted;
    }

    public static void castVote(String candidateEmail, String voterEmail)
    {
        try
        {
            Connection connection = Connecting.getDBConnection();
            Statement statement = connection.createStatement();
            String updateVote = "UPDATE voter "
                    + "SET candidate_email = '" + candidateEmail + "' "
                    + "WHERE v_email = '" + voterEmail + "'";
            statement.execute(updateVote);
        } catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
