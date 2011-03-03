import javax.swing.*;
import java.awt.*;

public class exGridLayout extends JFrame {
    //default constructor
    public exGridLayout() {
        this.setLayout(new GridLayout(1, 2));
        //panel top
        JPanel leftPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        leftPanel.add(new JButton("Button 1"));
        leftPanel.add(new JButton("Button 2"));
        leftPanel.add(new JButton("Button 3"));
        this.add(leftPanel);

        //panel bottom
        JPanel rightPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        rightPanel.add(new JButton("Button 4"));
        rightPanel.add(new JButton("Button 5"));
        rightPanel.add(new JButton("Button 6"));
        this.add(rightPanel);
    }

    //main
    public static void main(String[] argv) {
        //create frame
        exGridLayout fr = new exGridLayout();

        fr.setTitle("Example GridLayout, Assignment 12.3");
        fr.setLocationRelativeTo(null);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(700,100);
        fr.setVisible(true);
    }
}
