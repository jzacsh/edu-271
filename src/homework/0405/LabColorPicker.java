import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;

/**
 * Jonathan Zacsh <jzacsh@gmail.com>
 *
 * Lab #8
 * pg 531; #15.15
 */

public class LabColorPicker extends JFrame {
    static final int COLOR_MIN = 0;
    static final int COLOR_MAX = 255;
    static final int COLOR_INIT = 0;

    //default constructor
    public LabColorPicker() {
        this.setLayout(new BorderLayout());

        //main label for window
        JTextField mainInstruction = new JTextField("Show Colors");
        mainInstruction.setEditable(false);
        this.add(mainInstruction, BorderLayout.NORTH);

        //main panel on bottom
        JPanel pickerForm = new JPanel();
        pickerForm.setLayout(new GridLayout());
        pickerForm.setBorder(new TitledBorder("Choose Colors"));
        this.add(pickerForm, BorderLayout.CENTER);

        //labels; inner left-hand side-bar
        JPanel colorLabels = new JPanel();
        colorLabels.setLayout(new GridLayout(3, 1));
        colorLabels.add(new JLabel("Red"));
        colorLabels.add(new JLabel("Green"));
        colorLabels.add(new JLabel("Blue"));
        this.add(colorLabels, BorderLayout.WEST);

        //sliders; inner right-hand main-area
        JPanel colorPickers = new JPanel();
        colorPickers.setLayout(new GridLayout(3, 1));
        //R: red slider
        JSlider pickerRed = new JSlider(JSlider.HORIZONTAL, COLOR_MIN,
                COLOR_MAX, COLOR_INIT);
        colorPickers.add(pickerRed);
        //G: green slider
        JSlider pickerGreen = new JSlider(JSlider.HORIZONTAL, COLOR_MIN,
                COLOR_MAX, COLOR_INIT);
        colorPickers.add(pickerGreen);
        //B: blue slider
        JSlider pickerBlue = new JSlider(JSlider.HORIZONTAL, COLOR_MIN,
                COLOR_MAX, COLOR_INIT);
        colorPickers.add(pickerBlue);
        this.add(colorPickers, BorderLayout.CENTER);
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
