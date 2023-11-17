package games;

import java.util.Scanner;

public class Parity {
    public static void parity(Scanner input) {
        final int maxValueCoefficient = 100;
        final int maxTriesCount = 3;
        String playerName = "";
        String playerAnswer;
        String correctAnswer;
        playerName = Cli.cli(input, playerName);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int number;
        int counter = 0;
        boolean progress = true;
        while (counter < maxTriesCount && progress) {
            number = (int) (Math.random() * maxValueCoefficient);
            correctAnswer = number % 2 == 0 ? "yes" : "no";
            System.out.print("Question: " + number + "\nYour answer: ");
            playerAnswer = input.next();
            progress = TemplateAnswer.answer(playerName, correctAnswer, playerAnswer, counter, maxTriesCount);
            counter++;
        }
    }
}
