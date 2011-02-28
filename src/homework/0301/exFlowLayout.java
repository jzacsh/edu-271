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
    }

    //main
    public static void main(String[] argv) {
        //set the LayoutManager
        //flowlayout: aligned left, horiz gap 10, vert gap 20
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));

        //create the left and right panes
        FlowLayout panelRight = new FlowLayout(FlowLayout.RIGHT, 5, 10);
        FlowLayout panelLeft  = new FlowLayout(FlowLayout.LEFT, 5, 10);

        //
        //set the buttons for right and left panes
        //
        int i;
        //set buttons 1-3 in right-side pane
        for (i = 0; i < 3; i++) {
            panelRight.add(new JButton("button " + (String) (i+1)));
        }

        //set buttons 1-3 in left-side pane
        for (i = 0; i < 3; i++) {
            panelLeft.add(new JButton("button " + (String) (i+1)));
        }

        //
        //expose the above work:
        //

        //create the frame
        exFlowLayout frame = new exFlowLayout();

        //set things up
        frame.setTitle("ShowFlowLayout");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
