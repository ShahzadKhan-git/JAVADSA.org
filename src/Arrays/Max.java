package Arrays;

public class Max {
    public static void main(String[] args) {
        int arr[] = { 12, 34, 45, 87, 91, 73};
        System.out.println(maxRange(arr, 0,3));
    }
    static int maxRange(int[] arr , int start, int end) {
        int max = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        return max;
    }
    static int max(int[] arr){
        int maxval = arr[0];
        for(int i=1; i <arr.length; i++){
            if(arr[i] > maxval){
                maxval = arr[i];
            }

        }
        return maxval;
    }
}
