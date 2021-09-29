// Create a program using arrays that sorts a list of integers in descending order.
// Descending order is highest value to lowest.
// In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
// ultimately have an array with 106,81,26, 15, 5 in it.
// Set up the program so that the numbers to sort are read in from the keyboard.
// Implement the following methods - getIntegers, printArray, and sortIntegers
// getIntegers returns an array of entered integers from keyboard
// printArray prints out the contents of the array
// and sortIntegers should sort the array and return a new array containing the sorted numbers
// you will have to figure out how to copy the array elements from the passed array into a new
// array and sort them and return the new sorted array.


import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] inputArray = getIntegers(5);
        System.out.println("*****\nEntered numbers: ");
        printArray(inputArray);
        int[] sortedArray = sortIntegers(inputArray);
        System.out.println("*****\nSorted numbers: ");
        printArray(sortedArray);

    }

    public static int[] getIntegers(int n) {
        int[] array = new int[n];

        System.out.println("Please enter numbers to sort:\r");

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " of array is: " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int[] newArray = new int[array.length];

        // copying values from array to newArray
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        // sorting values in newArray in descending order
        for (int i = 0; i < newArray.length; i++) {
            int max = 0;
            int position = 0;

            for (int j = i; j < newArray.length; j++) {
                if (newArray[j] > max) {
                    max = newArray[j];
                    position = j;
                }
            }

            int temp = newArray[i];
            newArray[i] = max;
            newArray[position] = temp;
        }

        return newArray;
    }
}