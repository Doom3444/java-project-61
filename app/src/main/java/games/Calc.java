package games;

import java.util.Scanner;

public class Calc {
    public static void calc(Scanner input, int maxTriesCount) {
        final int maxValueCoefficient = 100;
        final int actionValueCoefficient = 3;
        String playerName = "";
        String playerAnswer;
        String correctAnswer;
        String actionString;
        playerName = Cli.cli(input, playerName);
        System.out.println("What is the result of the expression?");
        int numberFirst;
        int numberSecond;
        int counter = 0;
        int actionInt;
        boolean progress = true;
        while (counter < maxTriesCount && progress) {
            numberFirst = (int) (Math.random() * maxValueCoefficient);
            numberSecond = (int) (Math.random() * maxValueCoefficient);
            actionInt = (int) (Math.random() * actionValueCoefficient);
            actionString = action(actionInt);
            correctAnswer = correctAnswer(actionString, numberFirst, numberSecond);
            System.out.print("Question: " + numberFirst + " " + actionString + " " + numberSecond + "\nYour answer: ");
            playerAnswer = input.next();
            progress = TemplateAnswer.answer(playerName, correctAnswer, playerAnswer, counter, maxTriesCount);
            counter++;
        }
    }
    public static String action(int action) {
        if (action == 0) {
            return "+";
        }
        if (action == 1) {
            return "*";
        }
        if (action == 2) {
            return "-";
        }
        return null;
    }
    public static String correctAnswer(String action, int numberFirst, int numberSecond) {
        if (action.equals("+")) {
            return Integer.toString(numberFirst + numberSecond);
        }
        if (action.equals("*")) {
            return Integer.toString(numberFirst * numberSecond);
        }
        if (action.equals("-")) {
            return Integer.toString(numberFirst - numberSecond);
        }
        return null;
    }
}
