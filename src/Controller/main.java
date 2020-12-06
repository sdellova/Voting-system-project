package Controller;

import Model.Connecting;
import Model.UserDAO;
import View.ConnectionPageView;

public class main
{

    public static void main(String args[])
    {
        Connecting.initDB();
        
        UserDAO.getVotesNumberByCandidate("emmanuel.macron@mail.com");
        ConnectionPageView v = new ConnectionPageView();
        v.setVisible(true);
        
        //Connecting.deleteDB();
    }
}
