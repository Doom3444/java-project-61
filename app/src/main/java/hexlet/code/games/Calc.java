package hexlet.code.games;

import java.util.Scanner;

public class Calc {

    private static final int MAX_VALUE_COEFFICIENT = 50;

    private static final int ACTION_VALUE_COEFFICIENT = 3;

    public static void calc(Scanner input, String playerName, int tries) {
        System.out.println("What is the result of the expression?");
        int triesCounter = 0;
        boolean progress = true;
        while (triesCounter < tries && progress) {
            int numberFirst = (int) (Math.random() * MAX_VALUE_COEFFICIENT);
            int numberSecond = (int) (Math.random() * MAX_VALUE_COEFFICIENT);
            int actionInt = (int) (Math.random() * ACTION_VALUE_COEFFICIENT);
            String actionStr = actionIntToStr(actionInt);
            String question = question(numberFirst, numberSecond, actionStr);
            int correctAnswer = calculation(numberFirst, numberSecond, actionStr);
            progress = Engine.engine(input, playerName, question, Integer.toString(correctAnswer), triesCounter, tries);
            triesCounter++;
        }
    }

    private static String actionIntToStr(int action) {
        switch (action) {
            case 0:
                return "+";
            case 1:
                return "*";
            case 2:
                return "-";
            default:
                return "Invalid action";
        }
    }

    private static String question(int n1, int n2, String action) {
        return n1 + " " + action + " " + n2;
    }

    private static int calculation(int n1, int n2, String action) {
        switch (action) {
            case "+":
                return n1 + n2;
            case "*":
                return n1 * n2;
            case "-":
                return n1 - n2;
            default:
                System.out.println("Invalid action");
                System.exit(0);
                return 0;
        }
    }

}
