import java.awt.*;
import javax.swing.*;

public class examTwo extends JFrame {
    public examTwo() {
        this.setLayout(new BorderLayout(5, 5));

        //create panel
        JPanel Coins = new JPanel(new GridLayout(4, 1, 0, 3));

        Coins.add(new JButton("Nickel"));
        Coins.add(new JButton("Dime"));
        Coins.add(new JButton("Quarter"));
        Coins.add(new JButton("Return"));

        this.add(Coins, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        examTwo frame = new examTwo();

        frame.setTitle("Exam 2 - Problem #23");
        frame.setLocationRelativeTo(null);
        frame.setSize(300, 800);
        frame.setVisible(true);
    }
}
