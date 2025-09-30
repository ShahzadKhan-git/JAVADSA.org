package Array;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {
    static int RemoveDup(int[] arr){
        int res = 1;
        for(int i=1; i<arr.length; i++){
            if(arr[i]!=arr[res-1]){
                arr[res] = arr[i];
                res++;

            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(RemoveDup(arr));
    }
}
