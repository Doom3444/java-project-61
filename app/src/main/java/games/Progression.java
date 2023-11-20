package games;

public class Progression {
    public static final int maxValueCoefficient = 50;
    public static final int maxCountCoefficient = 10;
    public static final int minCountCoefficient = 6;
    public static final int maxStepCoefficient = 10;
    public static String progression() {
        String answer;
        int firstNumber;
        int countNumbers;
        int missingNumber;
        int stepOfProgression;
        firstNumber = (int) (Math.random() * maxValueCoefficient);
        stepOfProgression = (int) (Math.random() * maxStepCoefficient);
        countNumbers = (int) (minCountCoefficient + Math.random() * maxCountCoefficient);
        missingNumber = (int) (Math.random() * countNumbers);
        answer = Integer.toString(firstNumber + missingNumber * stepOfProgression);
        System.out.print("Question: ");
        conclusionQuestion(countNumbers, missingNumber, firstNumber, stepOfProgression);
        System.out.print("\nYour answer: ");
        return answer;
    }
    public static void conclusionQuestion(int countNumbers, int missingNumber, int firstNumber, int step) {
        for (int j = 0; j < countNumbers; j++) {
            if (j == missingNumber) {
                System.out.print("..");
            } else {
                System.out.print((firstNumber + j * step));
            }
            if (j != countNumbers - 1) {
                System.out.print(" ");
            }
        }
    }
}
