package Model;

import Controller.Candidate;
import Controller.Voter;
import java.sql.*;

public class VoterDAO {

    public void castVote(Candidate candidate, Voter voter) {
        if(voter.getHasAlreadyVoted())
            return;
        else
        {
        try {
            Connection connection = Connecting.getDBConnection();
            Statement statement = connection.createStatement();
            String insertVote = "INSERT INTO candidate_voter(candidate_email, voter_email)"
                    + "VALUES"
                    + "('" + candidate.getEmail() + "'" + ", '" + voter.getEmail() + "');";
            statement.execute(insertVote);
            voter.setHasAlreadyVoted(true);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        }
    }
}
