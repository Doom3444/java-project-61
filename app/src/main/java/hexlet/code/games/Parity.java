package hexlet.code.games;

import java.util.Scanner;

public class Parity {

    private static final int MAX_VALUE_COEFFICIENT = 100;

    public static void parity(Scanner input, String playerName, int tries) {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int triesCounter = 0;
        boolean progress = true;
        while (triesCounter < tries && progress) {
            int number = (int) (Math.random() * MAX_VALUE_COEFFICIENT);
            String question = question(number);
            String correctAnswer = isEven(number) ? "yes" : "no";
            progress = Engine.engine(input, playerName, question, correctAnswer, triesCounter, tries);
            triesCounter++;
        }
    }

    private static String question(int number) {
        return String.valueOf(number);
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

}
