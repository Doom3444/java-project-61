package games;
import hexlet.code.TemplateAnswer;

import java.util.Scanner;

public class Calc {
    public static void calc(Scanner input) {
        String playerName = "", playerAnswer, correctAnswer = "", actionString = "";
        playerName = Cli.cli(input, playerName);
        System.out.println("What is the result of the expression?");
        int numberFirst, numberSecond, counter = 0, actionInt;
        boolean progress = true;
        while (counter < 3 && progress) {
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
            System.out.print("Question: " + numberFirst + " " + actionString + " " + numberSecond + "\nYour answer: ");
            playerAnswer = input.next();
            progress = TemplateAnswer.answer(playerName, correctAnswer, playerAnswer, counter);
            counter++;
        }
    }
}
