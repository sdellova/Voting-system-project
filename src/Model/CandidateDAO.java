package Model;

import Controller.Candidate;
import java.sql.*;

public class CandidateDAO {

    public static Candidate getCandidateByEmail(String email) {
        try {
            Connection connection = Connecting.getDBConnection();
            Statement statement = connection.createStatement();
            String getCandidate = "SELECT * FROM candidate "
                               + "WHERE c_email = '" + email + "'";
            ResultSet result = statement.executeQuery(getCandidate);
            while (result.next()) {
                return (new Candidate(email, result.getString("c_password"), result.getString("political_party"), result.getString("c_firstname"), result.getString("c_lastname")));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
