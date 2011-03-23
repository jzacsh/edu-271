import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//
// A simple user interface that consists of radio buttons for the type of ice cream
// and check boxes for the toppings for the ice cream
//
public class IceCream extends JFrame implements ItemListener {
    private JRadioButton vanilla, choc, straw;
    private JTextField ms;
    private ButtonGroup flavors;
    private JLabel tops;
    private JCheckBox whip, cherry, mms;
    private String icecream_picked = "Vanilla ";

    public IceCream() {
        super("Ice Cream");
        this.setLayout(new FlowLayout());

        Color dark = new Color(63,29,10);          // brownish
        ms = new JTextField("Vanilla ",20);  // to match default flavor
        ms.setEditable(false); // The user can not populate

        //Do the flavors as radio buttons since we can pick only one
        vanilla = new JRadioButton("Vanilla", true);
        vanilla.setForeground(Color.white);
        vanilla.setBackground(Color.black);

        choc = new JRadioButton("Chocolate", false);
        choc.setForeground(dark);
       
        straw = new JRadioButton("Strawberry", false);
        straw.setForeground(Color.red);
            
        //button-group to associate radio buttons
        flavors = new ButtonGroup();
        flavors.add(vanilla);
        flavors.add(choc);
        flavors.add(straw);

        //Now do the toppings as check boxes, since we can pick more than one
        tops = new JLabel("Toppings");
        whip = new JCheckBox("Whipped Cream");
        cherry = new JCheckBox("Cherry");
        mms = new JCheckBox("M&Ms");
        
        //Now place the stuff on the screen
        this.add(vanilla); // the radio buttons
        this.add(choc);
        this.add(straw);
        this.add(ms); // a text box to display the results

        this.add(tops); // a label
        this.add(whip); // the check boxes
        this.add(cherry);
        this.add(mms);

        //register listeners on radio buttons
        vanilla.addItemListener(this);
        choc.addItemListener(this);
        straw.addItemListener(this);

        this.setSize(275, 150);
        this.setVisible(true);
    }

    //interface
    public void itemStateChanged(ItemEvent e) {
        //getItem()
        String order = "";
        if (vanilla.isSelected()) {
            order = "Vanilla";
        }
        else if (choc.isSelected()) {
            order = "Chocolate";
        }
        else if (straw.isSelected()) {
            order = "Strawberry";
        }

        ms.setText(order);
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
