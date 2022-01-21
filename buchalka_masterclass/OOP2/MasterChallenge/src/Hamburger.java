public class Hamburger {
    private String name;
    private String meat;
    private String breadRollType;
    private double price;

    private String addition1Name;
    private double addition1Price = 0;
    private String addition2Name;
    private double addition2Price = 0;
    private String addition3Name;
    private double addition3Price = 0;
    private String addition4Name;
    private double addition4Price = 0;


    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
        System.out.println(this.name + " hamburger on a " + this.breadRollType +
                " roll with " + this.meat + ", price is " + this.price);
    }

    public void addHamburgerAddition1(String additionName, double additionPrice){
        addition1Name = additionName;
        addition1Price = additionPrice;
        System.out.println("Added " + this.addition1Name +
                " for an extra " + this.addition1Price);
    }

    public void addHamburgerAddition2(String additionName, double additionPrice){
        addition2Name = additionName;
        addition2Price = additionPrice;
        System.out.println("Added " + this.addition2Name +
                " for an extra " + this.addition2Price);
    }

    public void addHamburgerAddition3(String additionName, double additionPrice){
        addition3Name = additionName;
        addition3Price = additionPrice;
        System.out.println("Added " + this.addition3Name +
                " for an extra " + this.addition3Price);
    }

    public void addHamburgerAddition4(String additionName, double additionPrice){
        addition4Name = additionName;
        addition4Price = additionPrice;
        System.out.println("Added " + this.addition4Name +
                " for an extra " + this.addition4Price);
    }

    public double itemizeHamburger(){
        double total = price + addition1Price + addition2Price + addition3Price + addition4Price;
        return total;
    }


}
