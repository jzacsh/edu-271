// This code demonstrates the use of a popup menu.
// A popup can appear anywhere in a Component.
// The ActionListener is for catching which popup menu item was pressed.
// The PopupMenuListener is for telling when the menu is visible.
// The MouseListener is for displaying the popup menu.
// The popup menu consists of three choices Left, Center and Right


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class myPopup extends JPanel implements ActionListener,
                                               PopupMenuListener,
                                               MouseListener
{
   
 public JPopupMenu popup;
  
 public myPopup()
 {
  popup = new JPopupMenu();
  JMenuItem item;

  popup.add(item = new JMenuItem("Left"));
  item.addActionListener(this);

  popup.add(item = new JMenuItem("Center"));
  item.addActionListener(this);

  popup.add(item = new JMenuItem("Right"));
  item.addActionListener(this);

  
  popup.addPopupMenuListener(this);

  addMouseListener(this);

          
 }
  public static void main(String args[])
  {
    
    JFrame f = new JFrame("Popup application");

    f.setContentPane(new myPopup());
    f.setSize(250,200);
    f.setVisible(true);
     
    f.addWindowListener(
       new WindowAdapter(){
          public void windowClosing(WindowEvent e)
          {
             System.exit(0);
          }
       } ); 
   }
        
    public void actionPerformed(ActionEvent e)
    { 
      System.out.println("Popup item " + e.getActionCommand() + " was pressed");
    }

    public void mousePressed(MouseEvent e) { checkPopup(e); }
    public void mouseClicked(MouseEvent e) {  }
    public void mouseReleased(MouseEvent e) { checkPopup(e); }
    public void mouseEntered(MouseEvent e) {  }
    public void mouseExited(MouseEvent e) {  }

    private void checkPopup(MouseEvent e)
    {
      // Should the menu be displayed?
      if (e.isPopupTrigger())
         popup.show(this, e.getX(), e.getY());
    }

    public void popupMenuWillBecomeVisible(PopupMenuEvent e)
    {
       System.out.println("Now you see it");
    }

    public void popupMenuWillBecomeInvisible(PopupMenuEvent e)
    {
       System.out.println("Now you do not see it");
    }
    
    public void popupMenuCanceled(PopupMenuEvent e)
    {
       ;
    }
}