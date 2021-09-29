public class Main {

    public static void main(String[] args) {
        System.out.println("Sum of even digits in number 123456789 is "
                + EvenDigitSum.getEvenDigitSum(123456789));     // 20
        System.out.println("Sum of even digits in number 252 is "
                + EvenDigitSum.getEvenDigitSum(252));     // 4
        System.out.println("Sum of even digits in number -22 is "
                + EvenDigitSum.getEvenDigitSum(-22));     // -1 - invalid value
    }
}
