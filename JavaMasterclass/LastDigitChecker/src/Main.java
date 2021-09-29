public class Main {

    public static void main(String[] args) {
        System.out.println("10 " + LastDigitChecker.isValid(10));
        System.out.println("468 " + LastDigitChecker.isValid(468));
        System.out.println("1051 " + LastDigitChecker.isValid(1051));
        System.out.println("******************");
        System.out.println(LastDigitChecker.hasSameLastDigit(41, 22, 71));  // true
        System.out.println(LastDigitChecker.hasSameLastDigit(23,32,42));    // true
        System.out.println(LastDigitChecker.hasSameLastDigit(9, 99, 999));  // false
    }
}
