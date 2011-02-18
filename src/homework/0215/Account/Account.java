
/**
 * UML Diagram of Account and Saving/Checking
 *
 * +-----------------------------------------+
 * | [m] = method                            |
 * | [p] = property/field                    |
 * |-----------------------------------------|
 * | Account (abstract)                      |
 * | + p  account number                     |
 * | + p  balance                            |
 * | + p  annual interest rate               |
 * | + p  date created                       |
 * | + m  deposit                            |
 * | + m  withdraw                           |
 * |                                         |
 * | CheckingAccount                         |
 * | + p  overDraftLimit                     |
 * | + m  withdraw (override for overdrafts) |
 * |                                         |
 * | SavingAccount                           |
 * | + m  withdraw                           |
 * |      (override for overdraft 'throw')   |
 * +-----------------------------------------+
 */

public abstract class Account {
    protected String id;
    protected double balance;
    protected double annIntRate;
    protected java.util.Date dateCreated;

    //default constructor
    public Account() {
        this.balance = 0;
        this.annIntRate = 0.5;
        this.dateCreated = new java.util.Date();
        //making sure to have a unique id: Rather than just Math.random we're
        //running an MD5 hash of the dateCreated and a random number.
        String dateStamp = this.dateCreated.toString() + Double.toString(java.lang.Math.random());
        java.security.MessageDigest md5 = java.security.MessageDigest.getInstance("MD5");
        md5.reset();
        md5.update(dateStamp.getBytes("UTF-8"));
        byte[] hash = md5.digest();
        this.id = hash.toString();
//      this.id = Byte.toString(md5.digest());
    }

    /**
     * Constructor
     *
     * @param double id - unique identifier for this account.
     * @param double balance - the starting balance for this account. 
     * @param double annIntRate - the annual interest rate for this account.
     */
    public Account(double bal, double annIntRate) {
        this(); //dateCreated and 'id' taken care of here.
        this.balance = bal;
        this.annIntRate = annIntRate;
    }

//@TODO: book doesn't say anything about accessor/mutator for balance?

    /**
     * Accessor for the 'balance' property
     *
     * @see balance.
     * @return double the current value of the 'balance' property.
     */
/* remove this line
    private double getBalance() {
        return this.balance;
    }
remove this line */

    /**
     * Mutator for the 'balance' property.
     *
     * @see balance
     * @param double value to set the 'balance' property to.
     */
/* remove this line
    private void setBalance(double bal) {
        this.balance = bal;
    }
remove this line */

    /**
     * Deposit a certain amount into the 'balance' property.
     *
     * @param double amount to be deposited.
     */
    public void deposit(double d) {
        this.balance = this.balance + d;
    }

    /**
     * Withdraw a certain amount from the 'balance' property.
     *
     * @param double amount to be withdrawn.
     */
    public void withdraw(double w) throws Error {
        double proposedBalance = this.balance - w;
        if (proposedBalance < 0) {
            java.util.Formatter str = new java.util.Formatter();
            str.format("Withdrawal amount exceeds account balance of %d. Amount not withdrawn.", this.balance);
            throw new Error(str.toString());
        }
        else {
            this.balance = this.balance - w;
        }
    }
}
