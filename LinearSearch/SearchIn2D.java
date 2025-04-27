package LinearSearch;

import java.util.Arrays;

public class SearchIn2D {
    public static void main(String[] args) {
        int[][] arr = {
                {12, 34, 45, 67,53, 432},
                {43,66,11,45,},
                {12,77,90},
                {124,567}
        };
        int target= 90;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));//Arrays.toString is used as it prints the array having an element row and column
    }
    static int[] search(int[][] arr, int target){
        for(int row=0; row< arr.length; row++){
            for(int col=0 ; col < arr[row].length; col++){
                if(arr[row][col] == target){
                    return new int[]{row ,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
