import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;

/**
 * This file is "Listing 16.1" out of ISBN: 0-13-222158-6
 */
public class LoanApplet extends JApplet {
    //declare and create text fields for interest rate, year, loan amount,
    //monthly payment, and total payment.
    private JTextField jftAnnualInterestRate = new JTextField();
    private JTextField jftNumberOfYears = new JTextField();
    private JTextField jftLoanAmount = new JTextField();
    private JTextField jftMonthlyPayment = new JTextField();
    private JTextField jftTotalPayment = new JTextField();

    //declare and create a compute payment button
    private JButton jbtComputeLoan = new JButton("Compute Payment");

    /** Initialize user interface */
    public void init() {
        //set properties on the text fields
        jftMonthlyPayment.setEditable(false);
        jftTotalPayment.setEditable(false);

        //right-align text fields
        jftAnnualInterestRate.setHorizontalAlignment(JTextField.RIGHT);
        jftNumberOfYears.setHorizontalAlignment(JTextField.RIGHT);
        jftLoanAmount.setHorizontalAlignment(JTextField.RIGHT);
        jftMonthlyPayment.setHorizontalAlignment(JTextField.RIGHT);
        jftTotalPayment.setHorizontalAlignment(JTextField.RIGHT);

        //panel p1 to hold labels and text fields
        JPanel p1 = new JPanel(new GridLayout(5, 2));
        p1.add(new JLabel("Annual Interest Rate"));
        p1.add(jftAnnualInterestRate);
        p1.add(new JLabel("Number of Years"));
        p1.add(jftNumberofYears);
        p1.add(new JLabel("Loan Amount"));
        p1.add(jftLoanAmount);
        p1.add(new JLabel("Monthly Payment"));
        p1.add(jftMonthlyPayment);
        p1.add(new JLabel("Total Payment"));
        p1.add(jftTotalPayment);
        p1.setBorder(new TitledBorder("Enter interest rate, year and loan amount."));

        //panel p2 to hold the button
        JPanel p2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        p2.add(jbtComputeLoan);

        //add the components to the applet
        this.add(p1, BorderLayout.CENTER);
        this.add(p2, BorderLayout.SOUTH);

        //register listener
        jbtComputeLoan.addActionListner(new ButtonListener());
    }

    /** handle the compute payment button **/
    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //get vales from text fields
            double interest = Double.parseDouble(jftAnnualInterestRate.getText());
            int year = Integer.parseInt(jftNumberOfYears.getText());
            double loanAmount = Double.parseDouble(jftLoanAmount.getText());

            //create a loan object
            Loan loan = new Loan(interest, year, loanAmount);

            //display monthly payment and total payment
            jftMonthlyPayment.setText(String.format("%.2f", loan.getMonthlyPayment()));
            jftTotalPayment.setText(String.format("%.2f", loan.getTotalPayment()));
        }
    }
}
