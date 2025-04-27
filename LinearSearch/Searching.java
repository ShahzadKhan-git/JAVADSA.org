package LinearSearch;

public class Searching {
    public static void main(String[] args) {
        int [] nums= {12,34,53,565,63,3532,55,12,4,5,6,86,98,6,56};
        int target = 53;
        System.out.println(linearsearch(nums , target));

    }
    // Search in the Array : return the index if item found otherwise if item not found return -1
    static int linearsearch(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }

        //Run for a loop
        for(int index=0; index<arr.length; index++ ){
            if(arr[index]==target){
                return index;
            }
        }
        //This line will execute if none of the return statements above have executed and hence target not found
        return -1;

    }
}
