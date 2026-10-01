class BankAccountQ20 {
    double balance;
    static String bankCode = "SBI001";

    void withdraw(double amount) {
        double withdrawal = amount;

        if (withdrawal <= balance) {
            balance = balance - withdrawal;
            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public static void main(String[] args) {
        BankAccountQ20 b = new BankAccountQ20();
        b.balance = 5000;
        b.withdraw(3000);
    }
}
