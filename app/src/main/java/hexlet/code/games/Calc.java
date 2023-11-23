package hexlet.code.games;

public class Calc {
    public static final int MAX_VALUE_COEFFICIENT = 50;
    public static final int ACTION_VALUE_COEFFICIENT = 3;
    public static int calc() {
        int numberFirst = (int) (Math.random() * MAX_VALUE_COEFFICIENT);
        int numberSecond = (int) (Math.random() * MAX_VALUE_COEFFICIENT);
        int actionInt = (int) (Math.random() * ACTION_VALUE_COEFFICIENT);
        String actionString = action(actionInt);
        System.out.print("Question: " + numberFirst + " " + actionString + " " + numberSecond + "\nYour answer: ");
        return correctAnswer(actionString, numberFirst, numberSecond);
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
    public static int correctAnswer(String action, int numberFirst, int numberSecond) {
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
