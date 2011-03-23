import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//
// A simple user interface that consists of radio buttons for the type of ice cream
// and check boxes for the toppings for the ice cream
//
public class IceCream extends JFrame {
    private JRadioButton vanilla, choc, straw;
    private JTextField ms;
    private ButtonGroup flavors;
    private JLabel tops;
    private JCheckBox whip, cherry, mms;
    private String icecream_picked = "Vanilla ";

    public IceCream() {
      
        super("Ice Cream");

        
        setLayout(new FlowLayout());

        Color dark = new Color(63,29,10);          // brownish
        ms = new JTextField("Vanilla ",20);  // to match default flavor
        ms.setEditable(false); // The user can not populate



     // Do the flavors as radio buttons since we can pick only one

        vanilla = new JRadioButton("Vanilla", true);
        vanilla.setForeground(Color.white);
        vanilla.setBackground(Color.black);
        
        choc = new JRadioButton("Chocolate", false);
        choc.setForeground(dark);
       
        straw = new JRadioButton("Strawberry", false);
        straw.setForeground(Color.red);
            

      // Now do the toppings as check boxes, since we can pick more than one
        tops = new JLabel("Toppings");
        whip = new JCheckBox("Whipped Cream");
      
        cherry = new JCheckBox("Cherry");
      
        mms = new JCheckBox("M&Ms");
        

    // Now place the stuff on the screen

        add(vanilla); // the radio buttons
        add(choc);
        add(straw);
        add(ms); // a text box to display the results

        add(tops); // a label
        add(whip); // the check boxes
        add(cherry);
        add(mms);

        setSize(275, 150);
        setVisible(true);
    }
  
    public static void main(String args[]) {
    IceCream ic = new IceCream();

    ic.addWindowListener(
       new WindowAdapter(){
          public void windowClosing(WindowEvent e)
          {
             System.exit(0);
          }
       } );
    }

}
