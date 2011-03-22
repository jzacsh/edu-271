// Icecream - select flavors using combo box
// toppings - select using list box - multiple selection
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class Icecreamcombo extends JFrame
{
    JTextField order;
    JLabel topps_Label;
    String flavorlist[] = {"Vanilla" , "Chocolate", "Strawberry", "Coffee" };
    String toppinglist[] = {"Whipped Cream", "M&Ms", "Cherry", "Sprinkles" };
    JComboBox flavors;
    JList toppings;
    String icecream_picked = "";

    public Icecreamcombo()
    {
        super("Ice Cream");
        
        setLayout(new FlowLayout()); // One component after another from left to right
        // Now create some items to display to the user
        
        icecream_picked = "Vanilla";
        // Create the JComboBox to select the flavors
        add(flavors);
            
        // add the listeners
        
        
        topps_Label = new JLabel("Toppings");
        add(topps_Label);
        // Create a JListBox for the toppings
        add(toppings);
        
        
        order = new JTextField(20);
        order.setEditable(false);
        order.setText( icecream_picked );
        add(order);

        setSize(300,200);
        setVisible(true);
    }
    
    class FlavorHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            // The flavor selected
            ;
        }

    }
    class ToppingHandler implements ListSelectionListener
    {
        public void valueChanged(ListSelectionEvent e)
        {
            // Get the list of the selected toppings
            //int selected[] = toppings.getSelectedIndices();
            Object selected[] = toppings.getSelectedValues();

            // Use a for loop to obtain the names of the selected items
            
        }

    }
    public static void main(String[] args)
    {
        Icecreamcombo ad = new Icecreamcombo();
        ad.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    }
}