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
    String toppinglist[] = {"Whipped Cream", "M&Ms", "Cherry", "Sprinkles", "Cashews" };
    JComboBox flavors;
    JList toppings;
    String flavor_picked = "", topping_picked = "";

    public Icecreamcombo()
    {
        super("Ice Cream");
        
        setLayout(new FlowLayout()); // One component after another from left to right
        // Now create some items to display to the user
        
        flavor_picked = "Vanilla";
        // Create the JComboBox to select the flavors
        flavors = new JComboBox(flavorlist);
        this.add(flavors);
        flavors.setMaximumRowCount(3);
        FlavorHandler flavor_handler = new FlavorHandler();
            
        // add the listeners
        flavors.addActionListener(flavor_handler);
        
        topps_Label = new JLabel("Toppings");
        this.add(topps_Label);
        // Create a JListBox for the toppings
        toppings = new JList(toppinglist);
        toppings.setVisibleRowCount(3);
        toppings.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        this.add(new JScrollPane(toppings));

        ToppingHandler topping_handler = new ToppingHandler();
        toppings.addListSelectionListener(topping_handler);
        
        order = new JTextField(20);
        order.setEditable(false);
        order.setText( flavor_picked );
        this.add(order);

        setSize(300,200);
        setVisible(true);
    }
    
    class FlavorHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            // The flavor selected
            flavor_picked = (String) flavors.getSelectedItem();
            order.setText(flavor_picked + " " + topping_picked);
        }

    }
    class ToppingHandler implements ListSelectionListener
    {
        public void valueChanged(ListSelectionEvent e)
        {
            // Get the list of the selected toppings
            //int selected[] = toppings.getSelectedIndices();
            Object selected[] = toppings.getSelectedValues();
            topping_picked = "";
            String _pre, flavor = order.getText();
            for (int i = 0; i < selected.length; i++) {
                _pre = ( i > 0 ) ? " " : "";
                topping_picked += _pre + selected[i];
            }
            order.setText(flavor_picked + " " + topping_picked);

            // Use a for loop to obtain the names of the selected items
            
        }

    }
    public static void main(String[] args)
    {
        Icecreamcombo ad = new Icecreamcombo();
        ad.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        ad.setLocationRelativeTo(null);
    }
}
