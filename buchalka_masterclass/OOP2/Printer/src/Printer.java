public class Printer {
    private int tonerLevel;
    private int numPagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, int numPagesPrinted, boolean duplex){
        if(tonerLevel >= 0 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        }
        else{
            this.tonerLevel = 100;
        }

        if(numPagesPrinted >= 0){
            this.numPagesPrinted = numPagesPrinted;
        }
        else{
            this.numPagesPrinted = 0;
        }

        this.duplex = duplex;
    }

    public void printPage(int numPages){
        System.out.println("Printing " + numPages + "...");
        this.numPagesPrinted += numPages;
    }

    public void fillToner(int percent){
        if((this.tonerLevel + percent) <= 100){
            this.tonerLevel += percent;
        }
        else if(tonerLevel + percent > 100){
            tonerLevel = 100;
        }
    }

    public void report(){
        System.out.println("Toner level: " + tonerLevel);
        System.out.println("Numer of pages printed: " + numPagesPrinted);
        System.out.println("Duplex: " + duplex);
    }
}
