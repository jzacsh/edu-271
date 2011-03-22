import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Cel extends JFrame
implements ActionListener
{
    JTextField cel_text, fah_text;
    JLabel cel_label, fah_label;
    //JButton button1;
    
    public Cel()
    {
        super("Cel");
        // Set up an area to work on
        
        setLayout(new GridLayout(2,2)); 

        cel_label = new JLabel("Celsius");
        add(cel_label);
        cel_text = new JTextField(10);
        add(cel_text);

        fah_label = new JLabel("Fah");
        add(fah_label);
    
        fah_text = new JTextField(10);
        add(fah_text);
            
        // Subscribe for when the user clicks the button
        cel_text.addActionListener(this);
    
        setSize(350, 150);
        setVisible(true);        
    }

    // Listen for when the user presses the button
    public void actionPerformed(ActionEvent e)
    {
        double cel = Double.parseDouble(cel_text.getText());
        double fah = 9/5.0 * cel + 32;
        fah_text.setText( "" + fah );
    }
    public static void main( String args[])
    {
        Cel app = new Cel();

        app.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    }
    }
