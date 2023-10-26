package games;
import java.util.Scanner;
public class Cli {
    public static void cli(Scanner input) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String playerName = input.next();
        System.out.println("Hello, " + playerName + "!");
    }
    public static String cli(Scanner input, String playerName) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        playerName = input.next();
        System.out.println("Hello, " + playerName + "!");
        return playerName;
    }
}
