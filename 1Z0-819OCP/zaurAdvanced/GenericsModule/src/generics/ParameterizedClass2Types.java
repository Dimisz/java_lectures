package generics;

public class ParameterizedClass2Types {
    public static void main(String[] args) {
        Pair<String, Integer> firstStudent = new Pair<>("John", 5);
        Pair<String, Integer> secondStudent = new Pair<>("Mark", 10);
        System.out.println(firstStudent);
        System.out.println(secondStudent);
    }
}

class Pair<V1, V2>{
    private V1 value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2){
        this.value1 = value1;
        this.value2 = value2;
    }

    public String toString(){
        return value1 + ": " + value2;
    }
}
