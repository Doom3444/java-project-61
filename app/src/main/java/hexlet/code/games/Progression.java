package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utils.RandomGenerator;

public class Progression {

    private static final String DESCRIPTION = "What number is missing in the progression?";

    private static final int MAX_COUNT_VALUE = 10;

    private static final int MAX_STEP_VALUE = 10;

    private static final int MAX_VALUE = 50;

    private static final int MIN_COUNT_VALUE = 6;

    public static void gameProgression() {
        String[][] qA = new String[Engine.MAX_TRIES][Engine.QUESTION_AND_ANSWERS_COUNT];
        for (String[] iterator: qA) {
            int firstNumber = RandomGenerator.getRandom(MAX_VALUE);
            int stepOfProgression = RandomGenerator.getRandom(MAX_STEP_VALUE);
            int countNumbers = RandomGenerator.getRandom(MIN_COUNT_VALUE, MAX_COUNT_VALUE);
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
        String[] progressionToString = new String[count];
        for (int i = 0; i < count; i++) {
            progressionToString[i] = Integer.toString(progression[i]);
        }
        progressionToString[missingIndex] = "..";
        return String.join(" ", progressionToString);
    }

}
