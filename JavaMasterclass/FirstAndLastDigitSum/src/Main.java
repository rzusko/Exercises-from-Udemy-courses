public class Main {

    public static void main(String[] args) {
        System.out.println("Sum of the first and last digit of the number 252 is "
                + FirstLastDigitSum.sumFirstAndLastDigit(252));     // 4
        System.out.println("Sum of the first and last digit of the number 257 is "
                + FirstLastDigitSum.sumFirstAndLastDigit(257));     // 9
        System.out.println("Sum of the first and last digit of the number 0 is "
                + FirstLastDigitSum.sumFirstAndLastDigit(0));       // 0
        System.out.println("Sum of the first and last digit of the number 5 is "
                + FirstLastDigitSum.sumFirstAndLastDigit(5));       // 10
        System.out.println("Sum of the first and last digit of the number -10 is "
                + FirstLastDigitSum.sumFirstAndLastDigit(-10));     // -1
    }
}
