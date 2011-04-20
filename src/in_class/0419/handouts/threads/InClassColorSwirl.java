import java.awt.*;
import java.applet.*;
import javax.swing.*;
import java.awt.event.*;

public class InClassColorSwirl extends JApplet implements Runnable  {

    private Font f = new Font("TimesRoman", Font.BOLD, 48);
    private Color colors[] = new Color[50];
//  private Timer runner = new Timer(100, this); //listener
    private Thread runner;
    private static int x_pos_default = 15;
    private int x_pos = x_pos_default;
    private int k = 0;
    private int i = 0;

    private float c = 0;
    public InClassColorSwirl()
    {
        for ( i = 0; i < colors.length; i++) 
        {  // HSB is Hue, Saturation,  Brightness
            colors[i] = Color.getHSBColor(c, (float)1.0, (float)1.0);
            c += .02;
        }
        i = 0;
        runner = new Thread(this);
        runner.start();
    }
    
    public void run() 
   {
            
           while (true) {
                setForeground(colors[i]);
                repaint();

                try {
                    Thread.sleep(100);
                }
                catch (InterruptedException exp) { ; }

                i++;
                if (x_pos > 400) {
                    x_pos += x_pos_default;
                }
               
                if (i == colors.length ) 
                    i = 0;
           }
        
    }

    public void paint(Graphics g) 
    {
        super.paint(g);
        g.setFont(f);
        g.drawString("Look AT The Color Change!", x_pos, 50);
    }

   public static void main(String[] args) {
    // Create a frame
    JFrame frame = new JFrame("Color ");

    // Create an instance of the applet
    JApplet applet = new InClassColorSwirl();

    // Add the applet to the frame
    frame.add(applet, BorderLayout.CENTER);

    // Invoke applet's init method
    applet.init();

    // Display the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(700, 300);
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setVisible(true);
  }
}
