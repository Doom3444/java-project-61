package hexlet.code.games;

import java.util.Scanner;

public class Engine {
    public static final int MAX_TRIES_COEFFICIENT = 3;
    public static void engine(String playerChoice, Scanner input) {
        String playerName = Cli.cli(input);
        switch (playerChoice) {
            case "1":
                break;
            case "2":
                game2(playerName, input);
                break;
            case "3":
                game3(playerName, input);
                break;
            case "4":
                game4(playerName, input);
                break;
            case "5":
                game5(playerName, input);
                break;
            case "6":
                game6(playerName, input);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
    public static void game2(String playerName, Scanner input) {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int triesCounter = 0;
        boolean progress = true;
        while (triesCounter < MAX_TRIES_COEFFICIENT && progress) {
            String correctAnswer = Parity.parity();
            String playerAnswer = input.next();
            progress = templateAnswer(playerName, correctAnswer, playerAnswer, triesCounter);
            triesCounter++;
        }
    }
    public static void game3(String playerName, Scanner input) {
        System.out.println("What is the result of the expression?");
        int triesCounter = 0;
        boolean progress = true;
        while (triesCounter < MAX_TRIES_COEFFICIENT && progress) {
            String correctAnswer = Integer.toString(Calc.calc());
            String playerAnswer = input.next();
            progress = templateAnswer(playerName, correctAnswer, playerAnswer, triesCounter);
            triesCounter++;
        }
    }
    public static void game4(String playerName, Scanner input) {
        System.out.println("Find the greatest common divisor of given numbers.");
        int triesCounter = 0;
        boolean progress = true;
        while (triesCounter < MAX_TRIES_COEFFICIENT && progress) {
            String correctAnswer = Integer.toString(GCD.gcd());
            String playerAnswer = input.next();
            progress = templateAnswer(playerName, correctAnswer, playerAnswer, triesCounter);
            triesCounter++;
        }
    }
    public static void game5(String playerName, Scanner input) {
        System.out.println("What number is missing in the progression?");
        int triesCounter = 0;
        boolean progress = true;
        while (triesCounter < MAX_TRIES_COEFFICIENT && progress) {
            int[] arrayOfNumbers = Progression.progression();
            int missingNumber = Progression.missingNumber(arrayOfNumbers);
            String correctAnswer = Integer.toString(missingNumber);
            Progression.Question(arrayOfNumbers, missingNumber);
            String playerAnswer = input.next();
            progress = templateAnswer(playerName, correctAnswer, playerAnswer, triesCounter);
            triesCounter++;
        }
    }
    public static void game6(String playerName, Scanner input) {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        int triesCounter = 0;
        boolean progress = true;
        while (triesCounter < MAX_TRIES_COEFFICIENT && progress) {
            String correctAnswer = PrimeNumber.primeNumber();
            String playerAnswer = input.next();
            progress = templateAnswer(playerName, correctAnswer, playerAnswer, triesCounter);
            triesCounter++;
        }
    }
    public static boolean templateAnswer(String playerName,
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
