// A simple user interface used to add two numbers
// No error checking is done!!!!
// Responds to the enter key on the text2 field or the button

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.*;
import java.applet.*;

public class Jadder extends JApplet
  implements ActionListener
{
    JTextField text1, text2, answertext;
    JLabel pluslabel, info;
    JButton button1;

    public void init()
    {
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

        text2.addActionListener(this);

        button1 = new JButton("=");
        add(button1);

        // Subscribe for when the user clicks this
        button1.addActionListener(this);

        answertext = new JTextField(10);
        answertext.setEditable(false);
        add(answertext);
        setVisible(true);
        setSize(500,200);
    }

    // Listen for when the user presses the button


    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == text2)
        {
            answertext.setText("Use the equal button");
        }
        if (e.getSource() == button1) {
            try {
                // convert from text to integer and add
                int sum = Integer.parseInt(text1.getText()) +
                    Integer.parseInt(text2.getText());

                // convert the answer to a string and display
                answertext.setText(String.valueOf(sum));
                //answertext.setText(e.getActionCommand());
            }
            catch (NumberFormatException error) {
                URL scold = getClass().getResource("scream.aiff");
                AudioClip scream = Applet.newAudioClip(scold);
                scream.play();
                System.out.printf("Don't be Stoopiii_d...\n");
                answertext.setText("Invalid");
            }

        }
    }

    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        Jadder app = new Jadder();
        frame.add(app);
        app.init();

        frame.setSize(600, 150);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
