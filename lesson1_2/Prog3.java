package lesson1_2;

import java.util.Arrays;
import java.util.List;

public class Prog3 {
    public static boolean isFound(String value, String[] array) {
        for (String s : array) {
            if (value.equals(s)) return true;
        }

        return false;
    }

    public static String[] removeDuplicate(String[] array) {
      int duplicateCount = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    duplicateCount++;
                }
            }
        }

        int newArrayLength = array.length - duplicateCount;
        String[] uniqueList = new String[newArrayLength];

        for (int i = 0; i < array.length; i++) {
            if (!isFound(array[i], uniqueList)) {
                uniqueList[i] = array[i];
            }

        }

        return uniqueList;
    };

    public static void main(String[] args) {
        String[] animals = new String[] {"horse", "dog", "cat", "horse", "dog"};
        String[] unique = removeDuplicate(animals);

        System.out.println(Arrays.toString(unique));
    }
}
