package games;

public class Calc {
    public static final int MAXVALUECOEFFICIENT = 50;
    public static final int ACTIONVALUECOEFFICIENT = 3;
    public static String calc() {
        String answer;
        String actionString;
        int numberFirst;
        int numberSecond;
        int actionInt;
        numberFirst = (int) (Math.random() * MAXVALUECOEFFICIENT);
        numberSecond = (int) (Math.random() * MAXVALUECOEFFICIENT);
        actionInt = (int) (Math.random() * ACTIONVALUECOEFFICIENT);
        actionString = action(actionInt);
        answer = correctAnswer(actionString, numberFirst, numberSecond);
        System.out.print("Question: " + numberFirst + " " + actionString + " " + numberSecond + "\nYour answer: ");
        return answer;
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
