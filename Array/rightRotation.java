package Array;

import java.util.Scanner;

public class rightRotation {
    public static void Rotate(int[] arr, int d){
        int n= arr.length;
        Reverse(arr,0, n-d-1 );
        Reverse(arr, n-d , n-1);
        Reverse(arr, 0, n-1);
    }

    public static void Reverse(int[] arr, int start, int end){
        int n= arr.length;
        while(start< end){
            int temp= arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k=2;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Rotate(arr, k);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

