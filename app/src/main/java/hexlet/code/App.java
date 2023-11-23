package hexlet.code;

import hexlet.code.games.Engine;
import java.util.Scanner;

public class App {
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
        if (correctChoice(playerChoice)) {
            Engine.engine(playerChoice, input);
        } else {
            System.out.println("Invalid choice");
        }
        input.close();
    }
    private static boolean correctChoice(String playerChoice) {
        String[] correctChoice = {"1", "2", "3", "4", "5", "6"};
        for (String choice : correctChoice) {
            if (playerChoice.equals(choice)) {
                return true;
            }
        }
        return false;
    }
}
