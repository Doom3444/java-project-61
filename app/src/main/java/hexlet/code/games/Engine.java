package hexlet.code.games;

import java.util.Scanner;

public class Engine {
    public static final int MAX_TRIES_COEFFICIENT = 3;
    public static void engine(String playerChoice, Scanner input) {
        int triesCounter = 0;
        boolean progress = true;
        switch (playerChoice) {
            case "1":
                game1(input);
                break;
            case "2":
                game2(input, progress, triesCounter);
                break;
            case "3":
                game3(input, progress, triesCounter);
                break;
            case "4":
                game4(input, progress, triesCounter);
                break;
            case "5":
                game5(input, progress, triesCounter);
                break;
            case "6":
                game6(input, progress, triesCounter);
                break;
            case "0":
                return;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
    public static void game1(Scanner input) {
        String playerName = Cli.cli(input);
    }
    public static void game2(Scanner input, boolean progress, int triesCounter) {
        String playerName = Cli.cli(input);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        while (triesCounter < MAX_TRIES_COEFFICIENT && progress) {
            String correctAnswer = Parity.parity();
            String playerAnswer = input.next();
            progress = templateAnswer(playerName, correctAnswer, playerAnswer, triesCounter);
            triesCounter++;
        }
    }
    public static void game3(Scanner input, boolean progress, int triesCounter) {
        String playerName = Cli.cli(input);
        System.out.println("What is the result of the expression?");
        while (triesCounter < MAX_TRIES_COEFFICIENT && progress) {
            String correctAnswer = Integer.toString(Calc.calc());
            String playerAnswer = input.next();
            progress = templateAnswer(playerName, correctAnswer, playerAnswer, triesCounter);
            triesCounter++;
        }
    }
    public static void game4(Scanner input, boolean progress, int triesCounter) {
        String playerName = Cli.cli(input);
        System.out.println("Find the greatest common divisor of given numbers.");
        while (triesCounter < MAX_TRIES_COEFFICIENT && progress) {
            String correctAnswer = Integer.toString(GCD.gcd());
            String playerAnswer = input.next();
            progress = templateAnswer(playerName, correctAnswer, playerAnswer, triesCounter);
            triesCounter++;
        }
    }
    public static void game5(Scanner input, boolean progress, int triesCounter) {
        String playerName = Cli.cli(input);
        System.out.println("What number is missing in the progression?");
        while (triesCounter < MAX_TRIES_COEFFICIENT && progress) {
            String correctAnswer = Integer.toString(Progression.progression());
            String playerAnswer = input.next();
            progress = templateAnswer(playerName, correctAnswer, playerAnswer, triesCounter);
            triesCounter++;
        }
    }
    public static void game6(Scanner input, boolean progress, int triesCounter) {
        String playerName = Cli.cli(input);
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
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
