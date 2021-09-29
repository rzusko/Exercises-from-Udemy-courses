public class Main {

    public static void main(String[] args) {

        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175));    //true
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176));       //false
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0));           //true
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123));      //FALSE
    }
}
