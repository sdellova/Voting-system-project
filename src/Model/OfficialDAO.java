package Model;

import Controller.Candidate;
import Controller.Voter;
import java.sql.*;
import java.util.ArrayList;

public class OfficialDAO {

    public void addCandidate(String email, String password, String political_party, String first_name, String last_name) {
        try {
            Connection connection = Connecting.getDBConnection();
            Statement statement = connection.createStatement();
            String insertCandidate = "INSERT INTO candidate(email, password, politicalparty, firstname, lastname)"
                    + "VALUES"
                    + "('" + email + "', '" + password + "', '" + political_party + "', '" + first_name + "', '" + first_name + "');";
            statement.execute(insertCandidate);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteCandidate(Candidate candidate) {
        try {
            Connection connection = Connecting.getDBConnection();
            Statement statement = connection.createStatement();
            String deleteCandidate = "DELETE FROM candidate"
                    + "WHERE email = " + candidate.getEmail();
            statement.execute(deleteCandidate);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void addVoter(String email, String password, String first_name, String last_name, String state) {
        try {
            Connection connection = Connecting.getDBConnection();
            Statement statement = connection.createStatement();
            String insertVoter = "INSERT INTO voter(email, password, firstname, lastname, state)"
                    + "VALUES"
                    + "('" + email + "', '" + password + "', '" + first_name + "', '" + last_name + "', '" + state + "');";
            statement.execute(insertVoter);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteVoter(Voter voter) {
        try {
            Connection connection = Connecting.getDBConnection();
            Statement statement = connection.createStatement();
            String deleteVoter = "DELETE FROM voter"
                    + "WHERE email = " + voter.getEmail();
            statement.execute(deleteVoter);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<Candidate> getWinner() {
        try {
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
            while (result.next()) {
                winners.add(CandidateDAO.getCandidateByEmail(result.getString(1)));
            }

            return winners;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
