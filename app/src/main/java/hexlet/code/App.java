package hexlet.code;
import games.Calc;
import games.Cli;
import games.GCD;
import games.Parity;
import games.PrimeNumber;
import games.Progression;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        final int maxTriesCount = 3;
        Scanner input = new Scanner(System.in);
        String playerChoice;
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
        playerChoice = input.next();
        if (playerChoice.equals("1")) {
            Cli.cli(input);
        }
        if (playerChoice.equals("2")) {
            Parity.parity(input, maxTriesCount);
        }
        if (playerChoice.equals("3")) {
            Calc.calc(input, maxTriesCount);
        }
        if (playerChoice.equals("4")) {
            GCD.gcd(input, maxTriesCount);
        }
        if (playerChoice.equals("5")) {
            Progression.progression(input, maxTriesCount);
        }
        if (playerChoice.equals("6")) {
            PrimeNumber.primeNumber(input, maxTriesCount);
        }
        input.close();
    }
}
