package hexlet.code;
import games.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String playerChoice;
        System.out.print("Please enter the game number and press Enter\n1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit\nYour choice: ");
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
