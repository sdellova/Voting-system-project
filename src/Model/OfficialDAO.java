package Model;

import Controller.Candidate;
import Controller.Voter;
import java.sql.*;
import java.util.ArrayList;

public class OfficialDAO
{

    public static int getnbVotes()
    {
        int nb = 0;
        try
        {
            Connection connection = Connecting.getDBConnection();
            Statement statement = connection.createStatement();
            String str0 = "SELECT COUNT(*)"
                    + "FROM voter "
                    + "WHERE candidate_email IS NOT NULL";
            ResultSet result = statement.executeQuery(str0);
            while (result.next())
            {
                nb = result.getInt(1);
            }
        } catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
        return nb;
    }

    public static ArrayList<ArrayList<String>> getVoteNumberByCandidate()
    {
        ArrayList<ArrayList<String>> array = new ArrayList<>();
        try
        {
            Connection connection = Connecting.getDBConnection();
            Statement statement = connection.createStatement();
            String str0 = "SELECT candidate_email, COUNT(*)"
                    + "FROM voter "
                    + "WHERE candidate_email IS NOT NULL GROUP BY candidate_email";
            ResultSet result = statement.executeQuery(str0);
            while (result.next())
            {
                ArrayList<String> arr = new ArrayList<>();
                arr.add(result.getString("candidate_email"));
                arr.add(result.getString("COUNT(*)"));
                array.add(arr);
            }
        } catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
        return array;
    }

    public static ArrayList<Voter> getVoterByCandidates(String email)
    {
        ArrayList<Voter> votersList = new ArrayList<>();
        try
        {
            Connection connection = Connecting.getDBConnection();
            Statement statement = connection.createStatement();
            String getVoters = "SELECT voter.*, user.* FROM voter,user "
                    + "WHERE voter.v_email = user.u_email AND voter.candidate_email = '" + email + "'";
            ResultSet result = statement.executeQuery(getVoters);
            while (result.next())
            {
                votersList.add(new Voter(result.getString("u_email"), result.getString("u_password"), result.getString("u_first_name"), result.getString("u_last_name"), result.getString("state"), result.getString("candidate_email"), result.getBytes("photo")));
            }
        } catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
        return votersList;
    }

    public static ArrayList<String> getStates()
    {
        ArrayList<String> array = new ArrayList<>();
        try
        {
            Connection connection = Connecting.getDBConnection();
            Statement statement = connection.createStatement();
            String str1 = "SELECT DISTINCT state FROM voter";
            ResultSet result1 = statement.executeQuery(str1);
            while (result1.next())
            {
                array.add(result1.getString("state"));
            }
            result1.close();
        } catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
        return array;
    }

    public static float getAbstentionRate()
    {
        float a = 0, b = 0;
        try
        {
            Connection connection = Connecting.getDBConnection();
            Statement statement = connection.createStatement();
            String str1 = "SELECT COUNT(*) "
                    + "FROM voter "
                    + "WHERE candidate_email IS NULL";
            String str2 = "SELECT COUNT(*) "
                    + "FROM voter ";
            ResultSet result1 = statement.executeQuery(str1);
            while (result1.next())
            {
                a = result1.getFloat(1);
            }
            result1.close();
            statement.executeQuery(str2);
            ResultSet result2 = statement.executeQuery(str2);
            while (result2.next())
            {
                b = result2.getFloat(1);
            }
        } catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
        return a / b * 100;
    }

    public static ArrayList<ArrayList<String>> getAbstentionRateByState()
    {
        ArrayList<ArrayList<String>> array = new ArrayList<>();
        ArrayList<ArrayList<String>> a = new ArrayList<>();
        try
        {
            Connection connection = Connecting.getDBConnection();
            Statement statement = connection.createStatement();
            String str1 = "SELECT state, COUNT(*) "
                    + "FROM voter "
                    + "WHERE candidate_email IS NULL GROUP BY state";
            String str2 = "SELECT state, COUNT(*) "
                    + "FROM voter GROUP BY STATE";
            ResultSet result1 = statement.executeQuery(str1);
            while (result1.next())
            {
                ArrayList<String> arr = new ArrayList<>();
                arr.add(result1.getString("state"));
                System.out.println(result1.getString("state"));
                arr.add(result1.getString("COUNT(*)"));
                System.out.println(result1.getString("COUNT(*)"));
                array.add(arr);
            }
            result1.close();
            statement.executeQuery(str2);
            ResultSet result2 = statement.executeQuery(str2);
            while (result2.next())
            {
                ArrayList<String> arr = new ArrayList<>();
                arr.add(result2.getString("state"));
                System.out.println(result2.getString("state"));
                arr.add(result2.getString("COUNT(*)"));
                System.out.println(result2.getString("COUNT(*)"));
                a.add(arr);
            }
            for(int i=0 ; i<array.size() ; ++i)
            {
                for(int j=0 ; j<a.size() ; ++j)
                {
                    if(array.get(i).get(0) == a.get(j).get(0))
                    {
                        array.get(i).set(1,String.valueOf(Float.parseFloat(array.get(i).get(1)) / Float.parseFloat(a.get(j).get(1)) * 100));
                    }
                }
            }

        } catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
        return array;
    }

