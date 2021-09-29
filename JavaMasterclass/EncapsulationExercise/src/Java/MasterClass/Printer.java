package Java.MasterClass;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if ((tonerLevel >= 0) && (tonerLevel <= 100)) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }

        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        if ((tonerAmount > 0) && (tonerAmount <= 100)) {
            int newTonerLevel = this.tonerLevel + tonerAmount;
            if (newTonerLevel > 100) {
                return -1;
            } else {
                this.tonerLevel = newTonerLevel;
                return this.tonerLevel;
            }
        }
        return -1;
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if (duplex) {
            System.out.println("Printing in duplex mode");
            pagesToPrint = (pagesToPrint / 2) + (pagesToPrint % 2);
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
