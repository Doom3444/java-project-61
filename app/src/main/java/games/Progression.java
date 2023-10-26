package games;
import java.util.Scanner;

public class Progression {
    public static void progression(Scanner input) {
        String playerName = "";
        playerName = Cli.cli(input, playerName);
        System.out.println("What number is missing in the progression?");
        int firstNumber, i, countNumbers, missingNumber, stepOfProgression;
        String playerAnswer, correctAnswer;
        for (i = 0; i < 3; i++) {
            firstNumber = (int) (Math.random() * 50);
            stepOfProgression = (int) (Math.random() * 20);
            countNumbers = (int) (6 + Math.random() * 10);
            missingNumber = (int) (Math.random() * countNumbers);
            correctAnswer = Integer.toString(firstNumber + missingNumber * stepOfProgression);
            System.out.print("Question: ");
            for (int j = 0; j < countNumbers; j++) {
                if (j == countNumbers - 1) {
                    if (j == missingNumber) {
                        System.out.println("..");
                    } else {
                        System.out.println((firstNumber + j * stepOfProgression));
                    }
                } else {
                    if (j == missingNumber) {
                        System.out.print(".. ");
                    } else {
                        System.out.print((firstNumber + j * stepOfProgression) + " ");
                    }
                }
            }
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
