import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.Panel;

public class exRegisterButton extends JFrame implements ActionListener {
    //default constructor
    public exRegisterButton() {
        super(); //usually implicitly called -- this created the main frame

        this.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));

        //create inner button-panel
        JPanel panelLeft = new JPanel();
        panelLeft.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 10));

        //create buttons on the new panel.
        panelLeft.add(new JButton("OK"));
        panelLeft.add(new JButton("Cancel"));

        //register a listener
        ActionListener reg = new exRegistration();
        panelLeft.addActionListener(reg);

        //add panel to the frame
        this.add(panelLeft);
    }

    public void exRegistration(ActionEvent e) {
        System.out.printf("A button was pressed.\nAttempting implicit toString() of event object: %s\n", e);
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
