package hexlet.code.games;

public class PrimeNumber {

    private static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    private static final int MAX_VALUE_COEFFICIENT = 100;

    public static void gamePrimeNumber() {
        String[][] qA = new String[Engine.MAX_TRIES_COEFFICIENT][Engine.QUESTION_AND_ANSWERS_COUNT];
        for (String[] iterator: qA) {
            int number = RandomGenerator.getRandom(MAX_VALUE_COEFFICIENT);
            iterator[0] = String.valueOf(number);
            iterator[1] = isPrime(number) ? "yes" : "no";
        }
        Engine.engine(DESCRIPTION, qA);
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
