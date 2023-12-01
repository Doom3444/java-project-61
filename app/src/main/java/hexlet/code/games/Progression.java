package hexlet.code.games;

import java.util.Scanner;

public class Progression {

    private static final int MAX_VALUE_COEFFICIENT = 50;

    private static final int MAX_COUNT_COEFFICIENT = 10;

    private static final int MIN_COUNT_COEFFICIENT = 6;

    private static final int MAX_STEP_COEFFICIENT = 10;

    private static final String DESCRIPTION = "What number is missing in the progression?";

    public static void progression(Scanner input, String playerName, int tries, String[]  qA) {
        int triesCounter = 0;
        boolean progress = true;
        while (triesCounter < tries && progress) {
            int firstNumber = (int) (Math.random() * MAX_VALUE_COEFFICIENT);
            int stepOfProgression = (int) (Math.random() * MAX_STEP_COEFFICIENT);
            int countNumbers = (int) (MIN_COUNT_COEFFICIENT + Math.random() * MAX_COUNT_COEFFICIENT);
            int missingNumberIndex = (int) (Math.random() * countNumbers);
            int correctAnswer = missingNumber(firstNumber, stepOfProgression, missingNumberIndex);
            qA[0] = progressionGenerator(firstNumber, stepOfProgression, countNumbers)
                    .replace(Integer.toString(correctAnswer), "..");
            qA[1] = Integer.toString(correctAnswer);
            progress = Engine.engine(input, playerName, DESCRIPTION, qA, triesCounter, tries);
            triesCounter++;
        }
    }

    private static String progressionGenerator(int first, int step, int count) {
        StringBuilder question = new StringBuilder();
        for (int j = 0; j < count; j++) {
            question.append(first + j * step);
            if (j != count - 1) {
                question.append(" ");
            }
        }
        return String.valueOf(question);
    }

    private static int missingNumber(int first, int step, int missingIndex) {
        return first + step * missingIndex;
    }

}
