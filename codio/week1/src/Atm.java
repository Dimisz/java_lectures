public class Atm {
    private double money;

    public Atm(double money){
        this.money = money;
    }

    public double getMoney(){
        return money;
    }

    public void deposit(double amount){
        if(amount > 0) {
            money += amount;
        }
        else {
            System.out.println("You cannot deposit a negative amount of money.");
        }
    }

    public void withdraw(double amount){
        if(amount >= money){
            System.out.println("You do not have enough funds to withdraw that amount.");
        }
        else if(amount < 0){
            System.out.println("You cannot withdraw a negative amount of money.");
        }
        else{
            money -= amount;
        }
    }


    public static void main(String[] args) {
        // Atm myAtm = new Atm(1000);
        // myAtm.deposit(50);
        // System.out.println(myAtm.getMoney());
        // myAtm.withdraw(925);
        // System.out.println(myAtm.getMoney());

        //add code above this line

        //add code below this line

        // Atm myAtm = new Atm(1000);
        // myAtm.deposit(-50);
        // System.out.println(myAtm.getMoney());

        //add code below this line

        // Atm myAtm = new Atm(1000);
        // myAtm.withdraw(5000);
        // System.out.println(myAtm.getMoney());

        //add code below this line

//        Atm myAtm = new Atm(1000);
//        myAtm.withdraw(-50);
//        System.out.println(myAtm.getMoney());


    }
}
