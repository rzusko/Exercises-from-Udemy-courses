package Java.MasterClass;

public class Main {

    public static void main(String[] args) {
        // Create a new switch statement using char instead of int
        // create a new char variable
        // create a switch statement testing for
        // A, B, C, D, or E
        // display a message if any of these are found and then break
        // Add a default which displays a message saying not found

        char charValue = 'G';

        switch (charValue) {
            case 'A':
                System.out.println("Value is A");
                break;

            case 'B':
                System.out.println("Value is B");
                break;

            case 'C':
                System.out.println("Value is C");
                break;

            case 'D':
                System.out.println("Value is D");
                break;

            case 'E':
                System.out.println("Value is E");
                break;

            default:
                System.out.println("Value not found");
                break;
        }
    }
}
