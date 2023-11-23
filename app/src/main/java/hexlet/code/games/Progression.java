package hexlet.code.games;

public class Progression {
    public static final int MAX_VALUE_COEFFICIENT = 50;
    public static final int MAX_COUNT_COEFFICIENT = 10;
    public static final int MIN_COUNT_COEFFICIENT = 6;
    public static final int MAX_STEP_COEFFICIENT = 10;
    public static int[] progression() {
        int firstNumber = (int) (Math.random() * MAX_VALUE_COEFFICIENT);
        int stepOfProgression = (int) (Math.random() * MAX_STEP_COEFFICIENT);
        int countNumbers = (int) (MIN_COUNT_COEFFICIENT + Math.random() * MAX_COUNT_COEFFICIENT);
        int[] arrayOfNumbers = new int[countNumbers];
        for (int i = 0; i < countNumbers; i++) {
            arrayOfNumbers[i] = firstNumber + i * stepOfProgression;
        }
        return arrayOfNumbers;
    }
    public static int missingNumber(int[] numbers) {
        return numbers[(int) (Math.random() * numbers.length)];
    }
    public static void Question(int[] array, int missingNumber) {
        System.out.print("Question: ");
        for (int j = 0; j < array.length; j++) {
            if (array[j] == missingNumber) {
                System.out.print("..");
            } else {
                System.out.print(array[j]);
            }
            if (j != array.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.print("\nYour answer: ");
    }
}
