import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.Panel;

/**
 * Ref: http://download.oracle.com/javase/tutorial/uiswing/layout/flow.html
 *      http://download.oracle.com/javase/tutorial/uiswing/examples/layout/FlowLayoutDemoProject/src/layout/FlowLayoutDemo.java
 */

public class exFlowLayout extends JFrame {
    //default constructor
    public exFlowLayout() {
        super(); //usually implicitly called -- this created the mane frame

        JPanel panelMain = new JPanel();
        panelMain.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));

        //
        //create inner button-panels
        //
        int i = 0;

        //buttons 1-3
        JPanel panelLeft = new JPanel();
        panelLeft.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 10));
        for (i = i; i < 3; i++) {
            panelRight.add(new JButton("Button #"+ (String) int.toString(i + 1)));
        }

        //buttons 3-6
        JPanel panelRight = new JPanel();
        panelRight.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 10));
        for (i = i; i < 6; i++) {
            panelRight.add(new JButton("Button #"+ (String) int.toString(i + 2)));
        }
    }

    //main
    public static void main(String[] argv) {
        exFlowLayout example = new exFlowLayout();

        example.setTitle("Example FlowLayout, Assignment 12.1");
        example.setLocationRelativeTo(null);
        example.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Dimension d = new Dimension(600, 200);
        example.setMinimumSize(d);

        example.setSize(600, 200);
        example.setVisible(true);

    }
}
