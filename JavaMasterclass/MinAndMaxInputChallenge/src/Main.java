/*
        -Read the numbers from the console entered by the user
        and print the minimum and maximum number the user has entered.
        -Before the user enters the number, print the message "Enter number:"
        -If the user enters an invalid number, break out of the loop
        and print the minimum and maximum number.

        Hint:
        -Use an endless while loop.

        Bonus:
        -Create a project with the name MinAndMaxInputChallenge.
*/


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;
        boolean first = true;

        while (true) {
            System.out.println("Enter number: ");
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                int number = scanner.nextInt();

                if (first) {
                    min = number;
                    max = number;
                    first = false;
                }

                if (number < min) {
                    min = number;
                }

                if (number > max) {
                    max = number;
                }


            } else {
                break;
            }

            scanner.nextLine();

        }

        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);
        scanner.close();
    }
}

