package games;

public class GCD {
    public static int maxValueCoefficient = 100;
    public static String gcd() {
        String answer;
        int numberFirst;
        int numberSecond;
        numberFirst = (int) (Math.random() * maxValueCoefficient);
        numberSecond = (int) (Math.random() * maxValueCoefficient);
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
