package hexlet.code.games;

import java.util.Scanner;

public class Engine {

    private static final int FIRST_TRY = 0;

    public static boolean engine(Scanner input,
                                 String playerName,
                                 String description,
                                 String[] qA,
                                 int counter,
                                 int maxTries) {
        if (counter == FIRST_TRY) {
            System.out.println(description);
        }
        System.out.print("Question: " + qA[0] + "\nYour Answer: ");
        String playerAnswer = input.next();
        if (playerAnswer.equals(qA[1]) && counter < maxTries - 1) {
            System.out.println("Correct!");
            return true;
        }
        if (playerAnswer.equals(qA[1]) && counter == maxTries - 1) {
            System.out.println("Correct!");
            System.out.println("Congratulations, " + playerName + "!");
            return true;
        }
        System.out.println("'" + playerAnswer + "' is wrong answer ;(. Correct answer was '" + qA[1] + "'.");
        System.out.println("Let's try again, " + playerName + "!");
        return false;
    }

}
