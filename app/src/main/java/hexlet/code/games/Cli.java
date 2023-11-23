package hexlet.code.games;

import java.util.Scanner;
public class Cli {
    public static String cli(Scanner input) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String playerName = input.next();
        System.out.println("Hello, " + playerName + "!");
        return playerName;
    }
}
