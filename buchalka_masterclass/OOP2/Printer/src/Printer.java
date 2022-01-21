public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex){
        if(tonerLevel >= 0 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        }
        else{
            this.tonerLevel = -1;
        }

        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int printPages(int pages){
        int pagesToPrint = pages;
        //System.out.println("Pages to print before is: " + pagesToPrint);
        if(duplex){
            System.out.println("Printing in duplex mode");
            pagesToPrint = (pagesToPrint / 2) + (pagesToPrint % 2);
        }

       // System.out.println("Pages to print after is: " + pagesToPrint);

        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int addToner(int tonerAmount){
        if(tonerAmount > 0 && tonerAmount <= 100){
            if((this.tonerLevel + tonerAmount) <= 100){
                this.tonerLevel += tonerAmount;
                return this.tonerLevel;
            }
        }
        return -1;
    }

    public int getPagesPrinted(){
        return pagesPrinted;
    }
}
