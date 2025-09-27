package Array;
import java.util.Scanner;


public class LargestElement {

    static int Largest(int[] nums){
        int res=0;
        for(int i=1; i<nums.length; i++){
            if(nums[i]>nums[res]){
                res = i;
            }
        }
        return res;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter the elements of array :");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println(" " + Largest(arr));


    }
}
