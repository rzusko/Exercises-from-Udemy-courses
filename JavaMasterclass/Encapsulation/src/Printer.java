// Create a class and demonstate proper encapsulation techniques
// the class will be called Printer
// It will simulate a real Computer Printer
// It should have fields for the toner Level, number of pages printed, and
// also whether its a duplex printer (capable of printing on both sides of the paper).
// Add methods to fill up the toner (up to a maximum of 100%), another method to
// simulate printing a page (which should increase the number of pages printed).
// Decide on the scope, whether to use constructors, and anything else you think is needed.

public class Printer {
    private int tonerLevel;
    private int numberOfPrintedPages;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {

        if ((tonerLevel >= 0) && (tonerLevel <= 100)) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }

        this.duplex = duplex;
        this.numberOfPrintedPages = 0;
    }

    public int fillUpToner(int amount) {
        if (amount > 0 && amount <= 100) {
            if (this.tonerLevel + amount > 100) {
                return -1;
            }
            this.tonerLevel += amount;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int printPage(int pages) {
        int pagesToPrint = pages;

        if (this.duplex) {

            pagesToPrint = (pagesToPrint / 2) + (pagesToPrint % 2);
            System.out.println("Printing in duplex mode");
        }

        this.numberOfPrintedPages += pagesToPrint;
        return pagesToPrint;
    }

    public int getNumberOfPrintedPages() {
        return numberOfPrintedPages;
    }
}
