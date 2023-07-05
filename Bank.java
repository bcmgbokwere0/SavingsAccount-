public class Bank{

    public static void main(String[] args) { //starting point for java, must have. 
        Account briansAccount = new Account("2211-3380-999999-0220", 10000.00, "Thanks for using our service Brian!");

        System.out.println(briansAccount.getBalance());

        // new keyword always points to the constructor. first is the type and second is the instantiate. 
        Account bryansAccount = new Account("2211-8809-100000-1330", 10.00, "Thanks for using our service Bryan!");
        System.out.println(bryansAccount.getBalance()); // getting

        bryansAccount.setCustomerName("Lilo"); // setting
        System.out.println(bryansAccount.getCustomerName());

        Account chrisAccount = new Account();
        chrisAccount.setAccountNumber("20203i20i302i3i0i");
        chrisAccount.setBalance(10000.00);
        chrisAccount.setCustomerName("Chris Ryan");


        System.out.println(chrisAccount.getAccountNumber());

        // Using the withdrawal method on our empty constructor. 
        chrisAccount.withdraw(200);
        chrisAccount.withdraw(9800);
        chrisAccount.withdraw(1);

        chrisAccount.deposit(5);

    }
    }
// imperative  paradigm is where we write out literally everything like java
//declarative is more like javascript where u can call things at the point you ever need it. 