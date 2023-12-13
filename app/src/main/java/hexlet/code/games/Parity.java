package hexlet.code.games;

public class Parity {

    private static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    private static final int MAX_VALUE_COEFFICIENT = 100;

    public static void gameParity() {
        String[][] qA = new String[Engine.MAX_TRIES_COEFFICIENT][Engine.QUESTION_AND_ANSWERS_COUNT];
        for (String[] iterator: qA) {
            int number = RandomGenerator.getRandom(MAX_VALUE_COEFFICIENT);
            iterator[0] = String.valueOf(number);
            iterator[1] = isEven(number) ? "yes" : "no";
        }
        Engine.engine(DESCRIPTION, qA);
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

}
