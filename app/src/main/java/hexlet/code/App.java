package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class App {
    private static final int MAX_TRIES_COEFFICIENT = 3;

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
        switch(playerChoice) {
            case "2":
                Parity.parity(input, playerName, MAX_TRIES_COEFFICIENT);
                break;
            case "3":
                Calc.calc(input, playerName, MAX_TRIES_COEFFICIENT);
                break;
            case "4":
                GCD.gcd(input, playerName, MAX_TRIES_COEFFICIENT);
                break;
            case "5":
                Progression.progression(input, playerName, MAX_TRIES_COEFFICIENT);
                break;
            case "6":
                PrimeNumber.primeNumber(input, playerName, MAX_TRIES_COEFFICIENT);
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
