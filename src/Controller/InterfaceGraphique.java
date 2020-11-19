/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import javax.swing.*; 
import java.awt.event.*;
import java.awt.*;

/**
 *
 * @author stanislasduval
 */
public class InterfaceGraphique extends JFrame
{
   private final int WINDOW_WIDTH = 3000; // window width
   private final int WINDOW_HEIGTH = 1500;// window heigth 
   private JTextField TextField; // a message to the user 
   private ButtonGroup radioButtonGroup; // to group radio buttons 
   private JPanel panel ;// holding panel 
   private JLabel messageLabel;  // a message to the user 
   private JButton button1; 
   private JButton button2;
   private JButton button3;
   
       public InterfaceGraphique ()
    {
        setTitle("Vous êtes de quelle catégorie ?"); // set the title
        
        setSize(WINDOW_WIDTH,WINDOW_HEIGTH); // set of the size of the window 
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //specify an action for the close button 
       
        BuildPanel(); // build the panel and add it to the frame
         
        add(panel); // add the panel to the frame's content pane
        
        setVisible(true); // display the window 
    }
       private void BuildPanel()
       {
           // create the label, text field and radio button
           
           button1 = new JButton("Voter");
           button2= new JButton("Candidate");
           button3 = new JButton("Official"); 
           
           // group the radio buttons
           
           radioButtonGroup= new ButtonGroup();
           radioButtonGroup.add(button1);
           radioButtonGroup.add(button2);
           radioButtonGroup.add(button3);
           
           // add action listeners to the radio button
           
           button1.addActionListener(new Choice());
           button2.addActionListener(new Choice());
           button3.addActionListener(new Choice());
           
           // add all button 
           
           panel = new JPanel();
           panel.add(button1);
           panel.add(button2);
           panel.add(button3);
           
       }
       public class Choice implements ActionListener 
       {
           @Override 
           public void actionPerformed(ActionEvent e)
           {
               if (e.getSource()== button1)
               {
                   // voir les infos sur les candidats et vote 
               }
               else  if (e.getSource()== button2)
              {
                  // infos sur les votes 
              } 
               else if (e.getSource()== button3)
               {
                   // voire le nb de vote, voire le candidat qui a le plus de vote, commencer le vote, pause et fin de vote 
               }
           }
       }
     
      public static void main(String[]args )
      {
          new InterfaceGraphique(); 
      }        
}
