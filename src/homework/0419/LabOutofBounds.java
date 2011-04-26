import java.util.Formatter;
import java.lang.Math;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Jonathan Zacsh <jzacsh@gmail.com>
 * Comp 271 - Java
 * Lab #10; page 602; Exercise #17.3
 */

public class LabOutofBounds extends JFrame implements ActionListener {
    private JTextField userArrayIndex;
    private JTextField resultArrayElement;
    private int[] dataSelection = new int[100]; // 100 random ints

    //default constructor
    public LabOutofBounds() {
        //basics
        this.setLayout(new BorderLayout(10, 10));
        this.randomlyChosenInts(this.dataSelection);

        JPanel form = new JPanel(new GridLayout(2, 2));

        //input field
        form.add(new JLabel("Array Index"));
        this.userArrayIndex = new JTextField();
        this.userArrayIndex.setEditable(true);
        form.add(this.userArrayIndex);

        //output field
        form.add(new JLabel("Array Element"));
        this.resultArrayElement = new JTextField();
        this.resultArrayElement.setEditable(false);
        form.add(this.resultArrayElement);

        this.add(form, BorderLayout.CENTER);

        JButton showButton = new JButton("Show Element");
        showButton.addActionListener(this);
        this.add(showButton, BorderLayout.SOUTH);
    }

    /**
     * Generate an array of randomly chosen integers.
     *
     * @note: i'm *pretty* sure java passes arrays by reference. otherwise we
     * need to have a sig. like, public static int[] method(quantity)
     *
     * @param fillMeUp
     *   array of integers to be overwritten.
     */
    public static void randomlyChosenInts(int[] fillMeUp) {
        for (int i = 0; i < fillMeUp.length; i++) {
            fillMeUp[i] = (int) (Math.random() * 1000);
        }
    }

    /**
     * Event handler to fetch the element at the user's chosen index.
     */
    public void actionPerformed(ActionEvent e) {
        try {
            int userChosenIndex = (int) Integer.parseInt(this.userArrayIndex.getText());
            int userChosenElement = this.dataSelection[userChosenIndex];
            this.resultArrayElement.setText(Integer.toString(userChosenElement));
        }
        catch (NumberFormatException numExcept) {
            this.resultArrayElement.setText("Not a Number");
        }
        catch (IndexOutOfBoundsException boundExcept) {
            Formatter boundsError = new Formatter();
            boundsError.format("Limit: [%d - %d]", 0, this.dataSelection.length);
            this.resultArrayElement.setText(boundsError.toString());
        }
    }

    public static void main(String[] args) {
        LabOutofBounds frame = new LabOutofBounds();
        frame.setTitle("Lab #10");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
