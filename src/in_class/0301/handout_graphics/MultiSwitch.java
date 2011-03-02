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

   public void paint( Graphics g )
   {
      String mess;
      super.paint(g);
           switch( choice ) {
            case 1:

                for (int k = 1; k <= 10; k++) {
                     g.drawLine( 20, 20, 250, (50 * k));
                }
                break;
            case 2:

                    g.drawRect( 20  , 20 ,
                           50 , 50  );
                break;
            case 3:

                    g.drawOval( 20 , 20 ,
                           50 , 50  );
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
