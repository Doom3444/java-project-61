package hexlet.code.games;

public class Calc {

    private static final int ACTION_VALUE_COEFFICIENT = 3;

    private static final String DESCRIPTION = "What is the result of the expression?";

    private static final int MAX_VALUE_COEFFICIENT = 50;

    public static void gameCalculator() {
        String[][] qA = new String[Engine.MAX_TRIES_COEFFICIENT][Engine.QUESTION_AND_ANSWERS_COUNT];
        for (String[] iterator: qA) {
            int numberFirst = RandomGenerator.getRandom(MAX_VALUE_COEFFICIENT);
            int numberSecond = RandomGenerator.getRandom(MAX_VALUE_COEFFICIENT);
            int actionInt = RandomGenerator.getRandom(ACTION_VALUE_COEFFICIENT);
            String actionStr = actionIntToStr(actionInt);
            if (actionStr.equals("IA")) {
                return;
            }
            iterator[0] = numberFirst + " " + actionStr + " " + numberSecond;
            iterator[1] = Integer.toString(calculation(numberFirst, numberSecond, actionStr));
        }
        Engine.engine(DESCRIPTION, qA);
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
