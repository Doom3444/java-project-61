package hexlet.code;
import games.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String playerChoice;
        System.out.print("Please enter the game number and press Enter\n" +
                "1 - Greet\n" +
                "2 - Even\n" +
                "3 - Calc\n" +
                "4 - GCD\n" +
                "5 - Progression\n" +
                "6 - Prime\n" +
                "0 - Exit\n" +
                "Your choice: ");
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
