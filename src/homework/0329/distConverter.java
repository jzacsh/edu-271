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
    protected JTextField milesInput;
    protected JTextField kilomInput;
    public static final double KILOMETER_IN_MILE = 1.609344;
    public static final double MILE_IN_KILOMETER = 0.621371192;

    //default constrcutor
    public distConverter() {
        this.setLayout(new BorderLayout(5, 2));

        //
        //build the panel needed for text inputs
        //
        JPanel input = new JPanel(new GridLayout(2, 1));
        milesInput = new JTextField();
        kilomInput = new JTextField("1"); //fill with default value "1"

        //register ourselves as listeners to events on the new input fields
        milesInput.addActionListener(this);
        kilomInput.addActionListener(this);

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
        double mi, km;
        double answer;
        if (e.getSource() == milesInput) {
            mi = Double.parseDouble(e.getActionCommand());
            km = this.milesCalc(mi);
            kilomInput.setText(Double.toString(km));
        }
        else if (e.getSource() == kilomInput) {
            km = Double.parseDouble(e.getActionCommand());
            mi = this.kilomCalc(km);
            milesInput.setText(Double.toString(mi));
        }
        else {
            //we snobbily reject the possibility that you can initiate anything
            //from elsewhere
            return;
        }
    }

    /**
     * Convert kilometers to miles.
     * @param double
     *   Kilometers to be converted
     * @return double
     *   Miles, equivilent in distance to km
     */
    public double kilomCalc(double km) {
        return MILE_IN_KILOMETER * km;
    }

    /**
     * Convert miles to kilometers.
     * @param double
     *   Miles to be converted
     * @return double
     *   Kilometers, equivilent in distance to mi
     */
    public double milesCalc(double mi) {
        return KILOMETER_IN_MILE * mi;
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
