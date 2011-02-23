import javax.swing.*;
import java.awt.*;

/**
 * +-------------------------------------------+
 * | Invoice                             _ O X |
 * |-------------------------------------------|
 * |                                           |
 * |  Sub Total      [________________]        |
 * |  Discount %     [________________]        |
 * |  Invoice Total  [________________]        |
 * |-------------------------------------------|
 * |      [ calculate ]        [ exit ]        |
 * +-------------------------------------------+
 */

public class Invoice extends JFrame {
    public Invoice() {
        // set GridLayout: 3 rows, 2 columsns, gaps 5  between compontents
        // horiz and vert
        JPanel inv = new JPanel();
        inv.setLayout(new GridLayout(3, 0, 5, 5));

        //add labels and text fields to the frame
        inv.add(new JLabel("Sub Total"));
        inv.add(new JTextField(8));
        inv.add(new JLabel("Discount %"));
        inv.add(new JTextField(8));
        inv.add(new JLabel("Invoice Total"));
        inv.add(new JTextField(8));

        //set the buttom section
        setLayout(new BorderLayout(5, 5));
        this.add(inv, BorderLayout.CENTER);
        JPanel buttons = new JPanel(); //implicitly FlowLayout

        //add buttons
        JButton calc = new JButton("Calculate");
        JButton exit = new JButton("Exit");
        buttons.add(calc);
        buttons.add(exit);

        //@TODO: make this work:
        exit.addWindowListener(
            new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                        System.exit(0);
                }
            }
        );

        this.add(buttons, BorderLayout.SOUTH);
    }

    //main method
    public static void main(String[] argv) {
        Invoice frame = new Invoice();
        frame.setTitle("Invoice");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 125);
        frame.setVisible(true);

        Dimension dim = new Dimension(200, 125);
        frame.setMinimumSize(dim);
    }
}
