import javax.swing.*;
import java.awt.*;

/**
 * 12.4
 * (Using JPanel to group buttons) Rewrite the preceding program to create the
 * same user interface. Instead of creating buttons and panels separately, define
 * a class that extends the JPanel class. Place three buttons in your panel
 * class, and create two panels from the user-defined panel class.
 */

public class exButtons extends JFrame {
    //default constructor.
    public exButtons() {
        super(); //usually implicitly called -- this created the mane frame

        //set the main frame.
        this.setLayout(new FlowLayout(FlowLayout.CENTER));

        //
        //set the needed button-panels
        //
        exJPanel buttonsLeft  = new exJPanel();
        buttonsLeft.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 5));
        this.add(buttonsLeft);

        exJPanel buttonsRight = new exJPanel();
        buttonsRight.setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 5));
        this.add(buttonsRight);
    }

    public static void main(String[] argv) {
        exButtons butts = new exButtons();

        butts.setTitle("Example Panel Class, Assignment 12.4");
        butts.setLocationRelativeTo(null);
        butts.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        butts.setSize(800, 90);
        butts.setVisible(true);
    }
}

class exJPanel extends JPanel {
    //default constructor
    public exJPanel() {
        super(); //implied

        JPanel pane = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 5));

        //for educational sake, i'm explicitly specifying `this` namespace. i'm
        //aware that this is assumed, regardless.
        pane.add(new JButton("Button a"));
        pane.add(new JButton("Button b"));
        pane.add(new JButton("Button c"));

        this.add(pane);
    }

    //main
    public static void main(String[] argv) {
    }
}
