public class SavingAccount extends Account {
    private double rate;
    private double balance;


    public SavingAccount(double initialBalance, double rate) {
        super(initialBalance);
        this.rate = rate;
    }
    // Cập nhật số dư hiện tại sau khi thay đổi (Nạp/ Rút)
    public void updateBalance(double balance) {
        this.balance = balance;
    }

    public double getInterest() {
        double interest = balance * rate;
        return interest;
    }
}
