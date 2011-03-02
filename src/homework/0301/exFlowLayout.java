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

        this.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));

        //
        //create inner button-panels
        //
        int i = 0;

        //buttons 1-3
        JPanel panelLeft = new JPanel();
        panelLeft.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 10));
      //for (i = i; i < 3; i++) {
      //    panelLeft.add(new JButton("Button #"+ (String) int.toString(i + 1)));
      //}
        panelLeft.add(new JButton("Button #1"));
        panelLeft.add(new JButton("Button #2"));
        panelLeft.add(new JButton("Button #3"));

        this.add(panelLeft);

        //buttons 3-6
        JPanel panelRight = new JPanel();
        panelRight.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 10));
      //for (i = i; i < 6; i++) {
      //    panelRight.add(new JButton("Button #"+ (String) int.toString(i + 2)));
      //}
        panelRight.add(new JButton("Button #1"));
        panelRight.add(new JButton("Button #2"));
        panelRight.add(new JButton("Button #3"));

        this.add(panelRight);
    }

    //main
    public static void main(String[] argv) {
        exFlowLayout example = new exFlowLayout();

        example.setTitle("Example FlowLayout, Assignment 12.1");
        example.setLocationRelativeTo(null);
        example.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //@TODO: what do i need to import for this?
      //Dimension d = new Dimension(600, 200);
      //example.setMinimumSize(d);

        example.setSize(800, 90);
        example.setVisible(true);
    }
}
