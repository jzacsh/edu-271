public class CheckingAccount extends Account {
    protected double overDraftLimit;

    //default constructor
    public CheckingAccount() {
        super();
        this.setOverDraftLimit(0);
    }

    /**
     * Constructor
     *
     * @see Account
     * @see this.setOverDraftLimit
     * @param double starting balance for this account.
     * @param double annual interest rate for this account.
     * @param double lower limit allowed for 'balance' property.
     */
    public CheckingAccount(double bal, double annIntRate, double limit) {
        super(bal, annIntRate);
        this.setOverDraftLimit(limit);
    }

    //override for overdrafts
    public void withdraw(double amt) throws Error {
        double proposedBalance = this.balance - amt;
        if (proposedBalance < 0 && java.lang.Math.abs(proposedBalance) > this.overDraftLimit) {
            //@TODO: pull this out to a seperate formatted string.
            throw new Throwable.Error("Over-draft Limit, %d, exceeded. Amount not withdrawn.", this.overDraftLimit);
        }
        else {
            super.withdraw(amt);
        }
    }

    /**
     * Mutator for 'overDraftLimit' property.
     *
     * @see Account.balance
     * @param double lower limit allowed for 'balance' property.
     */
    public void setOverDraftLimit(double limit) {
        this.overDraftLimit = java.lang.Math.abs(limit);
    }
}
