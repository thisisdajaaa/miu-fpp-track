package lesson6;//package lesson6;

public class StudentRegion {
    public static void main(String[] args) {
        System.out.println(calculateRegions(new int[]{3, 5, 6})); // 6
        System.out.println(calculateRegions(new int[]{1, 2, 1})); // 5
        System.out.println(calculateRegions(new int[]{1, 1, 1, 1})); // 16
    }

    public static int calculateRegions(int[] heights) {
        int total = 0;

        for (int i = 0; i < heights.length; i++) {
            int regionLength = 1;

            // Extend region to the left
            for (int j = i - 1; j >= 0; j--) {
                if (heights[j] > heights[i]) break;
                regionLength++;
            }

            // Extend region to the right
            for (int j = i + 1; j < heights.length; j++) {
                if (heights[j] > heights[i]) break;
                regionLength++;
            }

            total += regionLength;
        }

        return total;
    }
}
