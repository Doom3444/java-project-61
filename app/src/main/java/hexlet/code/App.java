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
        switch (playerChoice) {
            case "1":
                Engine.game1(input);
                break;
            case "2":
                Engine.game2(input);
                break;
            case "3":
                Engine.game3(input);
                break;
            case "4":
                Engine.game4(input);
                break;
            case "5":
                Engine.game5(input);
                break;
            case "6":
                Engine.game6(input);
                break;
            //В принципе можно было оставить 0 как дефолтный выход, но мне сие не нравится :)
            case "0":
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
        input.close();
    }
}
