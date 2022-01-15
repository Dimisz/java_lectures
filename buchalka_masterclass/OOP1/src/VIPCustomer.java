public class VIPCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VIPCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
        System.out.println("Constructor with three parameters called");
    }

    public VIPCustomer(String name, String emailAddress){
        this(name, 10000.0, emailAddress);
        System.out.println("Constructor with two params called");
    }

    public VIPCustomer(String name){
        this(name, 99999.0, "new@mail.com");
            System.out.println("Constructor with one parameter called");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void printReport(){
        System.out.println("Name: " + name);
        System.out.println("email: " + emailAddress);
        System.out.println("Credit Limit: " + creditLimit);
    }
}
