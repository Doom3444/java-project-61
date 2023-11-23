package hexlet.code.games;

public class GCD {
    private static final int MAX_VALUE_COEFFICIENT = 100;
    private static final int MIN_VALUE_COEFFICIENT = 1;
    private static final int FIRST_ATTEMPT = 0;
    public static int gcd(int tries) {
        if (tries == FIRST_ATTEMPT) {
            System.out.println("Find the greatest common divisor of given numbers.");
        }
        int numberFirst = (int) (MIN_VALUE_COEFFICIENT + Math.random() * MAX_VALUE_COEFFICIENT);
        int numberSecond = (int) (MIN_VALUE_COEFFICIENT + Math.random() * MAX_VALUE_COEFFICIENT);
        System.out.print("Question: " + numberFirst + " " + numberSecond + "\nYour answer: ");
        while (numberFirst != numberSecond) {
            if (numberFirst > numberSecond) {
                numberFirst = numberFirst - numberSecond;
            } else {
                numberSecond = numberSecond - numberFirst;
            }
        }
        return numberFirst;
    }
}
