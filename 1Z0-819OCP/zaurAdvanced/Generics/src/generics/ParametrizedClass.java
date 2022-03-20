package generics;

public class ParametrizedClass {
    public static void main(String[] args) {
//        Info<String> info1 = new Info<>("Hi there");
//        System.out.println(info1);
//
//        Info<Integer> info2 = new Info<>(2);
//        System.out.println(info2);
    }
//    public void abc(Info<String> info){
//        String s = info.getValue();
//    }

//    public void abc(Info<Integer> info){
//        Integer i = info.getValue();
//    }
}

class Info<T>{
    private T value;

    public Info(T value){
        this.value = value;
    }

    @Override
    public String toString(){
        return "{[" + value + "]}";
    }

    public T getValue(){
        return value;
    }
}

//class Parent{
//    public void abc(Info<String> info){
//        String s = info.getValue();
//    }
//}
//
//class Child extends Parent{
//    public void abc(Info<Integer> info){
//        Integer s = info.getValue();
//    }
//}
