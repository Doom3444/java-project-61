package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utils.RandomGenerator;

public class Calc {

    private static final String[] ACTION = {"+", "*", "-"};

    private static final String DESCRIPTION = "What is the result of the expression?";

    private static final int MAX_VALUE = 50;

    public static void gameCalculator() {
        String[][] qA = new String[Engine.MAX_TRIES][Engine.QUESTION_AND_ANSWERS_COUNT];
        for (String[] iterator: qA) {
            int numberFirst = RandomGenerator.getRandom(MAX_VALUE);
            int numberSecond = RandomGenerator.getRandom(MAX_VALUE);
            int indexOperator = RandomGenerator.getRandom(ACTION.length);
            String action = ACTION[indexOperator];
            Integer answer = calculation(numberFirst, numberSecond, action);
            if (answer == null) {
                return;
            }
            iterator[0] = numberFirst + " " + action + " " + numberSecond;
            iterator[1] = Integer.toString(answer);
        }
        Engine.engine(DESCRIPTION, qA);
    }

    private static Integer calculation(int n1, int n2, String action) {
        switch (action) {
            case "+":
                return n1 + n2;
            case "*":
                return n1 * n2;
            case "-":
                return n1 - n2;
            default:
                return null;
        }
    }

}
