package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Cli;
import hexlet.code.games.GCD;
import hexlet.code.games.Parity;
import hexlet.code.games.PrimeNumber;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {

    private static final int MAX_TRIES_COEFFICIENT = 3;

    private static final String[] QUESTION_AND_ANSWER = new String[2];

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("""
                Please enter the game number and press Enter
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                Your choice:\s""");
        String playerChoice = input.next();
        if (playerChoice.equals("0")) {
            return;
        }
        if (ifChoiceIsIncorrect(playerChoice)) {
            System.out.println("Invalid choice");
            input.close();
            return;
        }
        String playerName = Cli.cli(input);
        if (playerChoice.equals("1")) {
            input.close();
            return;
        }
        gameLaunch(input, playerChoice, playerName);
        input.close();
    }

    private static void gameLaunch(Scanner input, String playerChoice, String playerName) {
        switch (playerChoice) {
            case "2":
                Parity.gameParity(input, playerName, MAX_TRIES_COEFFICIENT, QUESTION_AND_ANSWER);
                break;
            case "3":
                Calc.gameCalculator(input, playerName, MAX_TRIES_COEFFICIENT, QUESTION_AND_ANSWER);
                break;
            case "4":
                GCD.gameGCD(input, playerName, MAX_TRIES_COEFFICIENT, QUESTION_AND_ANSWER);
                break;
            case "5":
                Progression.gameProgression(input, playerName, MAX_TRIES_COEFFICIENT, QUESTION_AND_ANSWER);
                break;
            case "6":
                PrimeNumber.gamePrimeNumber(input, playerName, MAX_TRIES_COEFFICIENT, QUESTION_AND_ANSWER);
                break;
            default:
                System.out.println("The game not found");
                break;
        }
    }

    private static boolean ifChoiceIsIncorrect(String playerChoice) {
        String[] correctChoice = {"1", "2", "3", "4", "5", "6"};
        for (String choice : correctChoice) {
            if (playerChoice.equals(choice)) {
                return false;
            }
        }
        return true;
    }

}
