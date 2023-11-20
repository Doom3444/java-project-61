package games;

public class Parity {
    public static int maxValueCoefficient = 100;
    public static String parity() {
        String answer;
        int number;
        number = (int) (Math.random() * maxValueCoefficient);
        answer = number % 2 == 0 ? "yes" : "no";
        System.out.print("Question: " + number + "\nYour answer: ");
        return answer;
    }
}
