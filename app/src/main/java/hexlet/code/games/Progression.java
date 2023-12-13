package hexlet.code.games;

public class Progression {

    private static final String DESCRIPTION = "What number is missing in the progression?";

    private static final int MAX_COUNT_COEFFICIENT = 10;

    private static final int MAX_STEP_COEFFICIENT = 10;

    private static final int MAX_VALUE_COEFFICIENT = 50;

    private static final int MIN_COUNT_COEFFICIENT = 6;

    public static void gameProgression() {
        String[][] qA = new String[Engine.MAX_TRIES_COEFFICIENT][Engine.QUESTION_AND_ANSWERS_COUNT];
        for (String[] iterator: qA) {
            int firstNumber = RandomGenerator.getRandom(MAX_VALUE_COEFFICIENT);
            int stepOfProgression = RandomGenerator.getRandom(MAX_STEP_COEFFICIENT);
            int countNumbers = RandomGenerator.getRandom(MIN_COUNT_COEFFICIENT, MAX_COUNT_COEFFICIENT);
            int missingNumberIndex = RandomGenerator.getRandom(countNumbers);
            iterator[0] = question(firstNumber, stepOfProgression, countNumbers, missingNumberIndex);
            iterator[1] = Integer.toString(missingNumber(firstNumber, stepOfProgression, missingNumberIndex));
        }
        Engine.engine(DESCRIPTION, qA);
    }

    private static int missingNumber(int first, int step, int missingIndex) {
        return first + step * missingIndex;
    }

    private static int[] progressionGenerator(int first, int step, int count) {
        int[] progression = new int[count];
        for (int i = 0; i < count; i++) {
            progression[i] = first + step * i;
        }
        return progression;
    }

    private static String question(int first, int step, int count, int missingIndex) {
        int[] progression = progressionGenerator(first, step, count);
        StringBuilder question = new StringBuilder();
        for (int i = 0; i < count; i++) {
            if (i == missingIndex) {
                question.append("..");
            } else {
                question.append(progression[i]);
            }
            if (i != count - 1) {
                question.append(" ");
            }
        }
        return question.toString();
    }

}
