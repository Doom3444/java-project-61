package hexlet.code.games;

public class Parity {
    private static final int MAX_VALUE_COEFFICIENT = 100;
    private static final int FIRST_ATTEMPT = 0;
    public static String parity(int tries) {
        if (tries == FIRST_ATTEMPT) {
            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        }
        int number = (int) (Math.random() * MAX_VALUE_COEFFICIENT);
        System.out.print("Question: " + number + "\nYour answer: ");
        return number % 2 == 0 ? "yes" : "no";
    }
}
