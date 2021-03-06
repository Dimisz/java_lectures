public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private double healthyExtra1Price = 0;
    private String healthyExtra2Name;
    private double healthyExtra2Price = 0;

    public HealthyBurger(String meat, double price){
        super("Healthy", meat, price, "Brown rye");
    }

    public void addHealthyAddition1(String name, double price){
        healthyExtra1Name = name;
        healthyExtra1Price = price;
        System.out.println("Added " + this.healthyExtra1Name +
                " for an extra " + this.healthyExtra1Price);
    }

    public void addHealthyAddition2(String name, double price){
        healthyExtra2Name = name;
        healthyExtra2Price = price;
        System.out.println("Added " + this.healthyExtra2Name +
                " for an extra " + this.healthyExtra2Price);
    }

    @Override
    public double itemizeHamburger() {
        return super.itemizeHamburger() + healthyExtra1Price + healthyExtra2Price;
    }
}
