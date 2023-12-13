package hexlet.code.games;

import java.util.Scanner;

public class Cli {

    public static void cli() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner input = new Scanner(System.in);
        String playerName = input.next();
        System.out.println("Hello, " + playerName + "!");
    }

}
