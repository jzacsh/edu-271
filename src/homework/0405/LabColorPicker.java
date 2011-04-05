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
    //default constructor
    public LabColorPicker() {
        this.setLayout(new BorderLayout());

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
        colorLabels.setLayout(new GridLayout());
        this.add(colorLabels, BorderLayout.WEST);

        //sliders; inner right-hand main-area
        JPanel colorPickers = new JPanel();
        colorPickers.setLayout(new GridLayout());
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
