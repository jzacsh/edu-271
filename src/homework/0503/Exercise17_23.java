import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.net.*;
import java.io.*; //for Thread class

public class Exercise17_23 extends JApplet {
  public Exercise17_23() {
    URL imageURL = this.getClass().getResource("uk.gif");
    Image image = new ImageIcon(imageURL).getImage();
    this.add(new FlagAnthemPanel(image));
  }

  public static class FlagAnthemPanel extends JPanel implements ActionListener {
    private Image image;
    private Timer timer = new Timer(400, this);
    int x = 20;
    int y = 150;

    public FlagAnthemPanel(Image image) {
      this.image = image;
      timer.start();

      URL audioURL = this.getClass().getResource("uk.mid");
      AudioClip audioClip = Applet.newAudioClip(audioURL);
      audioClip.play();

    }

    public void paintComponent(Graphics g) {
      super.paintComponent(g);

      if (y > 0) {
        y -= 1;
      }

      g.drawImage(image, x, y, 60, 40, this);
    }

    public void actionPerformed(ActionEvent e) {
      this.repaint();
    }
  }

  public static void main(String[] args) {
    // Create a frame
    JFrame frame = new JFrame("Exercise17_23");

    // Create an instance of the applet
    JApplet applet = new Exercise17_23();

    // Add the applet to the frame
    frame.add(applet, BorderLayout.CENTER);

    // Invoke applet's init method
    applet.init();

    // Display the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 200);
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setVisible(true);
  }
}
