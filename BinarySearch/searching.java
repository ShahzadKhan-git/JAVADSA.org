package BinarySearch;

public class searching {
    public static void main(String[] args) {
        int [] arr = {1,3,5,7,9,13, 67, 89};
        int target =9;
        int ans= binarysearch(arr,target);
        System.out.println(ans);
    }

    static int binarysearch(int[] arr, int target){
        int start=0;
        int end= arr.length;


        while(start<=end){
            int mid = start + (end-start)/2;
            if (target<arr[mid]){
                end = mid-1;
            } else if (target>arr[mid]) {
                start = mid+1;
            }
            else{
                return mid;
            }

        }
    return -1;
    }
}
