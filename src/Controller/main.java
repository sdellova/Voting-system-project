package Controller;

//import View.Interface_Graph;
import Model.Connecting;
import Model.OfficialDAO;
import Model.VoterDAO;

public class main
{
    public static void main(String args[])
   {
        Connecting.initDB();
        Voter lucas = new Voter("dhd@gmail", "fgsdz", "lucas", "fhdd", "arizona");
        Candidate macron = new Candidate("ddhiz@gmail", "dezce", "manu", "macron");
        Official off = new Official("dgyzd@gmail", "debzni", "luc", "alphan");
        off.finishVoting();
        VoterDAO voterDAO = new VoterDAO();
        voterDAO.castVote(macron, lucas);
        OfficialDAO officiel = new OfficialDAO();
        System.out.println(officiel.getWinner());
        Connecting.deleteDB();
       /* try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface_Graph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface_Graph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface_Graph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface_Graph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       /* java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface_Graph().setVisible(true);
            }
        });*/
   } 
}
