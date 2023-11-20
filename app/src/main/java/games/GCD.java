package games;

public class GCD {
    public static final int MAXVALUECOEFFICIENT = 100;
    public static String gcd() {
        String answer;
        int numberFirst;
        int numberSecond;
        numberFirst = (int) (Math.random() * MAXVALUECOEFFICIENT);
        numberSecond = (int) (Math.random() * MAXVALUECOEFFICIENT);
        answer = Integer.toString(gcdOfNumbers(numberFirst, numberSecond));
        System.out.print("Question: " + numberFirst + " " + numberSecond + "\nYour answer: ");
        return answer;
    }
    public static int gcdOfNumbers(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
}
