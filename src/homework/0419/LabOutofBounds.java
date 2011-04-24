import javax.swing.*;
import java.awt.*;

/**
 * Jonathan Zacsh <jzacsh@gmail.com>
 * Comp 271 - Java
 * Lab #10; page 602; Exercise #17.3
 */

public class LabOutOfBounds implements ActionListener {
    //default constructor
    public LabOutOfBounds() {
        this.setLayout(new BorderLayout(10, 10));

        JPanel form = new JPanel(new GridLayout(2, 2));
        form.add(new JLabel("Array Index"));
//      form.add(); //@TODO: text field
        form.add(new JLabel("Array Element"));
//      form.add(); //@TODO: setWritable(false); textfield
    }

    public void actionPerformed(ActionEvent e) {
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
