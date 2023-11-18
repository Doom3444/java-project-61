package games;

public class TemplateAnswer {
    public static boolean answer(String playerName,
                                 String correctAnswer,
                                 String playerAnswer,
                                 int counter,
                                 int maxTries) {
        if (playerAnswer.equals(correctAnswer) && counter < maxTries - 1) {
            System.out.println("Correct!");
            return true;
        }
        if (playerAnswer.equals(correctAnswer) && counter == maxTries - 1) {
            System.out.println("Correct!");
            System.out.println("Congratulations, " + playerName + "!");
            return true;
        }
        System.out.println("'" + playerAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
        System.out.println("Let's try again, " + playerName + "!");
        return false;
    }
}
