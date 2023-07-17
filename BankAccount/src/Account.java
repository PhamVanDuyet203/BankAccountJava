// Account
public class Account {
    private double balance;

    public Account(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double money) {
        if (money > 0) {
            balance += money;
            System.out.println("Đã gửi tiền thành công. Số dư hiện tại là: " + balance);
        } else {
            System.out.println("Số tiền gửi phải lớn hơn 0!");
        }
    }

    public void withdraw(double money) {
        if (money > 0) {
            if (money <= balance) {
                balance -= money;
                System.out.println("Rút tiền thành công! Số dư hiện tại là: " + balance);
            } else {
                System.out.println("Số dư của bạn không đủ để thực hiện lệnh rút tiền!");
            }
        } else {
            System.out.println("Số tiền rút phải lớn hơn 0.");
        }
    }

    public double getBalance() {
        return balance;
    }
}
