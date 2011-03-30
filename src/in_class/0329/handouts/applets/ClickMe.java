import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class ClickMe extends JApplet {
    private JLabel label; 
    private Container c;
    private String msg = "Counting ups and downs";
    private int up = 0, down = 0;
           
    public void init() {
        c = getContentPane();
        BorderLayout bdLayout = new BorderLayout();
        c.setLayout(bdLayout);
       
        label = new JLabel(msg, JLabel.CENTER);
        label.addMouseListener(new MouseHandler(this));
                    
        c.add(label,BorderLayout.CENTER);
                            
    }
    public void start() { showStatus("Click started"); }

    public void stop() { showStatus("Click stopped"); }

    public void doDown() {
        down++;
        msg = "Ups = " + up + " and Downs = " + down;
        label.setText(msg);
    }
    public void doUp() {
        up++;
        msg = "Ups = " + up + " and Downs = " + down;
        label.setText(msg);
    }

    class MouseHandler extends MouseAdapter {
        private ClickMe app;
        MouseHandler(ClickMe ap) { app = ap; }
        public void mousePressed(MouseEvent e) { app.doDown(); }
        public void mouseReleased(MouseEvent e) { app.doUp(); }
    }    
}
