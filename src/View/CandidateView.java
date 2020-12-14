package View;

import Controller.Candidate;
import Controller.User;
import Model.CandidateDAO;
import static Model.CandidateDAO.getCandidateByEmail;
import static Model.CandidateDAO.getCandidates;
import Model.OfficialDAO;
import Model.UserDAO;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

public class CandidateView extends javax.swing.JFrame
{

    private final User user;

    public CandidateView(User user)
    {
        this.user = user;
        initComponents();
        addRowToJTableCandidate();
        jPanelProfile.setVisible(false);
        jButtonViewScores.setVisible(false);
        jLabelnbVotes.setText(Integer.toString(OfficialDAO.getnbVotes()));
      
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
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Exit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCandidates = new javax.swing.JTable();
        jPanelProfile = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelFirst_name = new javax.swing.JLabel();
        jLabelPolitical_party = new javax.swing.JLabel();
        jLabelLast_name = new javax.swing.JLabel();
        jLabelVotesNumberReceived = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabelPhotoCandidate = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabelnbVotes = new javax.swing.JLabel();
        jButtonViewVotes = new javax.swing.JButton();

        jButtonViewScores = new javax.swing.JButton();

        jLabelVotingState = new javax.swing.JLabel();
        jLabelVState = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setForeground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Candidate");

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Candidates profiles :");

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

        jLabel7.setText("Number of votes received ");

        jLabelPhotoCandidate.setText("jLabel8");

        javax.swing.GroupLayout jPanelProfileLayout = new javax.swing.GroupLayout(jPanelProfile);
        jPanelProfile.setLayout(jPanelProfileLayout);
        jPanelProfileLayout.setHorizontalGroup(
            jPanelProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProfileLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelProfileLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelVotesNumberReceived, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelProfileLayout.createSequentialGroup()
                        .addGroup(jPanelProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelLast_name, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                            .addComponent(jLabelFirst_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanelProfileLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addComponent(jLabelPolitical_party, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanelProfileLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabelPhotoCandidate)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelProfileLayout.setVerticalGroup(
            jPanelProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProfileLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabelFirst_name, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanelProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabelLast_name, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanelProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabelPolitical_party, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanelProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelVotesNumberReceived, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jLabelPhotoCandidate)
                .addGap(15, 15, 15))
        );

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Number of votes :");

        jLabelnbVotes.setForeground(new java.awt.Color(255, 255, 255));

        jButtonViewVotes.setText("View scores by state");
        jButtonViewVotes.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
        jButtonViewVotes.setText("View votes");
        jButtonViewVotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewVotesActionPerformed(evt);
            }
        });


        jButtonViewScores.setText("View scores");
        jButtonViewScores.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonViewScoresActionPerformed(evt);
            }
        });

        jLabelVotingState.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabelVotingState.setForeground(new java.awt.Color(255, 255, 255));
        jLabelVotingState.setText("Voting State :");

        jLabelVState.setForeground(new java.awt.Color(255, 255, 255));
        jLabelVState.setText("jLabel8");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jButtonViewScores, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonViewVotes, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelnbVotes, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jPanelProfile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelVotingState)
                .addGap(18, 18, 18)
                .addComponent(jLabelVState)
                .addGap(162, 162, 162)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelVotingState)
                    .addComponent(jLabelVState))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelnbVotes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonViewVotes, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonViewScores))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelProfile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        ConnectionPageView C = new ConnectionPageView();
        C.setVisible(true);
        dispose();
    }//GEN-LAST:event_ExitActionPerformed

    private void jTableCandidatesMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jTableCandidatesMouseClicked
    {//GEN-HEADEREND:event_jTableCandidatesMouseClicked
        jPanelProfile.setVisible(true);
        jButtonViewScores.setVisible(true);
        jLabelFirst_name.setText(CandidateDAO.getCandidates().get(jTableCandidates.getSelectedRow()).getFirst_name());
        jLabelLast_name.setText(CandidateDAO.getCandidates().get(jTableCandidates.getSelectedRow()).getLast_name());
        jLabelPolitical_party.setText(CandidateDAO.getCandidates().get(jTableCandidates.getSelectedRow()).getPolitical_party());
        jLabelVotesNumberReceived.setText(String.valueOf(UserDAO.getVotesNumberByCandidate(CandidateDAO.getCandidates().get(jTableCandidates.getSelectedRow()).getEmail())));
    }//GEN-LAST:event_jTableCandidatesMouseClicked

    private void jButtonViewVotesActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonViewVotesActionPerformed
    {//GEN-HEADEREND:event_jButtonViewVotesActionPerformed
        DefaultPieDataset piedataset = new DefaultPieDataset();

        ArrayList<ArrayList<String>> VoterAndVotesNumberByCandidat = OfficialDAO.getVoteNumberByStateByCandidate(CandidateDAO.getCandidates().get(jTableCandidates.getSelectedRow()).getEmail());
        for (int i = 0; i < VoterAndVotesNumberByCandidat.size(); ++i)
        {
            piedataset.setValue(VoterAndVotesNumberByCandidat.get(i).get(0), Float.parseFloat(VoterAndVotesNumberByCandidat.get(i).get(1)));
        }
        JFreeChart pieChartN = ChartFactory.createPieChart("States proportions by candidate", piedataset, true, false, false);
        ((PiePlot) pieChartN.getPlot()).setLabelGenerator(new StandardPieSectionLabelGenerator(
                "{0}: {1} ({2})", new DecimalFormat("0"), new DecimalFormat("0%")));
        final ChartPanel cPanel2 = new ChartPanel(pieChartN);
        JDialog b = new JDialog();
        b.setTitle("States proportions by candidate");
        b.getContentPane().add(cPanel2);
        b.pack();
        b.setVisible(true);
    }//GEN-LAST:event_jButtonViewVotesActionPerformed

    private void jButtonViewScoresActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonViewScoresActionPerformed
    {//GEN-HEADEREND:event_jButtonViewScoresActionPerformed
        DefaultPieDataset piedataset = new DefaultPieDataset();
       
        ArrayList<ArrayList<String>> VoterAndVotesNumber = OfficialDAO.getVoteNumberByCandidate();
        
        for(int i=0 ; i < VoterAndVotesNumber.size() ; ++i)
        {
            Candidate cand = getCandidateByEmail(VoterAndVotesNumber.get(i).get(0));
            piedataset.setValue(cand.getFirst_name() + " " + cand.getLast_name(), Float.parseFloat(VoterAndVotesNumber.get(i).get(1)));
        }
        JFreeChart pieChartN = ChartFactory.createPieChart("Votes proportions by candidate", piedataset, true, false, false);
        ((PiePlot) pieChartN.getPlot()).setLabelGenerator(new StandardPieSectionLabelGenerator(
                "{0}: {1} ({2})", new DecimalFormat("0"), new DecimalFormat("0%")));
        final ChartPanel cPanel2 = new ChartPanel(pieChartN);
        JDialog b = new JDialog();
        b.setTitle("Votes proportions by candidate");
        b.getContentPane().add(cPanel2);
        b.pack();
	b.setVisible(true);
    }//GEN-LAST:event_jButtonViewScoresActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JLabel Photo;
    private javax.swing.JButton jButtonViewScores;
    private javax.swing.JButton jButtonViewVotes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelFirst_name;
    private javax.swing.JLabel jLabelLast_name;
    private javax.swing.JLabel jLabelPhotoCandidate;
    private javax.swing.JLabel jLabelPolitical_party;
    private javax.swing.JLabel jLabelVState;
    private javax.swing.JLabel jLabelVotesNumberReceived;
    private javax.swing.JLabel jLabelVotingState;
    private javax.swing.JLabel jLabelnbVotes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelProfile;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableCandidates;
    // End of variables declaration//GEN-END:variables

}
