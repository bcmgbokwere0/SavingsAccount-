public class Account { // inside of a class these private "variables" are called "properties" or "fields".
    private String accountNumber;
    private double balance;
    private String customerName;

public Account(){ //empty constructor 

}

    // constructor is sort of instructions to tell java to make our class/object for
    // example an account. Also don't need any sort of return like a method would.
    // Might be confusing but they can be called "Special Methods". Constructor uses
    // instance variables to use field properties.
    public Account(String accountNum, Double balanced, String cusNam) {
        this.accountNumber = accountNum;
        this.balance = balanced;
        this.customerName = cusNam;
        // this. should be used for when the field is the same name as our instance variables, but we can also just use it regardless.
    }

    // Boiler plate code, getting our methods to set and retrieve certain things. It kinda just makes things work lol

    public String getAccountNumber() { // This method is called a "getter" it goes and gets something from our constructor class aka our private field. needs to return
        return this.accountNumber;
    }

    public void setAccountNumber(String newAccNum) { // this method is a setter, this just updates values and does not have to return anything thanks to "void".
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
            System.out.println(("Only " + this.balance + " is available. Broke boy"));
        } else {this.balance -= withdrawAmount;
            System.out.println("Processed, thank you for using our service. Your balance is now " + this.balance + ".");
        }
    }
    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Your account balance is now " + this.balance);
    }
}
