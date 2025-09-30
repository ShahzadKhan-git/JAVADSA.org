package Array;

import java.util.Scanner;

public class CheckIfArrayIsSortedOrNot {
    static boolean Sorted(int[] nums){
        for(int i=1; i<nums.length; i++){
            if(nums[i]<nums[i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(Sorted(arr));
    }
}
