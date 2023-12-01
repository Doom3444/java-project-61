package hexlet.code.games;

import java.util.Scanner;

public class Parity {

    private static final int MAX_VALUE_COEFFICIENT = 100;

    private static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void parity(Scanner input, String playerName, int tries, String[] qA) {
        int triesCounter = 0;
        boolean progress = true;
        while (triesCounter < tries && progress) {
            int number = (int) (Math.random() * MAX_VALUE_COEFFICIENT);
            qA[0] = String.valueOf(number);
            qA[1] = isEven(number) ? "yes" : "no";
            progress = Engine.engine(input, playerName, DESCRIPTION, qA, triesCounter, tries);
            triesCounter++;
        }
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

}
