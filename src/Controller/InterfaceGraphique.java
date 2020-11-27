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
  
   private JLabel j; 
   private int a; 
   
       public InterfaceGraphique ()
    {
        setTitle("Vous êtes de quelle catégorie ?"); // set the title
        
        setSize(WINDOW_WIDTH,WINDOW_HEIGTH); // set of the size of the window 
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //specify an action for the close button 
       
        BuildPanel(); // build the panel and add it to the frame
         
        add(panel); // add the panel to the frame's content pane
        
        setVisible(true); // display the window 
    }
       public void BuildPanel()
       {
           // create the label, text field and radio button
           j= new JLabel("what is your profil ?");
           button1 = new JButton("Voter");
           button2= new JButton("Candidate");
           button3 = new JButton("Official");
           
            radioButtonGroup = new ButtonGroup();
            radioButtonGroup.add(button1);
            radioButtonGroup.add(button2);
            radioButtonGroup.add(button3);
            
           
           add(j);
          panel = new JPanel(); 
          panel.add(button1);
          panel.add(button2);
          panel.add(button3);
           
           button1.addActionListener(new Choice());
           button2.addActionListener(new Choice());
           button3.addActionListener(new Choice());
           
           
           setVisible(true); 
           
       }
       public class Choice implements ActionListener 
       {
           @Override 
           public void actionPerformed(ActionEvent e)
           {
               remove (j);
               remove(button1 );
               remove (button2);
               remove (button3 );
               remove (button1); 
               if (button1.isSelected())
               {
                  Q1(); 
               }
               else if (button2.isSelected())
               {
                   Q2();
               }
               else if (button3.isSelected())
               {
                   Q3();
               }
               
           }
       }
           public void Q1()
           {
               j = new JLabel (" what is your candidate ?"); 
               button1  = new JButton("Macron"); 
               button2 = new JButton("Hollande "); 
               button3 = new JButton ("Sarkozi"); 
                
         radioButtonGroup = new ButtonGroup();
         radioButtonGroup.add(button1);
         radioButtonGroup.add(button2);
         radioButtonGroup.add(button3);
         
         
               add(j);
              panel = new JPanel(); 
          panel.add(button1);
          panel.add(button2);
          panel.add(button3); 
               button1.addActionListener(new ChoiceCandidate());
               button2.addActionListener(new ChoiceCandidate());
               button3.addActionListener(new ChoiceCandidate());
              
               setVisible(true); 
           }
           public class ChoiceCandidate implements ActionListener 
           {
               public void actionPerformed(ActionEvent e)
               {
                   remove(j); 
                   remove(button1 );
                   remove(button2);
                   remove(button3 );
                   remove(button1);
                   if (button1.isSelected())
                   {
                       JOptionPane.showMessageDialog(null,"your choice is Macron");
                   }
                   else if (button2.isSelected())
                   {
                        JOptionPane.showMessageDialog(null,"your choice is Hollande");
                   }else if (button3.isSelected())
                   {
                        JOptionPane.showMessageDialog(null,"your choice is Sarkozi");
                   }
               }
           }
           public void Q2()
           {
               
           }
           public void Q3()
           {
               
           }
      
     
      //public static void main(String[]args )
      //{
         // new InterfaceGraphique(); 
      //}        
}
