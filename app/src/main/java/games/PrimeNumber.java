package games;
import java.util.Scanner;

public class PrimeNumber {
    public static void primeNumber(Scanner input) {
        String playerName = "";
        playerName = Cli.cli(input, playerName);
        System.out.println("Answer 'yes' if the number is prime, otherwise answer 'no'.");
        int number, i;
        String playerAnswer, correctAnswer;
        for (i = 0; i < 3; i++) {
            number = (int) (Math.random() * 100);
            correctAnswer = prime(number) ? "yes" : "no";
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            playerAnswer = input.next();
            if (playerAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
            }
            else {
                System.out.println("'" + playerAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + playerName + "!");
                break;
            }
        }
        if (i == 3) {
            System.out.println("Congratulations, " + playerName + "!");
        }
    }
    public static boolean prime(int a) {
        if (a <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}
