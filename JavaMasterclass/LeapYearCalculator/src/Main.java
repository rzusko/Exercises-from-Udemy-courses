public class Main {

    public static void main(String[] args) {

        System.out.println(LeapYear.isLeapYear(-1600)); // false
        System.out.println(LeapYear.isLeapYear(1600));  // true
        System.out.println(LeapYear.isLeapYear(2017));  // false
        System.out.println(LeapYear.isLeapYear(2000));  // true
        System.out.println(LeapYear.isLeapYear(2100));  // false
        System.out.println(LeapYear.isLeapYear(1924));  // true
    }
}
