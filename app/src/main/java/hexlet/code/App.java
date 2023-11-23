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
        Engine.engine(playerChoice, input);
        input.close();
    }
}
