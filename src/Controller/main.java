package Controller;

import Model.CandidateDAO;
import Model.Connecting;
import Model.OfficialDAO;
import Model.UserDAO;
import Model.VoterDAO;
import View.ConnectionPageView;
import java.util.ArrayList;

public class main
{

    public static void main(String args[])
    {
        Connecting.initDB();
        VoterDAO.castVote("emmanuel.macron@mail.com", "jeremie.beyou@mail.com");
        VoterDAO.castVote("emmanuel.macron@mail.com", "clarisse.cremer@mail.com");
        VoterDAO.castVote("jean.lassalle@mail.com", "charlie.dalin@mail.com");
        VoterDAO.castVote("jean.lassalle@mail.com", "alex.thomson@mail.com");
        System.out.println(VoterDAO.hasAlreadyVoted("alex.thomson@mail.com"));
        ConnectionPageView v = new ConnectionPageView();
        v.setVisible(true);
    }
}
