package lesson1_2;

public class Prog6 {
    public static int findMin(int[] array) {
        if (array.length == 0) return 0;

        int min = array[0];

        for (int j : array) {
            if (min > j) {
                min = j;
            }
        }

        return min;
    }


    public static void main(String[] args) {
        int[] arrayOfInts = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};

        int minimum = findMin(arrayOfInts);

        System.out.println("Minimum: " + minimum);
    }
}
