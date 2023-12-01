package hexlet.code.games;

import java.util.Scanner;

public class GCD {

    private static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";

    private static final int MAX_VALUE_COEFFICIENT = 100;

    private static final int MIN_VALUE_COEFFICIENT = 1;

    public static void gameGCD(Scanner input, String playerName, int tries, String[] qA) {
        int triesCounter = 0;
        boolean progress = true;
        while (triesCounter < tries && progress) {
            int numberFirst = (int) (MIN_VALUE_COEFFICIENT + Math.random() * MAX_VALUE_COEFFICIENT);
            int numberSecond = (int) (MIN_VALUE_COEFFICIENT + Math.random() * MAX_VALUE_COEFFICIENT);
            qA[0] = numberFirst + " " + numberSecond;
            qA[1] = Integer.toString(greatestCommonDivisor(numberFirst, numberSecond));
            progress = Engine.engine(input, playerName, DESCRIPTION, qA, triesCounter, tries);
            triesCounter++;
        }
    }

    private static int greatestCommonDivisor(int n1, int n2) {
        while (n1 != n2) {
            if (n1 > n2) {
                n1 = n1 - n2;
            } else {
                n2 = n2 - n1;
            }
        }
        return n1;
    }

}
