package View;

import Controller.Candidate;
import Controller.Official;
import Model.CandidateDAO;
import static Model.CandidateDAO.getCandidates;
import Model.OfficialDAO;
import Model.UserDAO;
import Model.VoterDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class OfficialView extends javax.swing.JFrame {

    /**
     * Creates new form Official
     */
    public OfficialView() {
        initComponents();
        addRowToJTableCandidate();
        addRowToJTableVoter();
        jPanelProfileCandidates.setVisible(false);
        jPanelProfileVoters.setVisible(false);
    }

    public void addRowToJTableVoter()
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
        jButtonViewStatistics = new javax.swing.JButton();
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
        photo = new javax.swing.JLabel();
        jPanelProfileCandidates = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabelFirst_nameCandidate = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabelLast_nameCandidate = new javax.swing.JLabel();
        jLabelPolitical_partyCandidate = new javax.swing.JLabel();
        jLabelVotesNumberCandidate = new javax.swing.JLabel();
        Photo = new javax.swing.JLabel();

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

        jButtonViewStatistics.setText("View the statistics");
        jButtonViewStatistics.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonViewStatisticsActionPerformed(evt);
            }
        });

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

        photo.setText("jLabel11");

        javax.swing.GroupLayout jPanelProfileVotersLayout = new javax.swing.GroupLayout(jPanelProfileVoters);
        jPanelProfileVoters.setLayout(jPanelProfileVotersLayout);
        jPanelProfileVotersLayout.setHorizontalGroup(
            jPanelProfileVotersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProfileVotersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelProfileVotersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelProfileVotersLayout.createSequentialGroup()
                        .addGroup(jPanelProfileVotersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(photo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGroup(jPanelProfileVotersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelProfileVotersLayout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabelStateVoter, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                            .addGroup(jPanelProfileVotersLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelVoteForVoter, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(jPanelProfileVotersLayout.createSequentialGroup()
                        .addGroup(jPanelProfileVotersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelProfileVotersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelLast_nameVoter, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelProfileVotersLayout.createSequentialGroup()
                                .addComponent(jLabelFirst_nameVoter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())))))
        );
        jPanelProfileVotersLayout.setVerticalGroup(
            jPanelProfileVotersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProfileVotersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelProfileVotersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelProfileVotersLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabelFirst_nameVoter, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addGroup(jPanelProfileVotersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelProfileVotersLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addGroup(jPanelProfileVotersLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabelLast_nameVoter, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanelProfileVotersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelProfileVotersLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(photo, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                    .addGroup(jPanelProfileVotersLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabelStateVoter)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelVoteForVoter, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );

        jLabel6.setText("First name");

        jLabel7.setText("Last name");

        jLabel8.setText("Political party");

        jLabel10.setText("Number of votes");

        jLabelPolitical_partyCandidate.setText("jLabel2");

        jLabelVotesNumberCandidate.setText("jLabel11");

        Photo.setText("jLabel2");

        javax.swing.GroupLayout jPanelProfileCandidatesLayout = new javax.swing.GroupLayout(jPanelProfileCandidates);
        jPanelProfileCandidates.setLayout(jPanelProfileCandidatesLayout);
        jPanelProfileCandidatesLayout.setHorizontalGroup(
            jPanelProfileCandidatesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProfileCandidatesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelProfileCandidatesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelProfileCandidatesLayout.createSequentialGroup()
                        .addGroup(jPanelProfileCandidatesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8))
                        .addGroup(jPanelProfileCandidatesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelProfileCandidatesLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelVotesNumberCandidate, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelProfileCandidatesLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabelPolitical_partyCandidate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanelProfileCandidatesLayout.createSequentialGroup()
                        .addGroup(jPanelProfileCandidatesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(64, 64, 64)
                        .addGroup(jPanelProfileCandidatesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelProfileCandidatesLayout.createSequentialGroup()
                                .addComponent(jLabelFirst_nameCandidate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanelProfileCandidatesLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabelLast_nameCandidate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(jPanelProfileCandidatesLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(Photo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelProfileCandidatesLayout.setVerticalGroup(
            jPanelProfileCandidatesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProfileCandidatesLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanelProfileCandidatesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelFirst_nameCandidate, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelProfileCandidatesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabelLast_nameCandidate, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanelProfileCandidatesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabelPolitical_partyCandidate))
                .addGap(18, 18, 18)
                .addGroup(jPanelProfileCandidatesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelVotesNumberCandidate))
                .addGap(13, 13, 13)
                .addComponent(Photo, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPanelProfileVoters, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanelProfileCandidates, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButtonAddCandidate)
                                            .addComponent(jButtonDeleteCandidate, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButtonAddVoter, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButtonDeleteVoter, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonVotingBreak)
                            .addComponent(jButtonStartVote)
                            .addComponent(jButtonFinishVote)
                            .addComponent(jButtonWinner)
                            .addComponent(jButtonViewStatistics))
                        .addGap(38, 38, 38))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 634, Short.MAX_VALUE)
                        .addComponent(Exit)
                        .addGap(30, 30, 30))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jButtonAddCandidate, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jButtonDeleteCandidate, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jButtonStartVote)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonVotingBreak)
                        .addGap(4, 4, 4)
                        .addComponent(jButtonFinishVote)
                        .addGap(9, 9, 9)
                        .addComponent(jButtonViewStatistics)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonWinner))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanelProfileCandidates, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(100, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addComponent(jButtonAddVoter, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jButtonDeleteVoter, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(Exit)
                        .addGap(14, 14, 14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jPanelProfileVoters, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(22, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
        ConnectionPageView C = new ConnectionPageView();
        C.setVisible(true);
        dispose();
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
        ArrayList<String> winners = OfficialDAO.getWinner();
        for(int i=0 ; i < winners.size() ; ++i)
        {
            JOptionPane.showMessageDialog(null, CandidateDAO.getCandidateByEmail(winners.get(i)).getFirst_name() + " " + CandidateDAO.getCandidateByEmail(winners.get(i)).getLast_name() + " has won the election !");
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

    private void jButtonViewStatisticsActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonViewStatisticsActionPerformed
    {//GEN-HEADEREND:event_jButtonViewStatisticsActionPerformed
        StatisticsView s = new StatisticsView();
        s.setVisible(true);
    }//GEN-LAST:event_jButtonViewStatisticsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JLabel Photo;
    private javax.swing.JButton jButtonAddCandidate;
    private javax.swing.JButton jButtonAddVoter;
    private javax.swing.JButton jButtonDeleteCandidate;
    private javax.swing.JButton jButtonDeleteVoter;
    private javax.swing.JButton jButtonFinishVote;
    private javax.swing.JButton jButtonStartVote;
    private javax.swing.JButton jButtonViewStatistics;
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
    private javax.swing.JLabel photo;
    // End of variables declaration//GEN-END:variables
}
