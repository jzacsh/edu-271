import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ComboBoxDemo extends JFrame {
  // Declare an array of Strings for flag titles
  private String[] flagTitles = {"Canada",  "United Kingdom",
    "United States of America"};

  // Declare an ImageIcon array for the national flags of countries
  private ImageIcon[] flagImage = {
    new ImageIcon("caIcon.gif"),
    
    new ImageIcon("ukIcon.gif"),
    new ImageIcon("usIcon.gif")
  };

  // Declare an array of strings for flag descriptions
  private String[] flagDescription = new String[9];

  // Declare and create a description panel
  private DescriptionPanel descriptionPanel = new DescriptionPanel();
  //@this is broken - go get the *.class file (only thing available) and add it to git index

  // Create a combo box for selecting countries
  private JComboBox jcbo = new JComboBox(flagTitles);

  public ComboBoxDemo() {
    // Set text description
    flagDescription[0] = "The Maple Leaf flag \n\n" +
      "The Canadian National Flag was adopted by the Canadian " +
      "Parliament on October 22, 1964 and was proclaimed into law " +
      "by Her Majesty Queen Elizabeth II (the Queen of Canada) on " +
      "February 15, 1965. The Canadian Flag (colloquially known " +
      "as The Maple Leaf Flag) is a red flag of the proportions " +
      "two by length and one by width, containing in its center a " +
      "white square, with a single red stylized eleven-point " +
      "mapleleaf centered in the white square.";
    
    flagDescription[1] = "Description for UK ... ";
    flagDescription[2] = "Description for US ... ";

    // Set the first country (Canada) for display
    setDisplay(0);

    // Add combo box and description panel to the list
    add(jcbo, BorderLayout.NORTH);
    add(descriptionPanel, BorderLayout.CENTER);

    // Register listener
    jcbo.addItemListener(new ItemListener() {
      /** Handle item selection */
      public void itemStateChanged(ItemEvent e) {
        setDisplay(jcbo.getSelectedIndex());
      }
    });
  }

  /** Set display information on the description panel */
  public void setDisplay(int index) {
    descriptionPanel.setTitle(flagTitles[index]);
    descriptionPanel.setImageIcon(flagImage[index]);
    descriptionPanel.setDescription(flagDescription[index]);
  }

  public static void main(String[] args) {
    ComboBoxDemo frame = new ComboBoxDemo();
    frame.pack();
    frame.setTitle("ComboBoxDemo");
    frame.setSize(300,400);
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}
