package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Cli;
import hexlet.code.games.GCD;
import hexlet.code.games.Parity;
import hexlet.code.games.PrimeNumber;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
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
        Scanner input = new Scanner(System.in);
        String playerChoice = input.next();
        if (playerChoice.equals("0")) {
            return;
        }
        gameLaunch(playerChoice);
        input.close();
    }

    private static void gameLaunch(String playerChoice) {
        switch (playerChoice) {
            case "1":
                Cli.cli();
                break;
            case "2":
                Parity.gameParity();
                break;
            case "3":
                Calc.gameCalculator();
                break;
            case "4":
                GCD.gameGCD();
                break;
            case "5":
                Progression.gameProgression();
                break;
            case "6":
                PrimeNumber.gamePrimeNumber();
                break;
            default:
                System.out.println("The game not found");
                break;
        }
    }

}
