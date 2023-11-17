package games;
import hexlet.code.TemplateAnswer;

import java.util.Scanner;

public class Progression {
    public static void progression(Scanner input) {
        String playerName = "", playerAnswer, correctAnswer;
        playerName = Cli.cli(input, playerName);
        System.out.println("What number is missing in the progression?");
        int firstNumber, counter = 0, countNumbers, missingNumber, stepOfProgression;
        boolean progress = true;
        while (counter < 3 && progress) {
            firstNumber = (int) (Math.random() * 50);
            stepOfProgression = (int) (Math.random() * 20);
            countNumbers = (int) (6 + Math.random() * 10);
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
