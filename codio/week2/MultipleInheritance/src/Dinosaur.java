public class Dinosaur extends Carnivore{
    private double size;
    private double weight;

    public Dinosaur(String d, double s, double w) {
        super(d);
        size = s;
        weight = w;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double newSize) {
        size = newSize;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double newWeight) {
        weight = newWeight;
    }
}
