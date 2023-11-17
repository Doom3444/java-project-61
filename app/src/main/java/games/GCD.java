package games;

import java.util.Scanner;

public class GCD {
    public static void gcd(Scanner input) {
        String playerName = "", playerAnswer, correctAnswer;
        playerName = Cli.cli(input, playerName);
        System.out.println("Find the greatest common divisor of given numbers.");
        int numberFirst, numberSecond, counter = 0;
        boolean progress = true;
        while (counter < 3 && progress) {
            numberFirst = (int) (Math.random() * 30);
            numberSecond = (int) (Math.random() * 30);
            correctAnswer = Integer.toString(gcdOfNumbers(numberFirst, numberSecond));
            System.out.print("Question: " + numberFirst + " " + numberSecond + "\nYour answer: ");
            playerAnswer = input.next();
            progress = TemplateAnswer.answer(playerName, correctAnswer, playerAnswer, counter);
            counter++;
        }
    }
    public static int gcdOfNumbers(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
}
