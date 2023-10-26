package games;
import java.util.Scanner;

public class GCD {
    public static void gcd(Scanner input) {
        String playerName = "";
        playerName = Cli.cli(input, playerName);
        System.out.println("Find the greatest common divisor of given numbers.");
        int numberFirst, numberSecond, i;
        String playerAnswer, correctAnswer = "";
        for (i = 0; i < 3; i++) {
            numberFirst = (int) (Math.random() * 100);
            numberSecond = (int) (Math.random() * 100);
            correctAnswer = Integer.toString(gcdOfNumbers(numberFirst, numberSecond));
            System.out.println("Question: " + numberFirst + " " + numberSecond);
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
    public static int gcdOfNumbers(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
}
