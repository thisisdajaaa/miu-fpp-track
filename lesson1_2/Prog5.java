package lesson1_2;

import java.util.Arrays;

public class Prog5 {
    public static int[] combine(int[] array1, int[] array2) {
        int[] newArray = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            newArray[i] = array1[i];
        }

        int counter = array1.length;

        for (int i = 0; i < array2.length; i++) {
            newArray[counter++] = array2[i];
        }
        
        return newArray;
    }

    public static void main(String[] args) {
        int[] a = new int[] { 5, 6, -4, 3, 1 };
        int[] b = new int[] { 3, 8, 9, 11 };
        int[] combinedArray = combine(a, b);
        System.out.println("Combined Array : " + Arrays.toString(combinedArray));
    }
}
