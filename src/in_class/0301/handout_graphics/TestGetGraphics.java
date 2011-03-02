import javax.swing.*;
import java.awt.Graphics;

public class TestGetGraphics extends JFrame {
  private JLabel jlblBanner = new JLabel("Banner");

  public TestGetGraphics() {
    add(jlblBanner);

  }

  public static void main(String[] args) {
    TestGetGraphics frame = new TestGetGraphics();
    frame.setTitle("TestGetGraphics");
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(200, 100);
    frame.setVisible(true);
    JOptionPane.showMessageDialog(null,
      "Delay on purpose\nClick OK to dismiss the dialog");
    Graphics graphics = frame.jlblBanner.getGraphics();
    graphics.drawLine(0, 0, 50, 50);
  }
}