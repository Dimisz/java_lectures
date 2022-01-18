public class PC {
    private Case PCCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case PCCase, Monitor monitor, Motherboard motherboard) {
        this.PCCase = PCCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    private Case getPCCase() {
        return PCCase;
    }

    private Monitor getMonitor() {
        return monitor;
    }

    private Motherboard getMotherboard() {
        return motherboard;
    }

    private void drawLogo(){
        System.out.println("drawing logo");
        getMonitor().drawPixelAt(1200, 50, "yellow");
    }
    public void powerUp(){
        getPCCase().pressPowerButton();
        drawLogo();
    }
}
