/*  Create a method called calcFeetAndInchesToCentimeters
*   It needs to hava two parameters.
*   feet is the first parameter, inches is the 2nd parameter
*
*   You should validate that the first parameter feet is >= 0
*   You should validate that the 2nd parameter inches is >= 0 and <= 12
*   return -1 from the method if either of the above is not true
*
*   If the parameters are valid, then calculate how many centimeters
*   comprise the feet and inches passed to this method and return
*   that value.
*
*   Create 2nd method of the same name but with only one parameter
*   inches is the parameter
*   validate that its >= 0
*   return -1 iv it is not true
*   But if its valid, then calculate how many feet are in the inches
*   and then here is the tricky part
*   call the other overloaded method passing the correct feet and inches
*   calculated so that it can calculate correctly.
*   hints: Use double for your number datatypes is probably a good idea
*   1 inch = 2.54cm and one foot = 12 inches
*   use the link I give you to confirm your code is calculating correctly.
*   Calling another overloaded method just requires you to use the
*   right number of parameters.
*/



package Java.MasterClass;

public class Main {

    public static void main(String[] args) {
        System.out.println("7ft 3in = " + calcFeetAndInchesToCentimeters(7,3)); //220.98
        System.out.println("73in = " + calcFeetAndInchesToCentimeters(73));    //185.42
        System.out.println("-1ft 3in = " + calcFeetAndInchesToCentimeters(-1,3)); //-1

    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        if (feet >= 0) {
            if ((inches >= 0) && (inches <= 12)) {
                inches += feet * 12;
                double centimeters = inches * 2.54;

                return centimeters;
            }
        }

        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {

        if (inches >= 0) {
            double feet = (int) inches / 12;
            //inches = inches % 12;
            double remainingInches = (int) inches % 12;

            return calcFeetAndInchesToCentimeters(feet, remainingInches);
        }

        return -1;
    }

}
