import javax.swing.*;
import java.awt.event.*;
import java.awt.Panel;
import java.awt.GridLayout;
import java.awt.BorderLayout;

/**
 *  Jonathan Zacsh
 *
 *  Lab 7; Exercise 15.5
 *  pg 527; #15.5
 */

public class distConverter extends JFrame implements ActionListener {
    //default constrcutor
    public distConverter() {
        this.setLayout(new BorderLayout(5, 2));

        //
        //build the panel needed for text inputs
        //
        JPanel input = new JPanel(new GridLayout(2, 1));
        JTextField milesInput = new JTextField();
        JTextField kilomInput = new JTextField("1"); //fill with default value "1"

        //register ourselves as listeners to events on the new input fields
        //@TODO: set custom calculation methods here.
        milesInput.addActionListener(this); //@TODO: this is the key to this lab
        kilomInput.addActionListener(this); //@TODO: this is the key to this lab

        //add the text fields to their panel
        input.add(milesInput);
        input.add(kilomInput);

        //add the panel to the right side of the frame
        this.add(input, BorderLayout.CENTER);

        //
        //build the panel needed for labels
        //
        JPanel label = new JPanel(new GridLayout(2, 1));
        JLabel milesLabel = new JLabel("Miles");
        JLabel kilomLabel = new JLabel("Kilometers");

    //  @TODO: find out what setLabelFor() is used for
    //  //associate the labels with the corresponding text fields.
    //  milesLabel.setLabelFor(milesInput);
    //  kilomLabel.setLabelFor(kilomInput);

        //add the labels to their panel
        label.add(milesLabel);
        label.add(kilomLabel);

        //add the panel to the left side of the frame
        this.add(label, BorderLayout.WEST);
    }

    //interface for event listener
    public void actionPerformed(ActionEvent e) {
        System.out.printf("Data, '%s' received from: '%s'.\n", e.getActionCommand(), e.getSource());
    }

    //main
    public static void main(String[] argv) {
        distConverter frame = new distConverter();

        frame.setTitle("Exercise 15.5; mi. to km. Converter");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 200);
        frame.setVisible(true);
    }
}
