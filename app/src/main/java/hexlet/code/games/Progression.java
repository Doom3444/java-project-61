package hexlet.code.games;

import java.util.Scanner;

public class Progression {

    private static final String DESCRIPTION = "What number is missing in the progression?";

    private static final int MAX_COUNT_COEFFICIENT = 10;

    private static final int MAX_STEP_COEFFICIENT = 10;

    private static final int MAX_VALUE_COEFFICIENT = 50;

    private static final int MIN_COUNT_COEFFICIENT = 6;

    public static void gameProgression(Scanner input, String playerName, int tries, String[]  qA) {
        int triesCounter = 0;
        boolean progress = true;
        while (triesCounter < tries && progress) {
            int firstNumber = (int) (Math.random() * MAX_VALUE_COEFFICIENT);
            int stepOfProgression = (int) (Math.random() * MAX_STEP_COEFFICIENT);
            int countNumbers = (int) (MIN_COUNT_COEFFICIENT + Math.random() * MAX_COUNT_COEFFICIENT);
            int missingNumberIndex = (int) (Math.random() * countNumbers);
            qA[0] = question(firstNumber, stepOfProgression, countNumbers, missingNumberIndex);
            qA[1] = Integer.toString(missingNumber(firstNumber, stepOfProgression, missingNumberIndex));
            progress = Engine.engine(input, playerName, DESCRIPTION, qA, triesCounter, tries);
            triesCounter++;
        }
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
                question.append(missingNumber(first, step, missingIndex));
            } else {
                question.append(progression[i]);
            }
        }
        return question.toString();
    }

}
