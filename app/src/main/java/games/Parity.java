package games;
import java.util.Scanner;

public class Parity {
    public static void parity(Scanner input) {
        String playerName = "";
        playerName = Cli.cli(input, playerName);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int number, i;
        String playerAnswer, correctAnswer;
        for (i = 0; i < 3; i++) {
            number = (int) (Math.random() * 100);
            correctAnswer = number % 2 == 0 ? "yes" : "no";
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
}
