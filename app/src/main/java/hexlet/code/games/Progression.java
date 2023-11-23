package hexlet.code.games;

public class Progression {
    private static final int MAX_VALUE_COEFFICIENT = 50;
    private static final int MAX_COUNT_COEFFICIENT = 10;
    private static final int MIN_COUNT_COEFFICIENT = 6;
    private static final int MAX_STEP_COEFFICIENT = 10;
    private static final int FIRST_ATTEMPT = 0;
    public static int progression(int tries) {
        if (tries == FIRST_ATTEMPT) {
            System.out.println("What number is missing in the progression?");
        }
        int firstNumber = (int) (Math.random() * MAX_VALUE_COEFFICIENT);
        int stepOfProgression = (int) (Math.random() * MAX_STEP_COEFFICIENT);
        int countNumbers = (int) (MIN_COUNT_COEFFICIENT + Math.random() * MAX_COUNT_COEFFICIENT);
        int missingNumber = (int) (Math.random() * countNumbers);
        question(firstNumber, stepOfProgression, countNumbers, missingNumber);
        return firstNumber + missingNumber * stepOfProgression;
    }
    private static void question(int first, int step, int count, int missingNumber) {
        System.out.print("Question: ");
        for (int j = 0; j < count; j++) {
            if (j == missingNumber) {
                System.out.print("..");
            }
            if (j != missingNumber) {
                System.out.print(first + j * step);
            }
            if (j != count - 1) {
                System.out.print(" ");
            }
        }
        System.out.print("\nYour answer: ");
    }
}
