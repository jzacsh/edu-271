// Simple application to convert Celsius to Fahrenheit

import java.awt.*;
import java.awt.Graphics;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.text.DecimalFormat;

public class celtofah1 extends JFrame
    implements ActionListener

 {
    private JTextField anslabel; 
    private JTextField ans;
    private JLabel lab_cel;
    
    
    private JPanel pn1, pn2;
        
    public celtofah1() 
    {
        super ("Celsius to Fahrenheit");

        BorderLayout bdLayout = new BorderLayout();
        this.setLayout(bdLayout);

        pn1 = new JPanel();
        pn2 = new JPanel();

        lab_cel = new JLabel("Enter Degrees in Celsius ");
        anslabel = new JTextField(10);
                
        ans = new JTextField(10);
        ans.setEditable(false);

        pn1.add(lab_cel);
        pn1.add(anslabel);
        pn2.add(ans);

        anslabel.addActionListener(this);

        this.add(pn1,BorderLayout.NORTH);
        this.add(pn2,BorderLayout.SOUTH);
              
        this.setSize(350,150);
        this.setVisible(true);
}
    public void actionPerformed(ActionEvent e)
    {
        
        if (e.getSource() == anslabel)
        {
                DecimalFormat twodig = new DecimalFormat("0.0");
                float cel = Float.parseFloat( anslabel.getText() );
                double fah = 9.0/5 * cel + 32;
                ans.setText(twodig.format(fah) + " fahrenheit");
        }
    }

    public static void main( String args[])
    {
        celtofah1 app = new celtofah1();

        app.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        app.setLocationRelativeTo(null);
    }
}
