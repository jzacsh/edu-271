// A simple user interface used to add two numbers
// No error checking is done!!!!

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JadderA extends JFrame   
{
	JTextField text1, text2, answertext;
	JLabel pluslabel, info;
	JButton button1;

	public JadderA()
	{
		// Set up an area to work on
		
		setLayout(new FlowLayout()); // One component after another from left to right

		// Now create some items to display to the user

		info = new JLabel("              Enter two numbers to add, then press the = button                        ");
		add(info);
		text1 = new JTextField(10);
		add(text1);

		pluslabel = new JLabel("+");
		add(pluslabel);
	
		text2 = new JTextField(10);
		add(text2);
		Mylisten myl = new Mylisten();
		
		button1 = new JButton("=");
		add(button1);
	
	    // Subscribe for when the user clicks this
		button1.addActionListener(myl);

		answertext = new JTextField(10);
		answertext.setEditable(false);
		add(answertext);
		
		setSize(500,200);
		setVisible(true);
	}

	// Listen for when the user presses the button
	private class Mylisten implements ActionListener // action listener so we can respond to the user
	{
	
		public void actionPerformed(ActionEvent e)
		{	
			
				// convert from text to integer and add
				int sum = Integer.parseInt(text1.getText()) +
					Integer.parseInt(text2.getText());

				// convert the answer to a string and display
				answertext.setText(String.valueOf(sum));
			
		}
	}
	public static void main(String[] args)
	{
		JadderA ad = new JadderA();
		ad.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}
}
