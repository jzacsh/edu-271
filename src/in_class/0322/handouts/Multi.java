// Copy items from one List to a TextArea

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Multi extends JFrame
  implements ActionListener 
{
	JTextArea copyArea ;
	JList colorList;
	JButton copyit;
	String colornames[] = { "Black", "Blue", "Dark Gray", "Gray", "Green", "Orange", "Pink", "Red", "White"};

	public Multi()
	{
		// Set up an area to work on
		setLayout(new FlowLayout()); // One component after another from left to right

		// Now create some items to display to the user

		colorList = new JList(colornames);
		colorList.setVisibleRowCount(5);
		colorList.setFixedCellHeight(15);
		colorList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		add(colorList);
		

		copyit = new JButton(">");
		add(copyit);
	
	    // Subscribe for when the user clicks this
		copyit.addActionListener(this);

		copyArea = new JTextArea(5, 20);
		copyArea.setEditable(false);
		add( new JScrollPane (copyArea) );
		
		setSize(400,300);
		setVisible(true);
	}

	// Listen for when the user presses the button
	
	
	public void actionPerformed(ActionEvent e)
	{
		
		if (e.getSource() == copyit)
		{	
			String area;
			if (colorList.getSelectedIndex() >=0 && colorList.getSelectedIndex() <= colornames.length)
			{
				copyArea.setText ( colornames [colorList.getSelectedIndex()] );
			}
		}
	}
	
	public static void main(String[] args)
	{
		Multi ad = new Multi();
		ad.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}
}
