package Model;

import Controller.Candidate;
import Controller.Official;
import Controller.User;
import Controller.Voter;
import java.sql.*;
import java.util.ArrayList;

public class UserDAO
{

    private String user_email;
    private String user_password;
    private String user_first_name;
    private String user_last_name;
    private String user_political_party;
    private String user_state;
    private String user_candidate_email;

    public static int isCorrect(String email, String password)
    {
        try
        {
            Connection connection = Connecting.getDBConnection();
            Statement statement = connection.createStatement();
            String str = "SELECT * FROM user "
                    + "WHERE '" + email + "' = u_email";
            ResultSet result = statement.executeQuery(str);
            if(result.next())
            {
                result.close();
                String str1 = "SELECT u_password FROM user "
                            + "WHERE '" + email + "' = u_email";
                ResultSet result1 = statement.executeQuery(str1);
                if(result1.getString("u_password").equals(password))
                {
                    return 1;
                }
                else
                {
                    return 2;
                }
            }
            else
                return 3;
        } catch (SQLException e)
        {
            System.out.println(e.getMessage());
            return 0;
        }
    }
    public ArrayList<User> getUserByEmailAndPassword(String email, String password)
    {
        ArrayList<User> user = new ArrayList<>();
        try
        {
            Connection connection = Connecting.getDBConnection();
            Statement statement = connection.createStatement();
            String str0 = "SELECT * FROM user "
                    + "WHERE '" + email + "' = u_email";

            String str1 = "SELECT * FROM candidate "
                    + "WHERE '" + email + "' = c_email";
            String str2 = "SELECT * FROM voter "
                    + "WHERE '" + email + "' = v_email";
            String str3 = "SELECT * FROM official "
                    + "WHERE '" + email + "' = o_email";
            ResultSet result0 = statement.executeQuery(str0);
            while (result0.next())
            {
                user_email = result0.getString("u_email");
                user_password = result0.getString("u_password");
                user_first_name = result0.getString("u_first_name");
                user_last_name = result0.getString("u_last_name");
            }
            result0.close();
            ResultSet result1 = statement.executeQuery(str1);
            while (result1.next())
            {
                if (result1.getString("c_email").equals(email))
                {
                    user_political_party = result1.getString("political_party");
                    user.add(new Candidate(user_email, user_password, user_political_party, user_first_name, user_last_name));
                }
            }
            result1.close();
            ResultSet result2 = statement.executeQuery(str2);
            while (result2.next())
            {
                if (result2.getString("v_email").equals(email))
                {
                    System.out.println("a");
                    user_state = result2.getString("state");
                    user_candidate_email = result2.getString("candidate_email");
                    user.add(new Voter(user_email, user_password, user_first_name, user_last_name, user_state, user_candidate_email));
                }
            }
            result2.close();
            ResultSet result3 = statement.executeQuery(str3);
            while (result3.next())
            {
                if (result3.getString("o_email").equals(email))
                {
                    user.add(new Official(user_email, user_password, user_first_name, user_last_name));
                }
            }
            result3.close();
            return user;
        } catch (SQLException e)
        {
            System.out.println(e.getMessage());
            return null;
        }
    }

    /*public static ArrayList<String> userTypeByEmail(String email, String password) {
     try {
     // verifier que email et mot de passe sont corrects
     // return Candidate Voter Official
     ArrayList<String> userType = new ArrayList<>();
     Connection connection = Connecting.getDBConnection();
     Statement statement = connection.createStatement();
     String str1 = "SELECT c_email FROM candidate "
     + "WHERE '" + email + "' = c_email";
     String str2 = "SELECT v_email FROM voter "
     + "WHERE '" + email + "' = v_email";
     String str3 = "SELECT o_email FROM official "
     + "WHERE '" + email + "' = o_email";
     ResultSet result1 = statement.executeQuery(str1);
     while (result1.next()) {
     if (result1.getString(1).equals(email)) {
     userType.add("candidate");
     }
     }
     result1.close();
     ResultSet result2 = statement.executeQuery(str2);
     while (result2.next()) {
     if (result2.getString(1).equals(email)) {
     userType.add("voter");
     }
     }
     result2.close();
     ResultSet result3 = statement.executeQuery(str3);
     while (result3.next()) {
     if (result3.getString(1).equals(email)) {
     userType.add("official");
     }
     }
     result3.close();
     return userType;
     } catch (SQLException e) {
     System.out.println(e.getMessage());
     return null;
     }
     }*/
}