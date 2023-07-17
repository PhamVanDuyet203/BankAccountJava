public class CheckAccount extends Account {

    private double balance;
    private SavingAccount savingAccount;
    public CheckAccount(double balance) {
        super(balance);
        this.savingAccount = new SavingAccount(balance, 0.08);
    }

    @Override
    public void deposit(double money) {
        super.deposit(money);
        savingAccount.updateBalance(balance); // Cập nhật số dư hiện tại
    }

    @Override
    public void withdraw(double money) {
        super.withdraw(money);
        savingAccount.updateBalance(balance);
    }
}
