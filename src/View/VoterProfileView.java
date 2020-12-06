package View;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class VoterProfileView extends JPanel
{
    JLabel JLabelEmail = new JLabel("email");
    JLabel JLabelFirst_name = new JLabel("first_name");
    JLabel JLabelLast_name = new JLabel("last_name");
    JLabel JLabelState = new JLabel("state");
    JLabel JLabelEmail1;
    JLabel JLabelFirst_name1;
    JLabel JLabelLast_name1;
    JLabel JLabelState1;
    public VoterProfileView(String email, String first_name, String last_name, String state)
    {
        super();
        this.JLabelEmail1 = new JLabel(email);
        this.JLabelFirst_name1 = new JLabel(first_name);
        this.JLabelLast_name1 = new JLabel(last_name);
        this.JLabelState1 = new JLabel(state);
        this.add(JLabelEmail);
        this.add(JLabelFirst_name);
        this.add(JLabelLast_name);
        this.add(JLabelState);
        this.add(JLabelEmail1);
        this.add(JLabelFirst_name1);
        this.add(JLabelLast_name1);
        this.add(JLabelState1);
    }
}
