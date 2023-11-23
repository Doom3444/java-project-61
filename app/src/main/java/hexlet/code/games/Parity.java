package hexlet.code.games;

public class Parity {
    public static final int MAX_VALUE_COEFFICIENT = 100;
    public static String parity() {
        int number = (int) (Math.random() * MAX_VALUE_COEFFICIENT);
        System.out.print("Question: " + number + "\nYour answer: ");
        return number % 2 == 0 ? "yes" : "no";
    }
}
