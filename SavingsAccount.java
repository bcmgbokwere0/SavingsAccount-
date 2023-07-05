public class SavingsAccount {

    int balance;

    public SavingsAccount(int initialBalance) {
        balance = initialBalance;
    }

    // Check balance:
    public void checkBalance() {
        System.out.println("Hello!");
        System.out.println("Your balance is " + balance);
    }

    // Deposit
    public void deposit(int amountToDeposit) {
        int newBalance = balance + amountToDeposit;
        balance = newBalance;
        System.out.println("You just deposited " + amountToDeposit);
        System.out.println("You now have " + newBalance);
    }

    // Withdraw
    public int withdraw(int amountToWithdraw) {
        balance = balance - amountToWithdraw;
        System.out.println("You just withdrew " + amountToWithdraw);
        System.out.println("You now have " + balance + "... Maybe stop spending money...");
        return amountToWithdraw;
    }

    // Savings check
    public String toString() {
        return "This is a savings account with " + balance + " saved.";

    }

    // Main
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(2000);

        // Check balance:
        savings.checkBalance();

        // Withdrawing:
        savings.withdraw(300);

        // Check balance:
        savings.checkBalance();

        // Deposit:
        savings.deposit(600);

        // Check balance:
        savings.checkBalance();

        // Deposit:
        savings.deposit(600);

        // Check balance:
        savings.checkBalance();

        System.out.println(savings);
    }
}