    public static ArrayList<ArrayList<String>> getVoteNumberByState()
    {
        ArrayList<ArrayList<String>> array = new ArrayList<>();
        try
        {
            Connection connection = Connecting.getDBConnection();
            Statement statement = connection.createStatement();
            String str1 = "SELECT state, COUNT(*) "
                    + "FROM voter "
                    + "WHERE candidate_email IS NOT NULL GROUP BY state";
            ResultSet result1 = statement.executeQuery(str1);
            while (result1.next())
            {
                ArrayList<String> arr = new ArrayList<>();
                arr.add(result1.getString("state"));
                arr.add(result1.getString("COUNT(*)"));
                array.add(arr);
            }
            result1.close();
        } catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
        return array;
    }

    public static ArrayList<ArrayList<String>> getVoteNumberByStateByCandidate(String email)
    {
        ArrayList<ArrayList<String>> array = new ArrayList<>();
        try
        {
            Connection connection = Connecting.getDBConnection();
            Statement statement = connection.createStatement();
            String str1 = "SELECT state, COUNT(*) "
                    + "FROM voter "
                    + "WHERE candidate_email = '" + email + "' GROUP BY state";
            ResultSet result1 = statement.executeQuery(str1);
            while (result1.next())
            {
                ArrayList<String> arr = new ArrayList<>();
                arr.add(result1.getString("state"));
                arr.add(result1.getString("COUNT(*)"));
                array.add(arr);
            }
            result1.close();
        } catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
        return array;
    }

    public static void addCandidate(String email, String password, String political_party, String first_name, String last_name)
    {
        try
        {
            Connection connection = Connecting.getDBConnection();
            Statement statement = connection.createStatement();
            String insertUser = "INSERT INTO user(u_email, u_password, u_first_name, u_last_name)"
                    + "VALUES"
                    + "('" + email + "', '" + password + "', '" + first_name + "', '" + last_name + "'); ";
            String insertCandidate = "INSERT INTO candidate(c_email, political_party)"
                    + "VALUES"
                    + "('" + email + "', '" + political_party + "');";
            statement.execute(insertUser);
            statement.close();
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
            String deleteUser = "DELETE FROM user "
                    + "WHERE u_email = '" + email + "'";
            String deleteCandidate = "DELETE FROM candidate "
                    + "WHERE c_email = '" + email + "'";
            statement.execute(deleteUser);
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
            String insertUser = "INSERT INTO user(u_email, u_password, u_first_name, u_last_name)"
                    + "VALUES"
                    + "('" + email + "', '" + password + "', '" + first_name + "', '" + last_name + "');";
            String insertVoter = "INSERT INTO voter(v_email, state)"
                    + "VALUES"
                    + "('" + email + "', '" + state + "');";
            statement.execute(insertUser);
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
            String deleteUser = "DELETE FROM user "
                    + "WHERE u_email = '" + email + "'";
            String deleteVoter = "DELETE FROM voter "
                    + "WHERE v_email = '" + email + "'";
            statement.execute(deleteUser);
            statement.execute(deleteVoter);
        } catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static ArrayList<String> getWinner() // à refaire
    {
        ArrayList<String> winners = new ArrayList<>();
        ArrayList<ArrayList<String>> voteNumberByCandidate = getVoteNumberByCandidate();
        float max = 0;
        for (int i = 0; i < voteNumberByCandidate.size(); ++i)
        {
            if (Float.parseFloat(voteNumberByCandidate.get(i).get(1)) > max)
            {
                max = Float.parseFloat(voteNumberByCandidate.get(i).get(1));
            }
        }
        for (int i = 0; i < voteNumberByCandidate.size(); ++i)
        {
            if (Float.parseFloat(voteNumberByCandidate.get(i).get(1)) >= max)
            {
                winners.add(voteNumberByCandidate.get(i).get(0));
            }
        }
        return winners;
    }
}
