package hexlet.code.games;

public class GCD {
    public static final int MAX_VALUE_COEFFICIENT = 100;
    public static final int MIN_VALUE_COEFFICIENT = 1;
    public static int gcd() {
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
