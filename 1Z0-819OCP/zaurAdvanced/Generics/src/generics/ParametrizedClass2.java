package generics;

public class ParametrizedClass2 {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("Hi there", 20);
        System.out.println("pair1:");
        System.out.println("First value: " + pair1.getFirstValue());
        System.out.println("Second value: " + pair1.getSecondValue());

        Pair<Integer, Double> pair2 = new Pair<>(20, 20.9999);
        System.out.println("pair2:");
        System.out.println("First value: " + pair2.getFirstValue());
        System.out.println("Second value: " + pair2.getSecondValue());

        SingleParamPair<String> pair3 = new SingleParamPair<>("Hi there", "How are you?");
        System.out.println("pair3:");
        System.out.println("First value: " + pair3.getFirstValue());
        System.out.println("Second value: " + pair3.getSecondValue());
    }
}

class Pair<V1, V2>{
    private V1 value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getFirstValue(){
        return value1;
    }

    public V2 getSecondValue(){
        return value2;
    }
}

class SingleParamPair<V>{
    private V value1;
    private V value2;

    public SingleParamPair(V value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V getFirstValue(){
        return value1;
    }

    public V getSecondValue(){
        return value2;
    }
}

