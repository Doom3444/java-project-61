package hexlet.code.utils;

public class RandomGenerator {

    //random number from: [0, a)
    public static int getRandom(int a) {
        return (int) (Math.random() * a);
    }

    //random number from: [a, a + b)
    public static int getRandom(int a, int b) {
        return (int) (a + Math.random() * b);
    }

}
