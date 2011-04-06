// Icecream - select flavors using combo box
// toppings - select using list box - multiple selection
import javax.swing.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class Icecreamcombo extends JApplet
{
    JTextField order;
    JLabel topps_Label;
    String flavorlist[] = {"Vanilla" , "Chocolate", "Mint","Strawberry", "Coffee" };
    String toppinglist[] = {"Whipped Cream", "M&Ms","Hot Fudge", "Cherry", "Sprinkles" };
    JComboBox flavors;
    JList toppings;
    String icecream_picked = "";

    public void init()
    {
        setLayout(new FlowLayout()); // One component after another from left to right
        // Now create some items to display to the user

        URL iceurl = this.getClass().getResource("icecream_new.jpg");
        ImageIcon icecream = new ImageIcon(iceurl);
        JLabel ice_label = new JLabel(icecream);
        this.add(ice_label);

        icecream_picked = "Vanilla";
        // Create the JComboBox to select the flavors
        flavors = new JComboBox(flavorlist);
        add ( flavors ); // place on screen
        flavors.setMaximumRowCount(2);
        //flavors.setEditable(true);
        FlavorHandler flavor_handler = new FlavorHandler();

        // add the listeners
        flavors.addActionListener( flavor_handler ); //register

        topps_Label = new JLabel("Toppings");
        add(topps_Label);
        // Create a JListBox for the toppings
        toppings = new JList( toppinglist );
        add( new JScrollPane(toppings ) ); //place a scroll
        toppings.setVisibleRowCount(3);
        toppings.setSelectionMode
            (ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        ToppingHandler topping_handler = new ToppingHandler();
        toppings.addListSelectionListener( topping_handler);

        order = new JTextField(20);
        order.setEditable(false);
        order.setText( icecream_picked );
        add(order);
    }

    class FlavorHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            // The flavor selected
            icecream_picked = (String)flavors.getSelectedItem();
            order.setText( icecream_picked );
            toppings.clearSelection();
        }

    }
    class ToppingHandler implements ListSelectionListener
    {
        public void valueChanged(ListSelectionEvent e)
        {
            // Get the list of the selected toppings
            //int selected[] = toppings.getSelectedIndices();
            Object selected[] = toppings.getSelectedValues();
            String toppings_picked = " ";
            // Use a for loop to obtain the names of the selected items
            for (int k = 0; k < selected.length ; k++)
            {
                toppings_picked += selected[k] + " ";
            }
            order.setText( icecream_picked + toppings_picked );
        }

    }
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Ice Cream");


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setSize(900, 500);

        Icecreamcombo japp = new Icecreamcombo();
        frame.add(japp);

        japp.init();
    }
}
