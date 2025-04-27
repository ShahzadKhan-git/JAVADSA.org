package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          int[][] array = new int[3][3];
        //adding number of row is mandatory , adding column is not much that mandatory


        int[][] num = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] arr2D = {
                {1, 2, 3},
                {4, 5},
                {7, 8, 9, 10}
        };

        int[][] arr = new int[3][3];
        System.out.println(arr.length);//Length of the row

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }

            for ( row = 0; row < arr.length; row++) {
                for (int col = 0; col < arr[row].length; col++) {
                    System.out.print(arr[row][col] + " ");
                }
                System.out.println();
             }

            //simplest way to print
            for( row=0; row < arr.length; row++){
                System.out.println(Arrays.toString(arr[row]));
            }
        }
    }
}