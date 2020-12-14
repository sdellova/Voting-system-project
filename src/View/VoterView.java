package View;

import Controller.Candidate;
import Controller.Official;
import Controller.Official.VotingState;
import Controller.User;
import Model.CandidateDAO;
import static Model.CandidateDAO.getCandidates;
import Model.VoterDAO;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Seb
 */
public class VoterView extends javax.swing.JFrame
{

    private final User user;
    private Object ByteStreams;

    public void addRowToJTableCandidate()
    {
        DefaultTableModel model = (DefaultTableModel) jTableCandidates.getModel();
        model.setRowCount(0);
        ArrayList<Candidate> candidates = getCandidates();
        Object rowData[] = new Object[3];
        for (int i = 0; i < candidates.size(); i++)
        {
            rowData[0] = candidates.get(i).getFirst_name();
            rowData[1] = candidates.get(i).getLast_name();
            rowData[2] = candidates.get(i).getPolitical_party();
            model.addRow(rowData);
        }
        jTableCandidates.setVisible(true);
    }

    /**
     *
     * @param user
     */
    public VoterView(User user)
    {
        this.user = user;
        initComponents();
        jPanelProfile.setVisible(false);
        addRowToJTableCandidate();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonExit = new javax.swing.JButton();
        jButtonValidateCandidateChoice = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCandidates = new javax.swing.JTable();
        jPanelProfile = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelFirst_name = new javax.swing.JLabel();
        jLabelLast_name = new javax.swing.JLabel();
        jLabelPolitical_party = new javax.swing.JLabel();
        jLabelPhoto = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabelVotingState = new javax.swing.JLabel();
        jLabelVStates = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setForeground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Voter");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Candidates profiles :");

        jButtonExit.setText("EXIT");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        jButtonValidateCandidateChoice.setText("Vote");
        jButtonValidateCandidateChoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonValidateCandidateChoiceActionPerformed(evt);
            }
        });

        jTableCandidates.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "First name", "Last name", "Political party"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableCandidates.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCandidatesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableCandidates);

        jLabel3.setText("First name");

        jLabel4.setText("Last name");

        jLabel5.setText("Political party");

        jLabelPhoto.setText("jLabel7");

        javax.swing.GroupLayout jPanelProfileLayout = new javax.swing.GroupLayout(jPanelProfile);
        jPanelProfile.setLayout(jPanelProfileLayout);
        jPanelProfileLayout.setHorizontalGroup(
            jPanelProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProfileLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelProfileLayout.createSequentialGroup()
                        .addGroup(jPanelProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(28, 28, 28)
                        .addGroup(jPanelProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelLast_name, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                            .addComponent(jLabelFirst_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(4, 4, 4))
                    .addGroup(jPanelProfileLayout.createSequentialGroup()
                        .addComponent(jLabelPhoto)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelProfileLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelPolitical_party, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanelProfileLayout.setVerticalGroup(
            jPanelProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProfileLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanelProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelProfileLayout.createSequentialGroup()
                        .addGroup(jPanelProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabelLast_name, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3))
                    .addComponent(jLabelFirst_name, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanelProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabelPolitical_party, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jLabelPhoto)
                .addGap(27, 27, 27))
        );

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Candidates :");

        jLabelVotingState.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabelVotingState.setForeground(new java.awt.Color(255, 255, 255));
        jLabelVotingState.setText("Voting state:");

        jLabelVStates.setForeground(new java.awt.Color(255, 255, 255));
        jLabelVStates.setText("jLabel7");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelVotingState)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelVStates)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(131, 131, 131)
                                .addComponent(jButtonExit)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(412, 412, 412))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jPanelProfile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(334, 334, 334)
                .addComponent(jButtonValidateCandidateChoice)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelVotingState)
                        .addComponent(jLabelVStates)))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelProfile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonValidateCandidateChoice)
                    .addComponent(jButtonExit))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 8, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 846, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        ConnectionPageView C = new ConnectionPageView();
        C.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonExitActionPerformed


    private void jButtonValidateCandidateChoiceActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonValidateCandidateChoiceActionPerformed
    {//GEN-HEADEREND:event_jButtonValidateCandidateChoiceActionPerformed
        if (Official.getVotingState() == VotingState.OPEN)
        {
            if (VoterDAO.hasAlreadyVoted(user.getEmail()))
            {
                JOptionPane.showMessageDialog(null, "Impossible : you have already voted.");
            } else
            {
                if (jTableCandidates.getSelectedRowCount() > 0)
                {
                    int retour = JOptionPane.showConfirmDialog(null, "Your choice is definitive. Are you sure ?", "Vote confirmation", JOptionPane.YES_NO_OPTION);
                    if (retour == 0)
                    {
                        VoterDAO.castVote(CandidateDAO.getCandidates().get(jTableCandidates.getSelectedRow()).getEmail(), user.getEmail());
                    }
                }
            }
        }
        else if(Official.getVotingState() == VotingState.PAUSED)
        {
            JOptionPane.showMessageDialog(null, "The vote is paused.");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "The vote is closed. You can no longer vote.");
        }
    }//GEN-LAST:event_jButtonValidateCandidateChoiceActionPerformed

    private void jTableCandidatesMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jTableCandidatesMouseClicked
    {//GEN-HEADEREND:event_jTableCandidatesMouseClicked
        jPanelProfile.setVisible(true);
        jLabelFirst_name.setText(CandidateDAO.getCandidates().get(jTableCandidates.getSelectedRow()).getFirst_name());
        jLabelLast_name.setText(CandidateDAO.getCandidates().get(jTableCandidates.getSelectedRow()).getLast_name());
        jLabelPolitical_party.setText(CandidateDAO.getCandidates().get(jTableCandidates.getSelectedRow()).getPolitical_party());
        byte[] image = CandidateDAO.getCandidates().get(jTableCandidates.getSelectedRow()).getPhoto();
        Image img = Toolkit.getDefaultToolkit().createImage(image);
        jLabelPhoto.setIcon(new ImageIcon(img));
    }//GEN-LAST:event_jTableCandidatesMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonValidateCandidateChoice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelFirst_name;
    private javax.swing.JLabel jLabelLast_name;
    private javax.swing.JLabel jLabelPhoto;
    private javax.swing.JLabel jLabelPolitical_party;
    private javax.swing.JLabel jLabelVStates;
    private javax.swing.JLabel jLabelVotingState;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelProfile;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableCandidates;
    // End of variables declaration//GEN-END:variables

}
