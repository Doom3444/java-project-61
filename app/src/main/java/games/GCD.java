package games;

import java.util.Scanner;

public class GCD {
    public static void gcd(Scanner input, final int maxTriesCount) {
        final int maxValueCoefficient = 100;
        String playerName = "";
        String playerAnswer;
        String correctAnswer;
        playerName = Cli.cli(input, playerName);
        System.out.println("Find the greatest common divisor of given numbers.");
        int numberFirst;
        int numberSecond;
        int counter = 0;
        boolean progress = true;
        while (counter < maxTriesCount && progress) {
            numberFirst = (int) (Math.random() * maxValueCoefficient);
            numberSecond = (int) (Math.random() * maxValueCoefficient);
            correctAnswer = Integer.toString(gcdOfNumbers(numberFirst, numberSecond));
            System.out.print("Question: " + numberFirst + " " + numberSecond + "\nYour answer: ");
            playerAnswer = input.next();
            progress = TemplateAnswer.answer(playerName, correctAnswer, playerAnswer, counter, maxTriesCount);
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
