package hexlet.code.games;

public class GCD {

    private static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";

    private static final int MAX_VALUE_COEFFICIENT = 100;

    private static final int MIN_VALUE_COEFFICIENT = 1;

    public static void gameGCD() {
        String[][] qA = new String[Engine.MAX_TRIES_COEFFICIENT][Engine.QUESTION_AND_ANSWERS_COUNT];
        for (String[] iterator: qA) {
            int numberFirst = RandomGenerator.getRandom(MIN_VALUE_COEFFICIENT, MAX_VALUE_COEFFICIENT);
            int numberSecond = RandomGenerator.getRandom(MIN_VALUE_COEFFICIENT, MAX_VALUE_COEFFICIENT);
            iterator[0] = numberFirst + " " + numberSecond;
            iterator[1] = Integer.toString(greatestCommonDivisor(numberFirst, numberSecond));
        }
        Engine.engine(DESCRIPTION, qA);
    }

    private static int greatestCommonDivisor(int n1, int n2) {
        while (n1 != n2) {
            if (n1 > n2) {
                n1 = n1 - n2;
            } else {
                n2 = n2 - n1;
            }
        }
        return n1;
    }

}
