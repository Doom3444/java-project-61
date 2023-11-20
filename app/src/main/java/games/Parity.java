package games;

public class Parity {
    public static final int MAXVALUECOEFFICIENT = 100;
    public static String parity() {
        String answer;
        int number;
        number = (int) (Math.random() * MAXVALUECOEFFICIENT);
        answer = number % 2 == 0 ? "yes" : "no";
        System.out.print("Question: " + number + "\nYour answer: ");
        return answer;
    }
}
