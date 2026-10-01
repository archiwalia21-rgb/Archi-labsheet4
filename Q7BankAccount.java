class Q7BankAccount {
    String accountNumber;
    double balance;
    static String bankName = "SBI";

    void deposit(double amount) {
        double depositAmount = amount;
        balance = balance + depositAmount;
    }

    void display() {
        System.out.println("Bank: " + bankName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        Q7BankAccount b = new Q7BankAccount();
        b.accountNumber = "12345";
        b.balance = 5000;

        b.deposit(2000);
        b.display();
    }
}
