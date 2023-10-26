package games;
import java.util.Scanner;

public class Calc {
    public static void calc(Scanner input) {
        String playerName = "";
        playerName = Cli.cli(input, playerName);
        System.out.println("What is the result of the expression?");
        int numberFirst, numberSecond, i, actionInt;
        String playerAnswer, correctAnswer = "", actionString = "";
        for (i = 0; i < 3; i++) {
            numberFirst = (int) (Math.random() * 20);
            numberSecond = (int) (Math.random() * 20);
            actionInt = (int) (Math.random() * 3);
            if (actionInt == 0) {
                correctAnswer = Integer.toString(numberFirst + numberSecond);
                actionString = "+";
            }
            if (actionInt == 1) {
                correctAnswer = Integer.toString(numberFirst * numberSecond);
                actionString = "*";
            }
            if (actionInt == 2) {
                correctAnswer = Integer.toString(numberFirst - numberSecond);
                actionString = "-";
            }
            System.out.println("Question: " + numberFirst + " " + actionString + " " + numberSecond);
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
