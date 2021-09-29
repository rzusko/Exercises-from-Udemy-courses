package Java.MasterClass;

public class Main {

    public static void main(String[] args) {
	    // 1. Create a double variable with a value of 20.00
        double firstVar = 20.00;

        // 2. Create a second variable of type double with the value 80.00
        double secondVar = 80.00;

        // 3. Add both numbers together and multiply by 100.00
        double total = (firstVar + secondVar) * 100.00;
        System.out.println("total = " + total);

        // 4. Use the remainder operator to figure out what the remainder from the result
        // of the operation in step 3 and 40.00. We used the modulus or remainder operator
        // on ints in the course, but we can also use it on a double.
        double remainder = total % 40.00;
        System.out.println("remainder = " + remainder);

        // 5. Create boolean variable that assigns the value true if the remainder in #4 is 0,
        // or false if its not zero.
        boolean withoutRemaider = (remainder == 0.0);

        // 6. Output the boolean variable.
        System.out.println("result = " + withoutRemaider);

        // 7. Write an if-then statement that displays a message "Got some remainder"
        // if step 5 is not true. Don't be surprised if you see output for this step,
        // where you might expect it not show. I'll explain it in my solution.
        if (!withoutRemaider) {
            System.out.println("Got some remainder!");
        }

    }
}
