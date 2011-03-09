import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AnimationDemo extends JFrame {
  public AnimationDemo() {
    // Create a MovingMessagePanel for displaying a moving message
    add(new MovingMessagePanel("message moving?"));
  }

  /** Main method */
  public static void main(String[] args) {
    AnimationDemo frame = new AnimationDemo();
    frame.setTitle("AnimationDemo");
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(480, 700);
    frame.setVisible(true);
  }

  // Displaying a moving message
  static class MovingMessagePanel extends JPanel {
    private String message = "Welcome to Java";
    private static int changeSpeedX = 0;
    private static int changeSpeedY = 0;
    private static int tempXMove = 0;
    private static int tempYMove = 0;
    private static int xmovement = 10;
    private static int ymovement = 10;
    private static int Xdirection = 1;
    private static int Ydirection = 1;
    private int xCoordinate = 0;
    private int yCoordinate = 20;

    public MovingMessagePanel(String message) {
      this.message = message;

      // Create a timer
      Timer timer = new Timer(100, new TimerListener());
      timer.start();
    }


    /** Paint message */
    public void paintComponent(Graphics g) {
      super.paintComponent(g);

      //gradually change speeds
      System.out.printf("speed =  x:%s; y:%s)\n", xmovement, ymovement);
      if (changeSpeedX != Xdirection) {
          changeSpeedX = Xdirection;
          xmovement = (int) ( java.lang.Math.random() * 10 ) + 1;
          ymovement = (int) ( java.lang.Math.random() * 10 ) + 1;
      }
      if (changeSpeedY != Ydirection) {
          changeSpeedY = Ydirection;
          xmovement = (int) ( java.lang.Math.random() * 10 ) + 1;
          ymovement = (int) ( java.lang.Math.random() * 10 ) + 1;
      }


      System.out.printf("\n\nstarting (x, y) = (%s, %s) @ %s/%s\n",
              xCoordinate,
              yCoordinate,
              xmovement,
              ymovement
              );
      if (yCoordinate > getHeight()) {
          System.out.printf("hit TOP (y-coord = %s; height = %s)\n", xCoordinate, getHeight());
          Ydirection = -1;
      }
      else if (yCoordinate < 0) {
          //@TODO: this doesn't make sense
          System.out.printf("hit BOTTOM (y-coord = %s; height = %s)\n", yCoordinate, getHeight());
          Ydirection = 1;
      }

      System.out.printf("starting xCoordinate: %s\n", xCoordinate);
      if (xCoordinate > getWidth()) {
          System.out.printf("hit RIGHT (x-coord = %s; width = %s)\n", xCoordinate, getWidth());
          Xdirection = -1;
      }
      else if (xCoordinate < 0) {
          //@TODO: this doesn't make sense
          System.out.printf("hit LEFT (x-coord = %s; width = %s)\n", xCoordinate, getWidth());
          Xdirection = 1;
      }

      xCoordinate += Xdirection *  xmovement;
      yCoordinate += Ydirection *  ymovement;
      System.out.printf("new (x, y) = (%s, %s) @ %s/%s\n\n",
              xCoordinate,
              yCoordinate,
              xmovement,
              ymovement
              );

      g.drawString(message, xCoordinate, yCoordinate);
    }

    class TimerListener implements ActionListener {
      /** Handle ActionEvent */
      public void actionPerformed(ActionEvent e) {
        repaint();
      }
    }
  }
}
