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

  public static class FlagAnthemPanel extends JPanel {
    private Image image;
    int x = 20, y = 150;
//  private FlagAnthemPanel that;

    public FlagAnthemPanel(Image image) {
        this.image = image;
        Thread t = new Thread(new FlagAnthemPanelAnimate());
        t.start();
        URL audioURL = this.getClass().getResource("uk.mid");
        AudioClip audioClip = Applet.newAudioClip(audioURL);
        audioClip.play();
//      this.that = this;
    }

    class FlagAnthemPanelAnimate implements Runnable {
        public void run() {
            Thread t = Thread.currentThread();
            int stripes = 0;
            while (true) {
                repaint(); //@TODO: repaint method of _WHICH_ class, if not `this`???
             // that.repaint(); //@TODO: why not!?
                try {
                    Thread.sleep(500);
                }
                catch (InterruptedException ex) { }
            }
        }
    }

    public void paintComponent(Graphics g) {
      super.paintComponent(g);

      if (y > 0) {
        y -= 1;
      }

      g.drawImage(image, x, y, 60, 40, this);
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
