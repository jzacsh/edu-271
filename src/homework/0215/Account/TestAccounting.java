/**
 * Test class to invoke the toString() method of both Checking and
 * SavingAccount classes.
 */
public class TestAccounting {
    public static void main(String argv[]) {
        double bal, rate, limit;

        //test CheckingAccount
        String checking = "Creating and calling SavingAccount, with:\n";
        checking += "\tBalance of\t$%.2f\n";
        checking += "\tAnnual Interest Rate of\t%.0f%%\n";
        checking += "\tOver-draft Limit\t%.2f%%\n";
        checking += "\ttoString() ->\t%s\n";
        bal = 9000;
        rate = 100;
        limit = .4;
        CheckingAccount check = new CheckingAccount(bal, rate, limit);
        System.out.printf(checking, bal, (rate * 10), limit, check.toString());

        //test SavingAccount
        String saving = "Creating and calling SavingAccount, with:\n";
        saving += "\tBalance of\t$%.2f\n";
        saving += "\tAnnual Interest Rate of\t%.0f%%\n";
        saving += "\t...toString()\n%s\t...[end of toString() output].\n";
        bal = 9000;
        rate = .4;
        SavingAccount save = new SavingAccount(bal, rate);
        System.out.printf(saving, bal, (rate * 10), save.toString());

    }
}
