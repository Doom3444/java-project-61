package hexlet.code.games;

public class Calc {
    private static final int MAX_VALUE_COEFFICIENT = 50;
    private static final int ACTION_VALUE_COEFFICIENT = 3;
    private static final int FIRST_ATTEMPT = 0;
    public static int calc(int tries) {
        if (tries == FIRST_ATTEMPT) {
            System.out.println("What is the result of the expression?");
        }
        int numberFirst = (int) (Math.random() * MAX_VALUE_COEFFICIENT);
        int numberSecond = (int) (Math.random() * MAX_VALUE_COEFFICIENT);
        int actionInt = (int) (Math.random() * ACTION_VALUE_COEFFICIENT);
        String actionString = action(actionInt);
        System.out.print("Question: " + numberFirst + " " + actionString + " " + numberSecond + "\nYour answer: ");
        return correctAnswer(actionString, numberFirst, numberSecond);
    }
    private static String action(int action) {
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
    private static int correctAnswer(String action, int numberFirst, int numberSecond) {
        if (action.equals("+")) {
            return numberFirst + numberSecond;
        }
        if (action.equals("*")) {
            return numberFirst * numberSecond;
        }
        if (action.equals("-")) {
            return numberFirst - numberSecond;
        }
        return 0;
    }
}
