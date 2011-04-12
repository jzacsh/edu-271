import java.awt.*;
import java.applet.*;
import javax.swing.*;
import java.awt.event.*;

public class ColorSwirl2 extends JApplet  {

    private Font f = new Font("TimesRoman", Font.BOLD, 48);
    private Color colors[] = new Color[50];
    private Timer runner = new Timer(250, new TimerListener() );

    public void init()
    {
        // initialize the color array
        float c = 0;
        for (int i = 0; i < colors.length; i++) 
        {  // HSB is Hue, Saturation,  Brightness
            colors[i] = Color.getHSBColor(c, (float)1.0, (float)1.0);
            c += .02;
        }
        
        runner.start();

    }

    public void start() 
    {
        if (runner == null) 
        {
           runner.start();
        }
    }

    public void stop() 
    {
        if (runner != null) 
        {
            runner = null;
        }
    }

   private class TimerListener implements ActionListener
   {
        int i = 0;
       public void actionPerformed(ActionEvent e)
       {
           setForeground(colors[i]);
           repaint();
           i++;
            if (i == colors.length ) i = 0;
       }
   } 
  

    public void paint(Graphics g) 
    {
        super.paint(g);
        g.setFont(f);
        g.drawString("Look AT The Color Change!", 15, 50);
    }  
    
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Color Swirl");
        frame.setVisible(true);
        frame.setSize(650,150);

        ColorSwirl2 swirl = new ColorSwirl2(); // JApplet
        frame.add ( swirl ); // add JApplet to the frame
        swirl.init();
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );


    }
}
