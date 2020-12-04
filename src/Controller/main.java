package Controller;

//import View.Interface_Graph;
import Model.Connecting;
import Model.UserDAO;

public class main
{
    public static void main(String args[])
   {
        Connecting.initDB();
<<<<<<< HEAD
        //System.out.println(UserDAO.isCorrect("emmanuel.macron@mail.com", "abcdef"));
=======
        System.out.println(UserDAO.userTypeByEmail("emmanel.macron@mail.com").get(0));
>>>>>>> parent of 49d5b0c... a
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
