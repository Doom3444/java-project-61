package hexlet.code.games;

import java.util.Scanner;

public class PrimeNumber {

    private static final int MAX_VALUE_COEFFICIENT = 100;

    private static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void primeNumber(Scanner input, String playerName, int tries, String[] qA) {
        int triesCounter = 0;
        boolean progress = true;
        while (triesCounter < tries && progress) {
            int number = (int) (Math.random() * MAX_VALUE_COEFFICIENT);
            qA[0] = String.valueOf(number);
            qA[1] = isPrime(number) ? "yes" : "no";
            progress = Engine.engine(input, playerName, DESCRIPTION, qA, triesCounter, tries);
            triesCounter++;
        }
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
