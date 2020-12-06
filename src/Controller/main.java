package Controller;

import Model.Connecting;
import Model.UserDAO;
import View.CandidateView;
import View.ConnectionPageView;
import View.VoterView;

public class main
{

    public static void main(String args[])
    {

        Connecting.initDB();
        
        UserDAO.getVotesNumberByCandidate("emmanuel.macron@mail.com");
        ConnectionPageView v = new ConnectionPageView();
        v.setVisible(true);
        
        Connecting.deleteDB();
    }
}
