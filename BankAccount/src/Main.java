import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Người dùng đăng nhập tài khoản ngân hàng
        // ví dụ tồn tài 1 tài khoản của khách hàng
        // Taì khoản: admin
        // Mật khẩu: 123@
        // Số dư hiện tại là: 100 triệu
        // Ngân hàng X với lãi suất là 8%/ năm

        double balance = 100000000;
        double rate = 0.08;
        boolean flag = true;
        SavingAccount savingAccount = new SavingAccount(balance, rate);

        do {
            try {
                System.out.println("Nhập tài khoản:");
                String user = new Scanner(System.in).nextLine();
                if (user.equals("admin")) {
                    System.out.println("Nhập mật khẩu:");
                    String pass = new Scanner(System.in).nextLine();
                    if (pass.equals("123@")) {
                        flag = false;
                    } else throw new Exception("Nhập sai thông tin!!!");
                } else throw new Exception("Nhập sai thông tin!!!");
            } catch (Exception e) {
                System.out.println("Nhập lại!!!");
            }
        }
        while (flag);

        System.out.println("Xin chào, admin");
//        System.out.println("Số dư tài khoản: " + balance + " VNĐ");

        // switch
        Scanner input = new Scanner(System.in);
        int option;
        CheckAccount checkAccount = new CheckAccount(balance);
        double money;

        while (true) {

        System.out.println("----------MENU-----------");
        System.out.println("1. Nạp tiền vào tài khoản.");
        System.out.println("2. Rút tiền.");
        System.out.println("3. Gửi tiết kiệm.");
        System.out.println("4. Kiểm tra số dư.");
        System.out.println("5. Đăng xuất.");
        System.out.println("----------------------------------------------------");
        System.out.println("Bạn muốn thực hiện yêu cầu nào?");
        option = input.nextInt();

            switch (option) {
                case 1 -> {
                    System.out.println("Nhập số tiền bạn muốn nạp: ");
                    money = input.nextDouble();
                    checkAccount.deposit(money);
                    savingAccount.updateBalance(checkAccount.getBalance());
                    System.out.println("Bạn đã nạp thành công!");
                }
                case 2 -> {
                    System.out.println("Nhập số tiền bạn muốn rút: ");
                    money = input.nextDouble();
                    checkAccount.withdraw(money);
                    savingAccount.updateBalance(checkAccount.getBalance());
                    System.out.println("Bạn đã rút tiền thành công!");
                }
                case 3 -> {
                    double interest = savingAccount.getInterest();
                    System.out.println("Số tiền lãi : " + interest + "VNĐ");
                }
                case 4 -> {
                    balance = checkAccount.getBalance();
                    System.out.println("Số dư tài khoản: " + balance + " VNĐ");
                }
                case 5 -> {
                     return;
                }
            }
        }


    }
}