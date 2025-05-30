/*Create two classes: BankAccount and BankApp.

BankAccount should have attributes: accountNumber, balance.

Add a method displayBalance().

In BankApp, create two BankAccount objects and call displayBalance(). */


public class BankAccount {
    int accountNumber;
    int balance;

    BankAccount(int accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

  void displayBalance() {
    System.out.println("Account Number: " + accountNumber);
    System.out.println("Balance: Rs." + balance);
}

}

class BankApp {
    public static void main(String[] args) {
        BankAccount bk1 = new BankAccount(12345, 10000);
        BankAccount bk2 = new BankAccount(678910, 20000);

        bk1.displayBalance();
        bk2.displayBalance();
    }
}

