package games;

import java.util.Scanner;

public class Calc {
    public static void calc(Scanner input) {
        final int maxValueCoefficient = 100;
        final int actionValueCoefficient = 100;
        String playerName = "";
        String playerAnswer;
        String correctAnswer = "";
        String actionString = "";
        playerName = Cli.cli(input, playerName);
        System.out.println("What is the result of the expression?");
        int numberFirst;
        int numberSecond;
        int counter = 0;
        int actionInt;
        boolean progress = true;
        while (counter < 3 && progress) {
            numberFirst = (int) (Math.random() * maxValueCoefficient);
            numberSecond = (int) (Math.random() * maxValueCoefficient);
            actionInt = (int) (Math.random() * actionValueCoefficient);
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
