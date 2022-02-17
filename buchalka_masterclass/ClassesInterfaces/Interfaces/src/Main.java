public class Main {

    public static void main(String[] args) {
        ITelephone office = new DeskPhone(12345);
        office.powerOn();
        office.callPhone(4321);
        office.answer();
    }
}
