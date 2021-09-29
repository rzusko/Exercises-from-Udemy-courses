public class Main {

    public static void main(String[] args) {

        System.out.println(NumberToWords.getDigitCount(0)); // 1
        System.out.println(NumberToWords.getDigitCount(123)); // 3
        System.out.println(NumberToWords.getDigitCount(-12)); // -1
        System.out.println(NumberToWords.getDigitCount(5200)); // 4
        System.out.println("------------------");
        System.out.println(NumberToWords.reverse(-121));    // -121
        System.out.println(NumberToWords.reverse(1212));    // 2121
        System.out.println(NumberToWords.reverse(1234));    // 4321
        System.out.println(NumberToWords.reverse(100));    // 1
        System.out.println("-------------------");
        System.out.println(123);
        NumberToWords.numberToWords(123);
        System.out.println("***");
        System.out.println(1010);
        NumberToWords.numberToWords(1010);
        System.out.println("***");
        System.out.println(1000);
        NumberToWords.numberToWords(1000);
        System.out.println("***");
        System.out.println(-12);
        NumberToWords.numberToWords(-12);
    }
}
