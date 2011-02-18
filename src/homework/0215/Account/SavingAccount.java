public class SavingAccount extends CheckingAccount {
    //default constructor
    public SavingAccount() {
        this.overDraftLimit = 0;
    }

    /**
     * Constructor.
     *
     * @see Account
     * @see this.setOverDraftLimit
     * @param double starting balance for this account.
     * @param double annual interest rate for this account.
     */
    public SavingAccount(double bal, double annIntRate) {
        super(bal, annIntRate, 0);
    }


    /**
     * Withdraw a certain amount from the 'balance' property.
     *
     * NOTE: this method simply brings this.withdraw back to the original
     * abstract implementation.
     *
     * @see Account
     * @see CheckingAccount
     * @param double amount to be withdrawn.
     */
    public void withdraw(double w) {
        this.balance = this.balance - w;
    }

}
