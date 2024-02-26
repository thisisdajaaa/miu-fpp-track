package lesson4;

public class Prog2 {
    public static int getNumOfDigits(int num) {
        return getNumOfDigitsHelper(0, num);
    }

    public static int getNumOfDigitsHelper(int processed, int unprocessed) {
        if (unprocessed == 0) {
            return processed;
        }

        return getNumOfDigitsHelper(++processed, unprocessed / 10);
    }

    public static void main(String[] args) {
        System.out.println(getNumOfDigits(12345));
    }
}
