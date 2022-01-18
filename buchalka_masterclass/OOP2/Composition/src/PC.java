public class PC {
    private Case PCCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case PCCase, Monitor monitor, Motherboard motherboard) {
        this.PCCase = PCCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public Case getPCCase() {
        return PCCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }
}
