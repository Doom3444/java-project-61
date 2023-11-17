package games;

import java.util.Scanner;

public class Parity {
    public static void parity(Scanner input) {
        String playerName = "", playerAnswer, correctAnswer;
        playerName = Cli.cli(input, playerName);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int number, counter = 0;
        boolean progress = true;
        while (counter < 3 && progress) {
            number = (int) (Math.random() * 100);
            correctAnswer = number % 2 == 0 ? "yes" : "no";
            System.out.print("Question: " + number + "\nYour answer: ");
            playerAnswer = input.next();
            progress = TemplateAnswer.answer(playerName, correctAnswer, playerAnswer, counter);
            counter++;
        }
    }
}
