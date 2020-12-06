package View;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class CandidateProfileView extends JPanel
{
    JLabel JLabelEmail = new JLabel("email");
    JLabel JLabelFirst_name = new JLabel("first_name");
    JLabel JLabelLast_name = new JLabel("last_name");
    JLabel JLabelPolitical_party = new JLabel("political party");
    JLabel JLabelEmail1;
    JLabel JLabelFirst_name1;
    JLabel JLabelLast_name1;
    JLabel JLabelPolitical_party1;
    public CandidateProfileView(String email, String first_name, String last_name, String political_party)
    {
        super();
        this.JLabelEmail1 = new JLabel(email);
        this.JLabelFirst_name1 = new JLabel(first_name);
        this.JLabelLast_name1 = new JLabel(last_name);
        this.JLabelPolitical_party1 = new JLabel(political_party);
        this.add(JLabelEmail);
        this.add(JLabelFirst_name);
        this.add(JLabelLast_name);
        this.add(JLabelPolitical_party);
        this.add(JLabelEmail1);
        this.add(JLabelFirst_name1);
        this.add(JLabelLast_name1);
        this.add(JLabelPolitical_party1);
    }
}
