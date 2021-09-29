public class Main {

    public static void main(String[] args) {
        System.out.println("Numbers 12 and 23 has shared digit is "
                + SharedDigit.hasSharedDigit(12,23));   // true
        System.out.println("Numbers 9 and 99 has shared digit is "
                + SharedDigit.hasSharedDigit(9,99));   // false
        System.out.println("Numbers 15 and 55 has shared digit is "
                + SharedDigit.hasSharedDigit(15,55));   // true
        System.out.println("Numbers 12 and 43 has shared digit is "
                + SharedDigit.hasSharedDigit(12,43));   // false

    }
}
