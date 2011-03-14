import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;
import java.awt.Panel;

/**
 * Registering an event listener via java interface.
 */

public class exRegisterButton extends JFrame implements ActionListener{
    //default constructor
    public exRegisterButton() {
        super(); //usually implicitly called -- this created the main frame

        this.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));

        //create inner button-panel
        JPanel panelLeft = new JPanel();
        panelLeft.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 10));

        //create buttons on the new panel.
        JButton jbtOk = new JButton("OK");
        panelLeft.add(jbtOk);
        JButton jbtCancel = new JButton("Cancel");
        panelLeft.add(jbtCancel);

        //add panel to the frame
        this.add(panelLeft);

        //register a listener
        jbtOk.addActionListener(this);
        jbtCancel.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        // _ton_ of stuff packed into an event object:
     // System.out.printf("A button was pressed.\nAttempting implicit toString() of event object: %s\n", e);
        System.out.printf("A '%s' button was pressed.\n", e.getSource()); //@TODO: why can't i reference this?
    }

    //main
    public static void main(String[] argv) {
        exRegisterButton example = new exRegisterButton();

        example.setTitle("Example Event Listeners, Lab 6 Assign. 14.3");
        example.setLocationRelativeTo(null);
        example.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        example.setSize(800, 90);
        example.setVisible(true);
    }
}
