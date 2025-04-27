package LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] nums={12,34,5,6,87,553,246,68,879,54,3,46,58,89,656,34};
        int target= 12;
        int ans = search(nums , target, 1,4);
        System.out.println(ans);

    }
    static int search(int[] arr, int target, int start, int end){
        if(arr.length==0){
            return -1;
        }
        for(int index=start ;index<end ; index++){
            int element = arr[index];
            if(element==target){
                return index;
            }

        }
        return -1;
    }
}
