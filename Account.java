public class Account {
    private String accountNumber;
    private double balance;
    private String customerName;

public Account(){
}
    public Account(String accountNum, Double balanced, String cusNam) {
        this.accountNumber = accountNum;
        this.balance = balanced;
        this.customerName = cusNam;
    }
    public String getAccountNumber() { 
        return this.accountNumber;
    }

    public void setAccountNumber(String newAccNum) {
        this.accountNumber = newAccNum;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(Double Balance) {
        this.balance = Balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customer) {
        this.customerName = customer;
    }

    public void withdraw(double withdrawAmount){
        if (this.balance - withdrawAmount < 0) {
            System.out.println(("Only " + this.balance + " is available."));
        } else {this.balance -= withdrawAmount;
            System.out.println("Processed, thank you for using our service. Your balance is now " + this.balance + ".");
        }
    }
    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Your account balance is now " + this.balance);
    }
}
