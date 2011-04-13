import java.awt.*;
import javax.swing.*;

public class examTwo extends JFrame {
    public examTwo() {
        this.setLayout(new GridLayout(4, 1, 0, 3));

        //create panel
        JPanel Coins = new JPanel();

        Coins.add(new JButton("Nickel"));
        Coins.add(new JButton("Dime"));
        Coins.add(new JButton("Quarter"));
        Coins.add(new JButton("Return"));

        this.add(Coins);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setTitle("Exam 2 - Problem #23");
        frame.setLocationRelativeTo(null);
        frame.setSize(300, 1200);
        frame.setVisible(true);
    }
}
