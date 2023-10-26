package hexlet.code;
import games.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String playerChoice;
        System.out.println("Please enter the game number and press Enter");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
            playerChoice = input.next();
            if (playerChoice.equals("1")) {
                Cli.cli(input);
            }
            if (playerChoice.equals("2")) {
                Parity.parity(input);
            }
            if (playerChoice.equals("3")) {
                Calc.calc(input);
            }
            if (playerChoice.equals("4")) {
                GCD.gcd(input);
            }
            if (playerChoice.equals("5")) {
                Progression.progression(input);
            }
            if (playerChoice.equals("6")) {
                PrimeNumber.primeNumber(input);
            }
        input.close();
    }
}
