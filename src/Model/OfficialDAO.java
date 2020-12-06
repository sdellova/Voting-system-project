package Model;

import Controller.Candidate;
import Controller.Voter;
import java.sql.*;
import java.util.ArrayList;

public class OfficialDAO
{
    public static void addCandidate(String email, String password, String political_party, String first_name, String last_name)
    {
        try
        {
            Connection connection = Connecting.getDBConnection();
            Statement statement = connection.createStatement();
            String insertCandidate = "INSERT INTO user(u_email, u_password, u_first_name, u_last_name)"
                    + "VALUES"
                    + "('" + email + "', '" + password + "', '" + first_name + "', '" + last_name + "'); "
                    + "INSERT INTO candidate(c_email, political_party)"
                    + "VALUES"
                    + "('" + email + "', '" + political_party + "');";
            statement.execute(insertCandidate);
        } catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static void deleteCandidate(String email)
    {
        try
        {
            Connection connection = Connecting.getDBConnection();
            Statement statement = connection.createStatement();
            String deleteCandidate = "DELETE FROM user"
                    + "WHERE u_email = " + email
                    + " DELETE FROM candidate"
                    + "WHERE c_email = " + email;
            statement.execute(deleteCandidate);
        } catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static void addVoter(String email, String password, String first_name, String last_name, String state)
    {
        try
        {
            Connection connection = Connecting.getDBConnection();
            Statement statement = connection.createStatement();
            String insertVoter = "INSERT INTO user(u_email, u_password, u_first_name, u_last_name)"
                    + "VALUES"
                    + "('" + email + "', '" + password + "', '" + first_name + "', '" + last_name + "');"
                    + "INSERT INTO voter(v_email, state)"
                    + "VALUES"
                    + "('" + email + "', '" + state + "');";
            statement.execute(insertVoter);
        } catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static void deleteVoter(String email)
    {
        try
        {
            Connection connection = Connecting.getDBConnection();
            Statement statement = connection.createStatement();
            String deleteVoter = "DELETE FROM user"
                    + "WHERE u_email = " + email
                    + "DELETE FROM voter"
                    + "WHERE v_email = " + email;
            statement.execute(deleteVoter);
        } catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static ArrayList<Candidate> getWinner() // à refaire
    {
        try
        {
            Connection connection = Connecting.getDBConnection();
            Statement statement = connection.createStatement();
            String getWinner = "SELECT candidate_email, count(*) "
                    + "FROM candidate_voter "
                    + "GROUP BY candidate_email "
                    + "HAVING count(*) >= ALL (SELECT count(*) "
                    + "FROM candidate_voter "
                    + "GROUP BY candidate_email)";
            ResultSet result = statement.executeQuery(getWinner);
            ArrayList<Candidate> winners = new ArrayList<>();
            while (result.next())
            {
                winners.add(CandidateDAO.getCandidateByEmail(result.getString(1)));
            }

            return winners;
        } catch (SQLException e)
        {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
