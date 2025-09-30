package Array;

import java.util.Scanner;

public class SecondLargestElement {
    static int SecondL(int[] nums){
        int seclargest = -1;
        int largest = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[i]>nums[largest]){
               seclargest = largest;
               largest = i;
            }
            else if(nums[i] != nums[largest]) {
                if(seclargest==-1 || nums[i]>nums[seclargest]){
                    seclargest=i;
                }
            }

        }
        return seclargest == -1 ? -1 : nums[seclargest];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(SecondL(arr));
    }
}
