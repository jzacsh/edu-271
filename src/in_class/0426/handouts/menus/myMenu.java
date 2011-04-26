// This code demonstrates the creation of menus and submenus.
// The code creates a menu bar consisting of File, Edit, and Other
// For File it's submenus are New, Open, Save, and Exit with each
// having a shortcut key. Edit has the sub menus Undo, Cut, Copy, and Paste.
// Other has the submenus Submenu1, Check Me (a check box which is dimmed), Radio1,
// Radio2 and a graphic picture of a lady bug.
// The real work is to provide the code that is associated with the menu item selected.
// This example just prints out what was selected.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class myMenu extends JMenuBar implements ActionListener
{
  
 String fileItems[] = { "New", "Open", "Save", "Exit"};
 char[] fileShortcuts = { 'N', 'O', 'S', 'X'};
                               
 String editItems[] = {"Undo", "Cut", "Copy", "Paste"};
 
 
public myMenu()
{
  JMenu fmenu = new JMenu("File");
  JMenu emenu = new JMenu("Edit");
  JMenu omenu = new JMenu("Other");
  JMenu s1menu = new JMenu("Submenu1");
  JMenu s2menu = new JMenu("Submenu2");

// Do the File and the shortcut keys
  for (int i=0; i < fileItems.length; i++)
  {
     JMenuItem item =   new JMenuItem(fileItems[i], fileShortcuts[i]);
     item.addActionListener(this);
     fmenu.add(item);
  }

// Do the Edit
  

// now do the sub menus
// these must be done before adding the other menu to the menubar

  JMenuItem item;
  s2menu.add(item = new JMenuItem("Extra 2"));
  item.addActionListener(this);
  s1menu.add(item = new JMenuItem("Extra 1"));
  item.addActionListener(this);
  s1menu.add(s2menu);

// do the other menu
  omenu.add(s1menu);
  omenu.add(item = new JCheckBoxMenuItem("Check Me"));
  item.addActionListener(this);
  item.setEnabled(false); // make Check Me disabled (dimmed)
  omenu.addSeparator(); // place a separator after check me

  ButtonGroup bgroup = new ButtonGroup();
  omenu.add(item = new JRadioButtonMenuItem("Radio 1"));
  item.addActionListener(this);
  
  bgroup.add(item);
  omenu.add(item = new JRadioButtonMenuItem("Radio 2"));
  item.addActionListener(this);
  bgroup.add(item);

// now for the picture
  omenu.add(item = new JMenuItem("Lady Bug", new ImageIcon("LADYBUG1.gif")));
  item.addActionListener(this);

// now add File  Edit  Other to the menubar
// These are added to the frame
  add(fmenu);
  add(emenu);
  add(omenu);
          
}
  public static void main(String args[])
  {
    
    JFrame f = new JFrame("Menu application");

    f.setJMenuBar(new myMenu());
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
      // Tell us what was selected
      System.out.println("Menu item " + e.getActionCommand() + " was pressed");
    }
 
}