package View;

import Controller.Candidate;
import Controller.Official;
import Model.CandidateDAO;
import Model.OfficialDAO;
import Model.UserDAO;
import Model.VoterDAO;
import java.util.ArrayList;

public class OfficialView extends javax.swing.JFrame {

    /**
     * Creates new form Official
     */
    public OfficialView() {
        initComponents();
        jPanelProfileCandidates.setVisible(false);
        jPanelProfileVoters.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Exit = new javax.swing.JButton();
        jButtonAddCandidate = new javax.swing.JButton();
        jButtonDeleteCandidate = new javax.swing.JButton();
        jButtonStartVote = new javax.swing.JButton();
        jButtonFinishVote = new javax.swing.JButton();
        jButtonVotingBreak = new javax.swing.JButton();
        jButtonAddVoter = new javax.swing.JButton();
        jButtonDeleteVoter = new javax.swing.JButton();
        jButtonWinner = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableVoters = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableCandidates = new javax.swing.JTable();
        jPanelProfileVoters = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelFirst_nameVoter = new javax.swing.JLabel();
        jLabelLast_nameVoter = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabelVoteForVoter = new javax.swing.JLabel();
        jLabelStateVoter = new javax.swing.JLabel();
        jPanelProfileCandidates = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabelFirst_nameCandidate = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabelLast_nameCandidate = new javax.swing.JLabel();
        jLabelPolitical_partyCandidate = new javax.swing.JLabel();
        jLabelVotesNumberCandidate = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Official");

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ExitActionPerformed(evt);
            }
        });

        jButtonAddCandidate.setText("Add a candidate");
        jButtonAddCandidate.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonAddCandidateActionPerformed(evt);
            }
        });

        jButtonDeleteCandidate.setText("Delete a candidate");
        jButtonDeleteCandidate.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonDeleteCandidateActionPerformed(evt);
            }
        });

        jButtonStartVote.setText("Start vote");
        jButtonStartVote.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonStartVoteActionPerformed(evt);
            }
        });

        jButtonFinishVote.setText("Finish Vote");
        jButtonFinishVote.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonFinishVoteActionPerformed(evt);
            }
        });

        jButtonVotingBreak.setText("Voting Break");
        jButtonVotingBreak.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonVotingBreakActionPerformed(evt);
            }
        });

        jButtonAddVoter.setText("Add a voter");
        jButtonAddVoter.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonAddVoterActionPerformed(evt);
            }
        });

        jButtonDeleteVoter.setText("Delete a voter");
        jButtonDeleteVoter.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonDeleteVoterActionPerformed(evt);
            }
        });

        jButtonWinner.setText("Declare the winner");
        jButtonWinner.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonWinnerActionPerformed(evt);
            }
        });

        jButton1.setText("View the statistics");

        jTableVoters.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String []
            {
                "First name", "Last name", "Political party"
            }
        )
        {
            boolean[] canEdit = new boolean []
            {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        jTableVoters.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jTableVotersMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableVoters);

        jTableCandidates.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String []
            {
                "First name", "Last name", "Political party"
            }
        )
        {
            boolean[] canEdit = new boolean []
            {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        jTableCandidates.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jTableCandidatesMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableCandidates);

        jLabel3.setText("First name");

        jLabel4.setText("Last name");

        jLabel5.setText("State");

        jLabel9.setText("Vote for");

        jLabelStateVoter.setText("jLabel2");

        javax.swing.GroupLayout jPanelProfileVotersLayout = new javax.swing.GroupLayout(jPanelProfileVoters);
        jPanelProfileVoters.setLayout(jPanelProfileVotersLayout);
        jPanelProfileVotersLayout.setHorizontalGroup(
            jPanelProfileVotersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProfileVotersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelProfileVotersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelProfileVotersLayout.createSequentialGroup()
                        .addGroup(jPanelProfileVotersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProfileVotersLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(32, 32, 32))
                            .addGroup(jPanelProfileVotersLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(33, 33, 33)))
                        .addGroup(jPanelProfileVotersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelFirst_nameVoter, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelLast_nameVoter, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelProfileVotersLayout.createSequentialGroup()
                        .addGroup(jPanelProfileVotersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel5))
                        .addGap(25, 25, 25)
                        .addGroup(jPanelProfileVotersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelStateVoter)
                            .addComponent(jLabelVoteForVoter, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelProfileVotersLayout.setVerticalGroup(
            jPanelProfileVotersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProfileVotersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelProfileVotersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabelFirst_nameVoter, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanelProfileVotersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabelLast_nameVoter, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanelProfileVotersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelProfileVotersLayout.createSequentialGroup()
                        .addGroup(jPanelProfileVotersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabelStateVoter))
                        .addGap(35, 35, 35)
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelProfileVotersLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabelVoteForVoter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jLabel6.setText("First name");

        jLabel7.setText("Last name");

        jLabel8.setText("Political party");

        jLabel10.setText("Number of votes");

        jLabelPolitical_partyCandidate.setText("jLabel2");

        jLabelVotesNumberCandidate.setText("jLabel11");

        javax.swing.GroupLayout jPanelProfileCandidatesLayout = new javax.swing.GroupLayout(jPanelProfileCandidates);
        jPanelProfileCandidates.setLayout(jPanelProfileCandidatesLayout);
        jPanelProfileCandidatesLayout.setHorizontalGroup(
            jPanelProfileCandidatesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProfileCandidatesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelProfileCandidatesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelProfileCandidatesLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelFirst_nameCandidate, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(jPanelProfileCandidatesLayout.createSequentialGroup()
                        .addGroup(jPanelProfileCandidatesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelProfileCandidatesLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(33, 33, 33)
                                .addComponent(jLabelLast_nameCandidate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanelProfileCandidatesLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelPolitical_partyCandidate))
                            .addGroup(jPanelProfileCandidatesLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelVotesNumberCandidate)
                                .addGap(0, 63, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanelProfileCandidatesLayout.setVerticalGroup(
            jPanelProfileCandidatesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProfileCandidatesLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanelProfileCandidatesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelProfileCandidatesLayout.createSequentialGroup()
                        .addGroup(jPanelProfileCandidatesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelFirst_nameCandidate, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(jLabel7))
                    .addComponent(jLabelLast_nameCandidate, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelProfileCandidatesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabelPolitical_partyCandidate))
                .addGroup(jPanelProfileCandidatesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelProfileCandidatesLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelProfileCandidatesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelVotesNumberCandidate)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Exit, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanelProfileCandidates, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanelProfileVoters, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jButtonDeleteCandidate)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jButtonAddCandidate)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jButtonAddVoter, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jButtonDeleteVoter))))
                                        .addGap(61, 61, 61)
                                        .addComponent(jButtonWinner))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(99, 99, 99)
                                        .addComponent(jButton1)))))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonStartVote)
                                .addGap(21, 21, 21))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(103, 103, 103)
                                        .addComponent(jButtonVotingBreak))
                                    .addComponent(jButtonFinishVote, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(20, 20, 20))))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(507, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonStartVote)
                        .addGap(14, 14, 14)
                        .addComponent(jButtonVotingBreak))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jButtonFinishVote)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonWinner))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanelProfileCandidates, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButtonAddVoter, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButtonDeleteVoter))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonAddCandidate, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jButtonDeleteCandidate, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(jButton1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanelProfileVoters, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(210, 210, 210)
                .addComponent(Exit)
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(80, 80, 80)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(426, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void jButtonAddCandidateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddCandidateActionPerformed
        AddCandidateView a = new AddCandidateView();
        a.setVisible(true);
    }//GEN-LAST:event_jButtonAddCandidateActionPerformed

    private void jButtonDeleteCandidateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteCandidateActionPerformed
        DeleteCandidateView a = new DeleteCandidateView();
        a.setVisible(true);
    }//GEN-LAST:event_jButtonDeleteCandidateActionPerformed

    private void jButtonStartVoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStartVoteActionPerformed
        Official.startVoting();
    }//GEN-LAST:event_jButtonStartVoteActionPerformed

    private void jButtonFinishVoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinishVoteActionPerformed
        Official.finishVoting();
    }//GEN-LAST:event_jButtonFinishVoteActionPerformed

    private void jButtonVotingBreakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVotingBreakActionPerformed
        Official.pauseVoting();
    }//GEN-LAST:event_jButtonVotingBreakActionPerformed

    private void jButtonAddVoterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddVoterActionPerformed
        AddVoterView a = new AddVoterView();
        a.setVisible(true);
    }//GEN-LAST:event_jButtonAddVoterActionPerformed

    private void jButtonDeleteVoterActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonDeleteVoterActionPerformed
    {//GEN-HEADEREND:event_jButtonDeleteVoterActionPerformed
        DeleteVoterView a = new DeleteVoterView();
        a.setVisible(true);
    }//GEN-LAST:event_jButtonDeleteVoterActionPerformed

    private void jButtonWinnerActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonWinnerActionPerformed
    {//GEN-HEADEREND:event_jButtonWinnerActionPerformed
        ArrayList<Candidate> winners = OfficialDAO.getWinner();
        for(int i=0 ; i < winners.size() ; ++i)
        {
            CandidateProfileView candidateProfile = new CandidateProfileView(winners.get(i).getEmail(), winners.get(i).getFirst_name(), winners.get(i).getLast_name(), winners.get(i).getPolitical_party());
            candidateProfile.setVisible(true);
        }
    }//GEN-LAST:event_jButtonWinnerActionPerformed

    private void jTableVotersMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jTableVotersMouseClicked
    {//GEN-HEADEREND:event_jTableVotersMouseClicked
        jPanelProfileVoters.setVisible(true);
        jLabelFirst_nameVoter.setText(VoterDAO.getVoters().get(jTableVoters.getSelectedRow()).getFirst_name());
        jLabelLast_nameVoter.setText(VoterDAO.getVoters().get(jTableVoters.getSelectedRow()).getLast_name());
        jLabelStateVoter.setText(VoterDAO.getVoters().get(jTableVoters.getSelectedRow()).getState());
        jLabelVoteForVoter.setText(VoterDAO.getVoters().get(jTableVoters.getSelectedRow()).getCandidate_email());
    }//GEN-LAST:event_jTableVotersMouseClicked

    private void jTableCandidatesMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jTableCandidatesMouseClicked
    {//GEN-HEADEREND:event_jTableCandidatesMouseClicked
        jPanelProfileCandidates.setVisible(true);
        jLabelFirst_nameCandidate.setText(CandidateDAO.getCandidates().get(jTableVoters.getSelectedRow()).getFirst_name());
        jLabelLast_nameCandidate.setText(CandidateDAO.getCandidates().get(jTableVoters.getSelectedRow()).getLast_name());
        jLabelPolitical_partyCandidate.setText(CandidateDAO.getCandidates().get(jTableVoters.getSelectedRow()).getPolitical_party());
        jLabelVotesNumberCandidate.setText(String.valueOf(UserDAO.getVotesNumberByCandidate(CandidateDAO.getCandidates().get(jTableVoters.getSelectedRow()).getEmail())));
    }//GEN-LAST:event_jTableCandidatesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAddCandidate;
    private javax.swing.JButton jButtonAddVoter;
    private javax.swing.JButton jButtonDeleteCandidate;
    private javax.swing.JButton jButtonDeleteVoter;
    private javax.swing.JButton jButtonFinishVote;
    private javax.swing.JButton jButtonStartVote;
    private javax.swing.JButton jButtonVotingBreak;
    private javax.swing.JButton jButtonWinner;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelFirst_nameCandidate;
    private javax.swing.JLabel jLabelFirst_nameVoter;
    private javax.swing.JLabel jLabelLast_nameCandidate;
    private javax.swing.JLabel jLabelLast_nameVoter;
    private javax.swing.JLabel jLabelPolitical_partyCandidate;
    private javax.swing.JLabel jLabelStateVoter;
    private javax.swing.JLabel jLabelVoteForVoter;
    private javax.swing.JLabel jLabelVotesNumberCandidate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelProfileCandidates;
    private javax.swing.JPanel jPanelProfileVoters;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableCandidates;
    private javax.swing.JTable jTableVoters;
    // End of variables declaration//GEN-END:variables
}
