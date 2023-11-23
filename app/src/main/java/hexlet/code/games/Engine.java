package hexlet.code.games;

import java.util.Scanner;

public class Engine {
    public static final int MAX_TRIES_COEFFICIENT = 3;
    public static void engine(String playerChoice, Scanner input) {
        String playerName;
        switch (playerChoice) {
            case "1":
                playerName = Cli.cli(input);
                return;
            case "2":
                playerName = Cli.cli(input);
                System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
                break;
            case "3":
                playerName = Cli.cli(input);
                System.out.println("What is the result of the expression?");
                break;
            case "4":
                playerName = Cli.cli(input);
                System.out.println("Find the greatest common divisor of given numbers.");
                break;
            case "5":
                playerName = Cli.cli(input);
                System.out.println("What number is missing in the progression?");
                break;
            case "6":
                playerName = Cli.cli(input);
                System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
                break;
            case "0":
                return;
            default:
                System.out.println("Invalid choice");
                return;
        }
        int triesCounter = 0;
        boolean progress = true;
        String correctAnswer;
        while (triesCounter < MAX_TRIES_COEFFICIENT && progress) {
            switch (playerChoice) {
                case "2":
                    correctAnswer = Parity.parity();
                    break;
                case "3":
                    correctAnswer = Integer.toString(Calc.calc());
                    break;
                case "4":
                    correctAnswer = Integer.toString(GCD.gcd());
                    break;
                case "5":
                    int[] arrayOfNumbers = Progression.progression();
                    int missingNumber = Progression.missingNumber(arrayOfNumbers);
                    correctAnswer = Integer.toString(missingNumber);
                    Progression.Question(arrayOfNumbers, missingNumber);
                    break;
                case "6":
                    correctAnswer = PrimeNumber.primeNumber();
                    break;
                default:
                    correctAnswer = "";
                    break;
            }
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
