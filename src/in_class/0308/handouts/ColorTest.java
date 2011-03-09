// Drawing some lines, rectangles or ovals 
import java.awt.*;
import javax.swing.*;

public class ColorTest extends JFrame {
   int choice;   

   public ColorTest()
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
      Graphics2D g2d = (Graphics2D)g;
      int red, green, blue;
           switch( choice ) {
            case 1:
    				for ( int i = 0; i < 10; i++ )
    				 g.drawLine( 20, 20, 250, 50 + i * 20 );
    			break;
            case 2:
    			for ( int i = 0; i < 10; i++ ){
    				red = (int) (Math.random() * 255);
    				green = (int) (Math.random() * 255);
    				blue = (int) (Math.random() * 255);
    				Color mycolor = new Color(red, green, blue);
    				g2d.setPaint(mycolor);
    				g2d.fillRect( 10 + i * 10, 10 + i * 10,
                           50 + i * 10, 50 + i * 10 );
    			}
    			break;
            case 3:
    			for ( int i = 0; i < 10; i++ ){
    				red = (int) (Math.random() * 255);
    				green = (int) (Math.random() * 255);
    				blue = (int) (Math.random() * 255);
    				Color mycolor = new Color(red, green, blue);
    				g2d.setPaint(mycolor);
    				g2d.fillOval( 10 + i * 10, 10 + i * 10,
                           50 + i * 10, 50 + i * 10 );
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
    	ColorTest app = new ColorTest();
    	
    } 

} // end class ColorTest