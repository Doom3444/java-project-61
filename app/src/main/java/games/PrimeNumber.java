package games;
import hexlet.code.TemplateAnswer;

import java.util.Scanner;

public class PrimeNumber {
    public static void primeNumber(Scanner input) {
        String playerName = "", playerAnswer, correctAnswer;
        playerName = Cli.cli(input, playerName);
        System.out.println("Answer 'yes' if the number is prime, otherwise answer 'no'.");
        int number, counter = 0;
        boolean progress = true;
        while (counter < 3 && progress) {
            number = (int) (Math.random() * 100);
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
