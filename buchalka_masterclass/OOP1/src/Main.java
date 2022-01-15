public class Main {

    public static void main(String[] args) {
//        SimpleCalculator calculator = new SimpleCalculator();
//        calculator.setFirstNumber(5.0);
//        calculator.setSecondNumber(4);
//        System.out.println("add= " + calculator.getAdditionResult());
//        System.out.println("subtract= " + calculator.getSubtractionResult());
//        calculator.setFirstNumber(5.25);
//        calculator.setSecondNumber(0);
//        System.out.println("multiply= " + calculator.getMultiplicationResult());
//        System.out.println("divide= " + calculator.getDivisionResult());


        //TESTING PERSON CLASS
//        System.out.println("\n\n=========TESTING PERSON CLASS========");
//        Person person = new Person();
//        person.setFirstName("");   // firstName is set to empty string
//        person.setLastName("");    // lastName is set to empty string
//        person.setAge(10);
//        System.out.println("fullName= " + person.getFullName());
//        System.out.println("teen= " + person.isTeen());
//        person.setFirstName("John");    // firstName is set to John
//        person.setAge(18);
//        System.out.println("fullName= " + person.getFullName());
//        System.out.println("teen= " + person.isTeen());
//        person.setLastName("Smith");    // lastName is set to Smith
//        System.out.println("fullName= " + person.getFullName());

        System.out.println("\n\n=========TESTING BANK=============");
        BankAccount account = new BankAccount();
        account.setAccountNumber("123456");
        account.setCustomerName("Vladimir Solovyov");
        account.setBalance(20000);
        account.printAccountReport();
        account.withdraw(30000);
        account.deposit(15);
        account.withdraw(1000);
        account.printAccountReport();
        System.out.println("Parametrized constructor...");
        BankAccount bobsAccount = new BankAccount("23456", 0.0, "Bob Brown",
                "bob@mail.com", "1232345");
        bobsAccount.printAccountReport();

    }
}
