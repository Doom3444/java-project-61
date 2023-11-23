package hexlet.code.games;

public class GCD {
    public static final int MAX_VALUE_COEFFICIENT = 100;
    public static int gcd() {
        int numberFirst = (int) (Math.random() * MAX_VALUE_COEFFICIENT);
        int numberSecond = (int) (Math.random() * MAX_VALUE_COEFFICIENT);
        System.out.print("Question: " + numberFirst + " " + numberSecond + "\nYour answer: ");
        if (numberFirst == 0) {
            return numberSecond;
        }
        if (numberSecond == 0) {
            return numberFirst;
        }
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
