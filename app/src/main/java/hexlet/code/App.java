package hexlet.code;
import games.Calc;
import games.Cli;
import games.GCD;
import games.Parity;
import games.PrimeNumber;
import games.Progression;
import java.util.Scanner;

public class App {
    public static int maxTriesCount = 3;
    public static void main(String[] args) {
        String playerName;
        String playerAnswer;
        String correctAnswer;
        Scanner input = new Scanner(System.in);
        String playerChoice;
        System.out.print("""
                Please enter the game number and press Enter
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                Your choice:\s""");
        playerChoice = input.next();
        int triesCounter;
        boolean progress;
        if (playerChoice.equals("1")) {
            playerName = Cli.cli(input);
        }
        if (playerChoice.equals("2")) {
            playerName = Cli.cli(input);
            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
            triesCounter = 0;
            progress = true;
            while (triesCounter < maxTriesCount && progress) {
                correctAnswer = Parity.parity();
                playerAnswer = input.next();
                progress = templateAnswer(playerName, correctAnswer, playerAnswer, triesCounter, maxTriesCount);
                triesCounter++;
            }
        }
        if (playerChoice.equals("3")) {
            playerName = Cli.cli(input);
            System.out.println("What is the result of the expression?");
            triesCounter = 0;
            progress = true;
            while (triesCounter < maxTriesCount && progress) {
                correctAnswer = Calc.calc();
                playerAnswer = input.next();
                progress = templateAnswer(playerName, correctAnswer, playerAnswer, triesCounter, maxTriesCount);
                triesCounter++;
            }
        }
        if (playerChoice.equals("4")) {
            playerName = Cli.cli(input);
            System.out.println("Find the greatest common divisor of given numbers.");
            triesCounter = 0;
            progress = true;
            while (triesCounter < maxTriesCount && progress) {
                correctAnswer = GCD.gcd();
                playerAnswer = input.next();
                progress = templateAnswer(playerName, correctAnswer, playerAnswer, triesCounter, maxTriesCount);
                triesCounter++;
            }
        }
        if (playerChoice.equals("5")) {
            playerName = Cli.cli(input);
            System.out.println("What number is missing in the progression?");
            triesCounter = 0;
            progress = true;
            while (triesCounter < maxTriesCount && progress) {
                correctAnswer = Progression.progression();
                playerAnswer = input.next();
                progress = templateAnswer(playerName, correctAnswer, playerAnswer, triesCounter, maxTriesCount);
                triesCounter++;
            }
        }
        if (playerChoice.equals("6")) {
            playerName = Cli.cli(input);
            System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
            triesCounter = 0;
            progress = true;
            while (triesCounter < maxTriesCount && progress) {
                correctAnswer = PrimeNumber.primeNumber();
                playerAnswer = input.next();
                progress = templateAnswer(playerName, correctAnswer, playerAnswer, triesCounter, maxTriesCount);
                triesCounter++;
            }
        }
        input.close();
    }
    public static boolean templateAnswer(String playerName,
                                 String correctAnswer,
                                 String playerAnswer,
                                 int counter,
                                 int maxTries) {
        if (playerAnswer.equals(correctAnswer) && counter < maxTries - 1) {
            System.out.println("Correct!");
            return true;
        }
        if (playerAnswer.equals(correctAnswer) && counter == maxTries - 1) {
            System.out.println("Correct!");
            System.out.println("Congratulations, " + playerName + "!");
            return true;
        }
        System.out.println("'" + playerAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
        System.out.println("Let's try again, " + playerName + "!");
        return false;
    }
}
