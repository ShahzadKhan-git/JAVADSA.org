package BinarySearch;

import java.util.Arrays;

public class MxNmatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 50} // Fixed the missing element
        };

        System.out.println(Arrays.toString(search(arr, 50)));
    }

    static int[] search(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int start = 0;
        int end = n * m - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int row = mid / m;
            int col = mid % m;

            if (matrix[row][col] == target) {
                return new int[]{row, col};
            } else if (matrix[row][col] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return new int[]{-1, -1}; // Not found
    }
}
