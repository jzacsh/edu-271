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
    public exButtons {
        super(); //usually implicitly called -- this created the mane frame
        exJPanel left  = new exJPanel();
        exJPanel right = new exJPanel();
        left.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));
        right.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));

        this.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));
    }
}

class exJPanel extends JPanel {
    //default constructor
    public exJPanel() {
        this.super(); //implied

        this.addButton("Button a");
        this.addButton("Button b");
        this.addButton("Button c");
    }

    //main
    public static void main(String[] argv) {
    }
}
