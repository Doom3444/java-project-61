package games;

public class Calc {
    public static final int maxValueCoefficient = 100;
    public static final int actionValueCoefficient = 3;
    public static String calc() {
        String answer;
        String actionString;
        int numberFirst;
        int numberSecond;
        int actionInt;
        numberFirst = (int) (Math.random() * maxValueCoefficient);
        numberSecond = (int) (Math.random() * maxValueCoefficient);
        actionInt = (int) (Math.random() * actionValueCoefficient);
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
