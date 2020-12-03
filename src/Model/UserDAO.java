package Model;

import Controller.Candidate;
import java.sql.*;
import java.util.ArrayList;

public class UserDAO {

    public static ArrayList<String> userTypeByEmail(String email) {
        try {
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
    }
}
