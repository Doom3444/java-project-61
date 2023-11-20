package games;

public class Progression {
    public static final int MAXVALUECOEFFICIENT = 50;
    public static final int MAXCOUNTCOEFFICIENT = 10;
    public static final int MINCOUNTCOEFFICIENT = 6;
    public static final int MAXSTEPCOEFFICCIENT = 10;
    public static String progression() {
        String answer;
        int firstNumber;
        int countNumbers;
        int missingNumber;
        int stepOfProgression;
        firstNumber = (int) (Math.random() * MAXVALUECOEFFICIENT);
        stepOfProgression = (int) (Math.random() * MAXSTEPCOEFFICCIENT);
        countNumbers = (int) (MINCOUNTCOEFFICIENT + Math.random() * MAXCOUNTCOEFFICIENT);
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
