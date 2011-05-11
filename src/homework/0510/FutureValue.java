/**
 * Jonathan Zacsh <jzacsh@gmail.com>
 * Comp271; Lab #13
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FutureValue extends JFrame implements ActionListener {
    //set the labels
    protected JLabel lb_investment;
    protected JLabel lb_years;
    protected JLabel lb_rate;
    protected JLabel lb_future;
    //set the text fields
    protected JLabel tf_investment;
    protected JLabel tf_years;
    protected JLabel tf_rate;
    protected JLabel tf_future;
    //set the main "submit" button
    protected JButton calculate;

    public FutureValue() {
        this.setLayout(new FlowLayout());

        //create the lables
        this.lb_investment = new JLabel("Investment Amount");
        this.lb_years = new JLabel("Years");
        this.lb_rate = new JLabel("Annual Interest Rate");
        this.lb_future = new JLabel("Future Value");
        //create the text fields
        this.tf_investment = new JTextField();
        this.tf_years = new JTextField();
        this.tf_rate = new JTextField();
        this.tf_future = new JTextField();
        this.tf_future.setEditable(false); //only our result can be here

        //panel for buttons and labels
        JPanel panel_dashboard = new JPanel();
        panel_dashboard.setLayout(new GridLayout(1, 2));

        //panel for labels
        JPanel panel_labels = new JPanel();
        panel_labels.setLayout(new GridLayout(4, 1));

        //panel for buttons
        JPanel panel_buttons = new JPanel();
        panel_buttons.setLayout(new GridLayout(4, 1));

        //fill in our major panel
        panel_dashboard.add(panel_labels);
        panel_dashboard.add(panel_buttons);

        this.add(panel_dashboard);

        //add main "submit" button
        this.calculate = new JButton("CALCULATE");
        this.calculate.setActionListener(this);
        this.add(calculate);
    }

    class FutureValueMenu extends JMenuBar implements ActionListener {
        //basic menu and shortcut structure
        protected String fileItems[]   = {"Calculate", "Exit"};
        protected char[] fileShortcuts = {'C', 'X'};
        protected String aboutItems[]   = {"About"};
        protected char[] aboutShortcuts = {'A'};

        public FutureValueMenu() {
            JMenu menu_file = new JMenu("File");
            JMenu menu_about = new JMenu("About");

            //fill in "File" menu.
            for (int i = 0; i < this.fileItems.length; i++) {
                JMenuItem item = new JMenuItem(fileItems[i], fileShortcuts[i]);
                item.addActionListener(this);
                menu_file.add(item);
            }

            //fill in "About" menu.
            for (int i = 0; i < this.aboutItems.length; i++) {
                JMenuItem item = new JMenuItem(aboutItems[i], aboutShortcuts[i]);
                item.addActionListener(this);
                menu_about.add(item);
            }

            //add menus to our frame
            this.add(menu_file);
            this.add(menu_about);
        }
        
        public void actionPerformed() {
        }
    }

    public static void main(String[] args) {
        JFrame f = new FutureValue("Exercise29_1 - Future Investment Value");
        f.setMenuBar(new FutureValueMenu());
        f.setSize(600, 300);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
