import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

/**
 * This file is "Listing 15.2" out of ISBN: 0-13-222158-6
 */
public class ButtonDemo extends JFrame {
    //Create a panel for displaying message
    protected MessagePanel messagePanel = new MessagePanel("Welcome ot Java");

    //declare two buttons to move the message left and right
    private JButton jbtLeft = new JButton("<=");
    private JButton jbtRight = new JButton("=>");

    public static void main(String[] args) {
        ButtonDemo frame = new ButtonDemo();

        frame.setTitle("ButtonDemo");
        frame.setLocationRelativeTo(null); //center the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250, 100);
        frame.setVisible(true);
    }

    public ButtonDemo {
        //set the background color of messagePanel
        messagePanel.setBackground(Color.white);

        //create a panel jpButtons to hold two Buttons (right and left)
        JPanel jpButtons = new JPanel();
        jpButtons.setLayout(new FlowLayout());
        jpButtons.add(jbtLeft);
        jpButtons.add(jbtRight);

        //set keyboard mnemonics
        jbtLeft.setMnemonic('L');
        jbtRight.setMnemonic('R');

        //set icons and remove text
        //jbtLeft.setIcon(new ImageIcon("image/left.gif"));
        //jbtRight.setIcon(new ImageIcon("image/right.gif"));
        //jbtLeft.setText(null);
        //jbtRight.setText(null);

        //set tool tip text on buttons
        jbtLeft.setToolTipText("Move message to the Left");
        jbtRight.setToolTipText("Move message to the Right");

        //place panels in the frame
        this.setLayout(new BorderLayout());
        this.add(messagePanel, BorderLayout.CENTER);
        this.add(jpButtons, BorderLayout.SOUTH);

        //register anonymous listeners with the buttons
        jbtLeft.addActionListener(new ActionListener{
            public void actionPerformed(ActionEvent e) {
                messagePanel.moveLeft();
            }
        });
        jbtRight.addActionListener(new ActionListener{
            public void actionPerformed(ActionEvent e) {
                messagePanel.moveRight();
            }
        });
    }
}
