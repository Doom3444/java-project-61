package games;

import java.util.Scanner;

public class PrimeNumber {
    public static void primeNumber(Scanner input) {
        final int maxValueCoefficient = 100;
        String playerName = "";
        String playerAnswer;
        String correctAnswer;
        playerName = Cli.cli(input, playerName);
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        int number;
        int counter = 0;
        boolean progress = true;
        while (counter < 3 && progress) {
            number = (int) (Math.random() * maxValueCoefficient);
            correctAnswer = prime(number) ? "yes" : "no";
            System.out.print("Question: " + number + "\nYour answer: ");
            playerAnswer = input.next();
            progress = TemplateAnswer.answer(playerName, correctAnswer, playerAnswer, counter);
            counter++;
        }
    }
    public static boolean prime(int a) {
        if (a <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}
