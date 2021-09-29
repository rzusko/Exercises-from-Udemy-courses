package Java.MasterClass;

import com.radoslavzusko.math.Series;

public class Main {

    public static void main(String[] args) {
	    for (int i = 0; i <= 10; i++) {
            System.out.println(i);
            System.out.println("Sum: " + Series.nSum(i));
            System.out.println("Factorial: " + Series.factorial(i));
            System.out.println("Fibonacci: " + Series.fibonacci(i));
            System.out.println("*******************");
        }
    }
}
