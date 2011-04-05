import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.TitledBorder;

/**
 * Jonathan Zacsh <jzacsh@gmail.com>
 *
 * Lab #8
 * pg 531; #15.15
 */
public class LabColorPicker extends JFrame {
    static final long serialVersionUID = 39L;
    public static final int COLOR_MIN = 0;
    public static final int COLOR_MAX = 255;
    public static final int COLOR_INIT = 0;
    private JSlider pickerRed;
    private JSlider pickerGreen;
    private JSlider pickerBlue;

    //default constructor
    public LabColorPicker() {
        this.setLayout(new BorderLayout());

        //
        //main label for window
        //
        JTextField mainInstruction = new JTextField("Show Colors");
        mainInstruction.setEditable(false);
        this.add(mainInstruction, BorderLayout.NORTH);

        //
        //main panel on bottom
        //
        JPanel pickerForm = new JPanel();
        pickerForm.setLayout(new GridLayout());
        pickerForm.setBorder(new TitledBorder("Choose Colors"));
        this.add(pickerForm, BorderLayout.CENTER);

        //
        //labels; inner left-hand side-bar
        //
        JPanel colorLabels = new JPanel();
        colorLabels.setLayout(new GridLayout(3, 1));
        colorLabels.add(new JLabel("Red"));
        colorLabels.add(new JLabel("Green"));
        colorLabels.add(new JLabel("Blue"));
        this.add(colorLabels, BorderLayout.WEST);

        //
        //sliders; inner right-hand main-area
        //
        JPanel colorPickers = new JPanel();
        colorPickers.setLayout(new GridLayout(3, 1));
        //R: red slider
        pickerRed = createColorSlider();
        this.configPickingSlider(pickerRed);
        colorPickers.add(pickerRed);
        //G: green slider
        pickerGreen = createColorSlider();
        this.configPickingSlider(pickerGreen);
        colorPickers.add(pickerGreen);
        //B: blue slider
        pickerBlue = createColorSlider();
        this.configPickingSlider(pickerBlue);
        colorPickers.add(pickerBlue);

        //add panel of sliders to frame
        this.add(colorPickers, BorderLayout.CENTER);
    }

    /**
     * Helper function to make above code more readable.
     */
    public JSlider createColorSlider() {
        return new JSlider(JSlider.HORIZONTAL, COLOR_MIN, COLOR_MAX,
                COLOR_INIT);
    }

    /**
     * Helper function to make above code more readable.
     */
    public void configPickingSlider(JSlider picker) {
        picker.setMinorTickSpacing(5);
        picker.setMajorTickSpacing(50);
        picker.setPaintTicks(true);
        picker.addChangeListener(new PickerListener());
    }

    class PickerListener implements ChangeListener {
        //implementation of stateChanged() for ChangeListener interface
        public void stateChanged(ChangeEvent e) {
            int R = pickerRed.getValue();
            int G = pickerGreen.getValue();
            int B = pickerBlue.getValue();
            System.out.printf("colors: RGB(%s,%s,%s)\n", R, G, B);
        }
    }

    public static void main(String args[]) {
        LabColorPicker picker = new LabColorPicker();

        picker.setTitle("Exercise15_15 - Color Picker");
        picker.setLocationRelativeTo(null);
        picker.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        picker.setSize(550, 400);
        picker.setVisible(true);
    }
}
