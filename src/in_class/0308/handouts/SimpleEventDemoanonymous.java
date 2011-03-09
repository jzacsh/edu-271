// ActionListener as an anonymous class
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class SimpleEventDemoanonymous extends JFrame {
  public SimpleEventDemoanonymous() {
    JButton jbtOK = new JButton("OK");
    setLayout(new FlowLayout());
    add(jbtOK);

     jbtOK.addActionListener(
		 new ActionListener() {
		 public void actionPerformed(ActionEvent e) {
			System.out.println("It is OK");
		}
	 }
	 );
  
 
  }
 
  /** Main method */
  public static void main(String[] args) {
    JFrame frame = new SimpleEventDemoanonymous();
    frame.setTitle("SimpleEventDemo2");
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(100, 80);
    frame.setVisible(true);
  }
}
