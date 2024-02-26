package lesson4;

public class Prog3 {
    public static int getSum(int[] array) {
        return getSumHelper(0, array, 0);
    }

    public static int getSumHelper(int processed, int[] unprocessed,  int index) {
        if (index >= unprocessed.length) {
            return processed;
        }

        return getSumHelper(processed + unprocessed[index], unprocessed, ++index);
    }

    public static void main(String[] args) {
        System.out.println(getSum(new int[]{1, 2, 3}));
    }
}
