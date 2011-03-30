import javax.swing.*;
import java.awt.*;

public class ColorChooser 
{

  /**
   * Method to let the user pick a color and return
   * the color object. 
   * @return the picked color or red if no color was picked
   */
  public static Color pickAColor()
  {
    Color color = Color.white;
    
    // create a JFrame to be the parent of the color chooser open dialog
    // if you don't do this then you may not see the dialog.
    JFrame frame = new JFrame();
    
    // use the color chooser to pick the color
    color = JColorChooser.showDialog(frame,"Pick a color",color);
    
    return color;
  }
  public static void main(String[] args)
    {
      Color get_it;
      get_it = pickAColor();
      System.out.println("The color is " + get_it.toString());
      System.exit(0);
    }
   
}
