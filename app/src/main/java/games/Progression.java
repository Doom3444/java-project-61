package games;

import java.util.Scanner;

public class Progression {
    public static void progression(Scanner input, int maxTriesCount) {
        final int maxValueCoefficient = 50, maxCountCoefficient = 10, minCountCoefficient = 6, maxStepCoefficient = 10;
        String playerName = "";
        String playerAnswer;
        String correctAnswer;
        playerName = Cli.cli(input, playerName);
        System.out.println("What number is missing in the progression?");
        int firstNumber;
        int counter = 0;
        int countNumbers;
        int missingNumber;
        int stepOfProgression;
        boolean progress = true;
        while (counter < maxTriesCount && progress) {
            firstNumber = (int) (Math.random() * maxValueCoefficient);
            stepOfProgression = (int) (Math.random() * maxStepCoefficient);
            countNumbers = (int) (minCountCoefficient + Math.random() * maxCountCoefficient);
            missingNumber = (int) (Math.random() * countNumbers);
            correctAnswer = Integer.toString(firstNumber + missingNumber * stepOfProgression);
            System.out.print("Question: ");
            conclusionQuestion(countNumbers, missingNumber, firstNumber, stepOfProgression);
            System.out.print("\nYour answer: ");
            playerAnswer = input.next();
            progress = TemplateAnswer.answer(playerName, correctAnswer, playerAnswer, counter, maxTriesCount);
            counter++;
        }
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
