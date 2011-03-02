// Drawing some lines, rectangles or ovals

import java.awt.*;
import javax.swing.*;

public class MultiSwitch extends JFrame {
   int choice;

   public MultiSwitch()
   {
      String input;

      input = JOptionPane.showInputDialog(
                 "Enter 1 to draw lines\n" +
                 "Enter 2 to draw rectangles\n" +
                 "Enter 3 to draw ovals\n" );

      choice = Integer.parseInt( input );

        setSize(250,250);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }

    public static int randomRGB() {
        //@TODO: why doesn't this work?
     // return  ((int) Math.random()) * 255;
        return  (int) (Math.random()  * 255);
    }

    public static Color randomColor() {
        return new Color(randomRGB(), randomRGB(), randomRGB());
    }

   public void paint( Graphics g )
   {
      String mess;
      int k;
      Graphics2D g2d = (Graphics2D) g;

      super.paint(g);
       switch( choice ) {
        case 1:
            for (k = 1; k <= 10; k++) {
                 g.drawLine( 20, 20, 250, (50 * k));
            }
            break;
        case 2:
            for (k = 10; k > 0; k--) {
                g2d.setPaint(randomColor());
              //g.drawRect( 20  , 20 , (50 * k), (50 * k));
                g.fillRect( 20  , 20 , (50 * k), (50 * k));
            }
            break;
        case 3:
            for (k = 1; k <= 10; k++) {
                g.drawOval( 20 , 20 , (50 * k) , (50 * k) );
            }
           break;
        default:
           mess = "Bad choice - " + choice;
           JOptionPane.showMessageDialog(
              null, mess );
     } // end switch

   } // end paint()
    public static void main (String args[])
    {
        MultiSwitch app = new MultiSwitch();

    }

} // end class MultiSwitch
