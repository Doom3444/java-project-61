package hexlet.code.games;

import java.util.Scanner;

public class PrimeNumber {
    private static final int MAX_VALUE_COEFFICIENT = 100;

    public static void primeNumber(Scanner input, String playerName, int tries) {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        int triesCounter = 0;
        boolean progress = true;
        while (triesCounter < tries && progress) {
            int number = (int) (Math.random() * MAX_VALUE_COEFFICIENT);
            String question = question(number);
            String correctAnswer = isPrime(number) ? "yes" : "no";
            progress = Engine.engine(input, playerName, question, correctAnswer, triesCounter, tries);
            triesCounter++;
        }
    }

    private static String question(int number) {
        return String.valueOf(number);
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
