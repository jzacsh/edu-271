import javax.swing.*;
import java.awt.*;

public class exGridLayout extends JFrame {
    //default constructor
    public exGridLayout() {
        this.setLayout(new GridLayout(2, 3));
        //panel top
        this.add(new JButton("Button 1"));
        this.add(new JButton("Button 2"));
        this.add(new JButton("Button 3"));

        //panel bottom
        this.add(new JButton("Button 4"));
        this.add(new JButton("Button 5"));
        this.add(new JButton("Button 6"));
    }

    //main
    public static void main(String[] argv) {
        //create frame
        exGridLayout fr = new exGridLayout();

        fr.setTitle("Example GridLayout, Assignment 12.3");
        fr.setLocationRelativeTo(null);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(400,350);
        fr.setVisible(true);
    }
}
