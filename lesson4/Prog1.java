package lesson4;

public class Prog1 {
    public static int reverse(int n) {
        if (n < 0) {
            return -reverseHelper(0, n);
        }

        return reverseHelper(0, n);
    }

    public static int reverseHelper(int processed, int unprocessed) {
        if (unprocessed == 0)  return processed;

        return reverseHelper(processed * 10 + unprocessed % 10, unprocessed / 10);
    }

    public static void main(String[] args) {
        System.out.println(reverse(123));
    }
}
