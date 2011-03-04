import javax.swing.*;
import java.awt.*;

public class exBorderLayout extends JFrame {
    //default constructor
    public exBorderLayout() {
        //set the layout manager
        this.setLayout(new BorderLayout(5, 10));

        //create panels
        JPanel centerPanel = new JPanel(new BorderLayout(2, 5));
        JPanel bottomPanel = new JPanel(new BorderLayout(2, 5));

        centerPanel.add(new JButton("Button 1"), BorderLayout.WEST);
        centerPanel.add(new JButton("Button 2"), BorderLayout.CENTER);
        centerPanel.add(new JButton("Button 3"), BorderLayout.EAST);

        bottomPanel.add(new JButton("Button 4"), BorderLayout.WEST);
        bottomPanel.add(new JButton("Button 5"), BorderLayout.CENTER);
        bottomPanel.add(new JButton("Button 6"), BorderLayout.EAST);

        //insert panels
        this.add(centerPanel, BorderLayout.CENTER);
        this.add(bottomPanel, BorderLayout.SOUTH);
    }

    public static void main(String[] argv) {
        exBorderLayout frame = new exBorderLayout();

        frame.setTitle("ShowBorderLayout");
        frame.setLocationRelativeTo(null); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 200);
        frame.setVisible(true);
    }
}
