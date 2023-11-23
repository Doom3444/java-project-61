package hexlet.code.games;

import java.util.Scanner;

public class Engine {
    private static final int MAX_TRIES_COEFFICIENT = 3;
    public static void engine(String playerChoice, Scanner input) {
        String playerName = Cli.cli(input);
        if (playerChoice.equals("1")) {
            return;
        }
        int triesCounter = 0;
        boolean progress = true;
        while (triesCounter < MAX_TRIES_COEFFICIENT && progress) {
            String correctAnswer = correctAnswer(playerChoice, triesCounter);
            String playerAnswer = input.next();
            progress = templateAnswer(playerName, correctAnswer, playerAnswer, triesCounter);
            triesCounter++;
        }
    }
    private static String correctAnswer(String playerChoice, int triesCount) {
        String answer = "";
        if (playerChoice.equals("2")) {
            answer = Parity.parity(triesCount);
        }
        if (playerChoice.equals("3")) {
            answer = Integer.toString(Calc.calc(triesCount));
        }
        if (playerChoice.equals("4")) {
            answer = Integer.toString(GCD.gcd(triesCount));
        }
        if (playerChoice.equals("5")) {
            answer = Integer.toString(Progression.progression(triesCount));
        }
        if (playerChoice.equals("6")) {
            answer = PrimeNumber.primeNumber(triesCount);
        }
        return answer;
    }
    private static boolean templateAnswer(String playerName,
                                         String correctAnswer,
                                         String playerAnswer,
                                         int counter) {
        if (playerAnswer.equals(correctAnswer) && counter < MAX_TRIES_COEFFICIENT - 1) {
            System.out.println("Correct!");
            return true;
        }
        if (playerAnswer.equals(correctAnswer) && counter == MAX_TRIES_COEFFICIENT - 1) {
            System.out.println("Correct!");
            System.out.println("Congratulations, " + playerName + "!");
            return true;
        }
        System.out.println("'" + playerAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
        System.out.println("Let's try again, " + playerName + "!");
        return false;
    }
}
