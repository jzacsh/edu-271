/**
 * Test class to invoke the toString() method of both Checking and
 * SavingAccount classes.
 */
public class TestAccounting {
    public static void main(String argv[]) {

        double bal, rate;
        String saving = "Creating and calling SavingAccount, with:\n";
        saving += "\tBalance of $%.2f";
        saving += "\tAnnual Interest Rate of %0.0f%%\n";
        saving += "\ttoString() -> %s\n";
        bal = 9000;
        rate = .04;
        SavingAccount save = new SavingAccount(bal, rate));
        System.out.printf(saving, bal, rate * 10, save.toString());

    }
}
