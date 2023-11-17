package games;

import java.util.Scanner;

public class Progression {
    public static void progression(Scanner input) {
        final int maxValueCoefficient = 50;
        final int maxCountCoefficient = 10;
        final int maxStepCoefficient = 10;
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
        while (counter < 3 && progress) {
            firstNumber = (int) (Math.random() * maxValueCoefficient);
            stepOfProgression = (int) (Math.random() * maxStepCoefficient);
            countNumbers = (int) (6 + Math.random() * maxCountCoefficient);
            missingNumber = (int) (Math.random() * countNumbers);
            correctAnswer = Integer.toString(firstNumber + missingNumber * stepOfProgression);
            System.out.print("Question: ");
            for (int j = 0; j < countNumbers; j++) {
                if (j == countNumbers - 1 && j == missingNumber) {
                    System.out.println("..");
                }
                if (j == countNumbers - 1 && j != missingNumber) {
                    System.out.println((firstNumber + j * stepOfProgression));
                }
                if (j != countNumbers - 1 && j == missingNumber) {
                    System.out.print(".. ");
                }
                if (j != countNumbers - 1 && j != missingNumber) {
                    System.out.print((firstNumber + j * stepOfProgression) + " ");
                }
            }
            System.out.print("Your answer: ");
            playerAnswer = input.next();
            progress = TemplateAnswer.answer(playerName, correctAnswer, playerAnswer, counter);
            counter++;
        }
    }
}
