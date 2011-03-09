// ActionListener as an interface
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class SimpleEventDemo2 extends JFrame implements ActionListener{
  public SimpleEventDemo2() {
    JButton jbtOK = new JButton("OK");
    setLayout(new FlowLayout());
    add(jbtOK);

     jbtOK.addActionListener(this);
  }
 public void actionPerformed(ActionEvent e) {
    System.out.println("It is OK");
  }
 
  /** Main method */
  public static void main(String[] args) {
    JFrame frame = new SimpleEventDemo2();
    frame.setTitle("SimpleEventDemo2");
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(100, 80);
    frame.setVisible(true);
  }
}
