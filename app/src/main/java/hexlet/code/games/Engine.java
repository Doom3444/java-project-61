package hexlet.code.games;

import java.util.Scanner;

public class Engine {

    public static boolean engine(Scanner input, String playerName,
                                 String question,
                                 String correctAnswer,
                                 int counter,
                                 int maxTries) {
        System.out.print("Question: " + question + "\nYour Answer: ");
        String playerAnswer = input.next();
        if (playerAnswer.equals(correctAnswer) && counter < maxTries - 1) {
            System.out.println("Correct!");
            return true;
        }
        if (playerAnswer.equals(correctAnswer) && counter == maxTries - 1) {
            System.out.println("Correct!");
            System.out.println("Congratulations, " + playerName + "!");
            return true;
        }
        System.out.println("'" + playerAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
        System.out.println("Let's try again, " + playerName + "!");
        return false;
    }

}
