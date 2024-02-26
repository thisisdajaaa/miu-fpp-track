package lesson1_2;

import java.util.Random;

public class RandomNumbers {
    static Random random = new Random();

    public static int getRandomInt() {
        return random.nextInt();
    }

    public static int getRandomInt(int lower, int upper) {
        int difference = upper - lower;
        int start = getRandomInt();

        start = Math.abs(start) % (difference + 1);
        start += lower;

        return start;
    }

    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.nextInt() + " " + r.nextInt() + " " + r.nextInt() + " " + r.nextInt());
        r = new Random();
        System.out.println(r.nextInt() + " " + r.nextInt() + " " + r.nextInt() + " " + r.nextInt());
        r = new Random();
        System.out.println(r.nextInt() + " " + r.nextInt() + " " + r.nextInt() + " " + r.nextInt());
        r = new Random();
        System.out.println(r.nextInt() + " " + r.nextInt() + " " + r.nextInt() + " " + r.nextInt());
        String s = "hello";
        char c = s.charAt(0);
        char d = s.charAt(1);
        System.out.println(c + " " + d + " " + (char) (c + d));
    }
}
