public class Main {

    public static void main(String[] args) {
        System.out.println("Greatest common divisor of 25 and 15 is "
                + GreatestCommonDivisor.getGreatestCommonDivisor(25, 15));  // 5
        System.out.println("Greatest common divisor of 12 and 30 is "
                + GreatestCommonDivisor.getGreatestCommonDivisor(12, 30));  // 6
        System.out.println("Greatest common divisor of 9 and 18 is "
                + GreatestCommonDivisor.getGreatestCommonDivisor(9, 18));  // -1
        System.out.println("Greatest common divisor of 81 and 153 is "
                + GreatestCommonDivisor.getGreatestCommonDivisor(81, 153));  // 9
    }
}
