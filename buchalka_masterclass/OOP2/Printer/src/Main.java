public class Main {
    public static void main(String[] args) {
        Printer printer1 = new Printer(80, 0, false);
        printer1.report();
        printer1.printPage(230);
        printer1.printPage(100);
        printer1.fillToner(12);
        printer1.report();
        printer1.fillToner(100);
        printer1.report();
    }
}
