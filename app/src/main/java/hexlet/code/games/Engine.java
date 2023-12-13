package hexlet.code.games;

import java.util.Scanner;

public class Engine {

    public static final int MAX_TRIES_COEFFICIENT = 3;

    public static final int QUESTION_AND_ANSWERS_COUNT = 2;

    public static void engine(String description, String[][] qAndA) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        String playerName = input.next();
        System.out.println("Hello, " + playerName + "!\n" + description);
        for (String[] qA: qAndA) {
            System.out.print("Question: " + qA[0] + "\nYour Answer: ");
            String playerAnswer = input.next();
            if (!playerAnswer.equals(qA[1])) {
                System.out.println("'" + playerAnswer + "' is wrong answer ;(. Correct answer was '" + qA[1] + "'.");
                System.out.println("Let's try again, " + playerName + "!");
                return;
            }
            System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + playerName + "!");
    }

}
