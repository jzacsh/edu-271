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

        //
        //Do the flavors as radio buttons since we can pick only one
        //
        //create vanilla
        vanilla = new JRadioButton("Vanilla", true);
        vanilla.setForeground(Color.white);
        vanilla.setBackground(Color.black);
        //create chocolate
        choc = new JRadioButton("Chocolate", false);
        choc.setForeground(dark);
        //create strawberry
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

        //register listeners on flvaors (radio buttons)
        vanilla.addItemListener(this);
        choc.addItemListener(this);
        straw.addItemListener(this);

        //register listeners on toppings (check boxes)
        whip.addItemListener(this);
        cherry.addItemListener(this);
        mms.addItemListener(this);

        this.setSize(275, 150);
        this.setVisible(true);
    }

    //interface
    public void itemStateChanged(ItemEvent e) {
        //getItem()
        AbstractButton selectedButton = (AbstractButton) e.getItem();
        String selected = selectedButton.getText();
        if (e.getStateChange() == ItemEvent.SELECTED) {
            System.out.printf("selected: %s\n", selected);
        }
        else {
            return;
        }

        //change flavors:
        String order = "";
        if (vanilla.isSelected()) {
            order = selected;
        }
        else if (choc.isSelected()) {
            order = selected;
        }
        else if (straw.isSelected()) {
            order = selected;
        }

        //change toppings:
        if (whip.isSelected()) {
            order += " w/" + selected;
        }
        else if (cherry.isSelected()) {
            order += " w/" + selected;
        }
        else if (mms.isSelected()) {
            order += " w/" + selected;
        }

        //update the text field
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
