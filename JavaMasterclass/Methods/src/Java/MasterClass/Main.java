package Java.MasterClass;

public class Main {

    public static void main(String[] args) {
	    // Create a method called displayHighScorePosition
        // it should store a players name as a parameter,
        // and a 2nd parameter as a position in the high score table
        // You should display the players name along with a message
        // like "managed to get into position" and the position
        // they got and a further message "on the high score table".
        //
        // Create a 2nd method called calculateHighScorePosition
        // it should be sent one argument only, the player score
        // it should return an int
        // the return data should be
        // 1 if the score is > 1000
        // 2 if the score is > 500 and < 1000
        // 3 if the score is > 100 and < 500
        // 4 in all other cases
        // call both methods and display the results of the following
        // a score of 1500, 900, 400 and 50.
        //

        displayHighScorePosition("Player 1", calculateHighScorePosition(1500));
        displayHighScorePosition("Player 2", calculateHighScorePosition(900));
        displayHighScorePosition("Player 3", calculateHighScorePosition(400));
        displayHighScorePosition("Player 4", calculateHighScorePosition(50));
        displayHighScorePosition("Player 5", calculateHighScorePosition(1000));
        displayHighScorePosition("Player 6", calculateHighScorePosition(500));
        displayHighScorePosition("Player 7", calculateHighScorePosition(100));


    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position "
                + position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int score) {

//        if (score >= 1000) {
//            return 1;
//        } else if (score >= 500)  {
//            return 2;
//        } else if (score >= 100)  {
//            return 3;
//        }
//
//        return 4;

        int position = 4;   // assuming position 4 will be returned

        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }

        return position;
    }
}
