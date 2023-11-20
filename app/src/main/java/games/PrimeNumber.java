package games;

public class PrimeNumber {
    public static final int maxValueCoefficient = 100;
    public static String primeNumber() {
        String answer;
        int number;
        number = (int) (Math.random() * maxValueCoefficient);
        answer = prime(number) ? "yes" : "no";
        System.out.print("Question: " + number + "\nYour answer: ");
        return answer;
    }
    public static boolean prime(int a) {
        if (a <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}
