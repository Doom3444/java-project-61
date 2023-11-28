package hexlet.code.games;

import java.util.Scanner;

public class GCD {
    private static final int MAX_VALUE_COEFFICIENT = 100;

    private static final int MIN_VALUE_COEFFICIENT = 1;

    public static void gcd(Scanner input, String playerName, int tries) {
        System.out.println("Find the greatest common divisor of given numbers.");
        int triesCounter = 0;
        boolean progress = true;
        while (triesCounter < tries && progress) {
            int numberFirst = (int) (MIN_VALUE_COEFFICIENT + Math.random() * MAX_VALUE_COEFFICIENT);
            int numberSecond = (int) (MIN_VALUE_COEFFICIENT + Math.random() * MAX_VALUE_COEFFICIENT);
            String question = question(numberFirst, numberSecond);
            int correctAnswer = greatestCommonDivisor(numberFirst, numberSecond);
            progress = Engine.engine(input, playerName, question, Integer.toString(correctAnswer), triesCounter, tries);
            triesCounter++;
        }
    }

    private static String question(int n1, int n2) {
        return n1 + " " + n2;
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
