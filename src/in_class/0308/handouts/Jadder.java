// A simple user interface used to add two numbers
// No error checking is done!!!!

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Jadder extends JFrame
   //  implement action listener so we can respond to the user
{
    JTextField text1, text2, answertext;
    JLabel pluslabel, info;
    JButton button1;
    Container c;

    public Jadder()
    {
        super("Adder");
        // Set up an area to work on
        
        setLayout(new FlowLayout()); // One component after another from left to right

        // Now create some items to display to the user

        info = new JLabel("              Enter two numbers to add, then press the = button                        ");
        add(info);
        text1 = new JTextField(10);
        add(text1);

        pluslabel = new JLabel("+");
        add(pluslabel);
    
        text2 = new JTextField(10);
        add(text2);
        
        button1 = new JButton("=");
        add(button1);
    
        // Subscribe for when the user clicks the button
    
        answertext = new JTextField(10);
        answertext.setEditable(false);
        add(answertext);

        setSize(350, 150);
        setVisible(true);
        
    }

    // Listen for when the user presses the button
    

    public static void main( String args[])
    {
        Jadder app = new Jadder();

        app.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    }


}
