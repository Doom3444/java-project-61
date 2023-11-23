package hexlet.code.games;

public class PrimeNumber {
    public static final int MAX_VALUE_COEFFICIENT = 100;
    public static String primeNumber() {
        int number = (int) (Math.random() * MAX_VALUE_COEFFICIENT);
        String answer = prime(number) ? "yes" : "no";
        System.out.print("Question: " + number + "\nYour answer: ");
        return answer;
    }
    public static boolean prime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
