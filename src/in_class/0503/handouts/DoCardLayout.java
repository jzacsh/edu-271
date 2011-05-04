import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;

public class DoCardLayout extends JApplet
  implements ActionListener, ItemListener
{
  private CardLayout queue = new CardLayout();
  private JPanel cPanel = new JPanel();
  private JButton btFirst, btNext, btPrevious, btLast;
  private Choice choComponent;

  public void init()
  {
    //add 15 buttons into cPanel
    cPanel.setLayout(queue);
    cPanel.setBackground(Color.red);
    cPanel.setForeground(Color.green);
    for (int i=1; i<=15; i++)
      cPanel.add
        (new JLabel("Component "+i,Label.CENTER), String.valueOf(i));

    //add action buttons
    JPanel btPanel = new JPanel();
    btPanel.setLayout(new FlowLayout());
    btPanel.add(btFirst = new JButton("First"));
    btPanel.add(btNext = new JButton("Next"));
    btPanel.add(btPrevious= new JButton("Previous"));
    btPanel.add(btLast = new JButton("Last"));

    //add choice
    btPanel.add(new JLabel("Component"));
    btPanel.add(choComponent = new Choice());
    for (int i=1; i<=15; i++)
      choComponent.addItem(String.valueOf(i));

    //place panels in the frame
	Container c = getContentPane();
    c.setLayout(new BorderLayout());
    c.add("Center", cPanel);
    c.add("South", btPanel);

    //register listener with the source objects
    btFirst.addActionListener(this);
    btNext.addActionListener(this);
    btPrevious.addActionListener(this);
    btLast.addActionListener(this);
    choComponent.addItemListener(this);
  }

  public static void main(String[] args)
  {
    //create a frame
    JFrame f = new JFrame("CardLayout");

    DoCardLayout applet = new DoCardLayout();

    //invoke init()
    applet.init();

    //add the applet to the frame
    f.getContentPane().add("Center", applet);
    f.setSize(500, 200);
    f.setVisible(true);

    f.addWindowListener(
       new WindowAdapter(){
          public void windowClosing(WindowEvent e)
          {
             System.exit(0);
          }
       } ); 
  }

  public void actionPerformed(ActionEvent e)
  {
    String actionCommand = e.getActionCommand();
    if (e.getSource() instanceof JButton)
      if ("First".equals(actionCommand))
        //show the first component in queue
        queue.first(cPanel);
      else if ("Last".equals(actionCommand))
        //show the last component in queue
        queue.last(cPanel);
      else if ("Previous".equals(actionCommand))
        //show the previous component in queue
        queue.previous(cPanel);
      else if ("Next".equals(actionCommand))
        //show the next component in queue
        queue.next(cPanel);
  }

  //handling choice item events
  public void itemStateChanged(ItemEvent e)
  {
    if (e.getSource() instanceof Choice)
      //show the component at specified index
      queue.show(cPanel, (String)e.getItem());
  }
} 
