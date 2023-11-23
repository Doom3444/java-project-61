package hexlet.code.games;

public class PrimeNumber {
    private static final int MAX_VALUE_COEFFICIENT = 100;
    private static final int FIRST_ATTEMPT = 0;
    public static String primeNumber(int tries) {
        if (tries == FIRST_ATTEMPT) {
            System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        }
        int number = (int) (Math.random() * MAX_VALUE_COEFFICIENT);
        String answer = prime(number) ? "yes" : "no";
        System.out.print("Question: " + number + "\nYour answer: ");
        return answer;
    }
    private static boolean prime(int number) {
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
