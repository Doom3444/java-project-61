package hexlet.code.games;

import java.util.Scanner;

public class Calc {

    private static final int MAX_VALUE_COEFFICIENT = 50;

    private static final int ACTION_VALUE_COEFFICIENT = 3;

    private static final String DESCRIPTION = "What is the result of the expression?";

    public static void calc(Scanner input, String playerName, int tries, String[] qA) {
        int triesCounter = 0;
        boolean progress = true;
        while (triesCounter < tries && progress) {
            int numberFirst = (int) (Math.random() * MAX_VALUE_COEFFICIENT);
            int numberSecond = (int) (Math.random() * MAX_VALUE_COEFFICIENT);
            int actionInt = (int) (Math.random() * ACTION_VALUE_COEFFICIENT);
            String actionStr = actionIntToStr(actionInt);
            if (actionStr.equals("IA")) {
                return;
            }
            qA[0] = numberFirst + " " + actionStr + " " + numberSecond;
            qA[1] = Integer.toString(calculation(numberFirst, numberSecond, actionStr));
            progress = Engine.engine(input, playerName, DESCRIPTION, qA, triesCounter, tries);
            triesCounter++;
        }
    }

    private static String actionIntToStr(int action) {
        String[] act = {"+", "*", "-"};
        if (action < act.length) {
            return act[action];
        }
        return "IA";
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
                return Integer.parseInt(null);
        }
    }

}
