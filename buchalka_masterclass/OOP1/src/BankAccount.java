import java.sql.SQLOutput;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        System.out.println("Empty constructor called...");
    }

    public BankAccount(String accountNumber, double balance, String customerName,
                       String email, String phoneNumber){
        System.out.println("Calling parametrized constructor");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }



    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public String getCustomerName(){
        return customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void deposit(double amount){
        if (amount <= 0){
            System.out.println("Sorry, the amount should be greater than zero");
        }
        else{
            balance += amount;
            System.out.println("Updated balance: " + balance);
        }
    }

    public void withdraw(double amount){
        if(amount <= 0){
            System.out.println("Sorry, the amount should be greater than zero");
        }
        else {
            if((balance - amount) < 0){
                System.out.println("Insufficient funds...");
            }
            else{
                balance -= amount;
                System.out.println("Withdrawing " + amount + "...");
                System.out.println("Current balance: " + balance);
            }
        }
    }

    public void printAccountReport(){
        System.out.println("Owner's name: " + customerName);
        System.out.println("Customer email: " + email);
        System.out.println("Customer phone number: " + phoneNumber);
        System.out.println("Balance: " + balance);
    }
}
