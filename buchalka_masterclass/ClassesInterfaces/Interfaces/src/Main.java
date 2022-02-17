public class Main {

    public static void main(String[] args) {
        ITelephone office = new DeskPhone(12345);
        office.powerOn();
        office.callPhone(12345);
        office.answer();

        ITelephone cellPhone = new MobilePhone(122222);
//        cellPhone.powerOn();
        cellPhone.callPhone(122222);
        cellPhone.answer();
        cellPhone.dial(222);

    }
}
