package Controller;

import java.sql.Blob;

public class Official extends User
{

    public enum VotingState
    {

        OPEN, PAUSED, CLOSED
    };
    private static VotingState votingState = VotingState.CLOSED;

    public Official(String email, String password, String first_name, String last_name, byte[] photo)
    {
        super(email, password, first_name, last_name, photo);
    }

    public static VotingState getVotingState()
    {
        return votingState;
    }

    public static void startVoting()
    {
        votingState = VotingState.OPEN;
    }

    public static void pauseVoting()
    {
        votingState = VotingState.PAUSED;
    }

    public static void finishVoting()
    {
        votingState = VotingState.CLOSED;
    }

    @Override
    public String toString()
    {
        return "official";
    }
}
