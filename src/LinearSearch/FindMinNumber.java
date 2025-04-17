package LinearSearch;

public class FindMinNumber {
    public static void main(String[] args) {
        int[] nums = { 12,45,65,7,8,9,23,12,4,35,356};
        System.out.println(min(nums));
    }
    static int min(int[] arr){
        int minimum=arr[0];
        for(int i=0; i<arr.length; i++){
            if (minimum> arr[i]){
                minimum = arr[i];
            }
        }
        return minimum;
    }
}
