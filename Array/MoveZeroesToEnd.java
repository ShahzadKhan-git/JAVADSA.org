package Array;

import java.util.Scanner;

public class MoveZeroesToEnd {
    public static void MoveZeroes(int[] arr, int n){
        int j=-1;
        for(int i=0; i<n; i++){
            if(arr[i]==0) {
                j=i;
                break;
            }
        }
        for(int i=j+1; i<n; i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        MoveZeroes(arr,n);

        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
