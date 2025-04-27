package LinearSearch;

public class ReturnTRUEorFALSE {
    public static void main(String[] args) {
        int [] nums= {12,34,53,565,63,3532,55,12,4,5,6,86,98,6,56};
        int target = 77864;
        boolean ans = linearsearch(nums , target);
        System.out.println(ans);

    }
    // Search in the Array : return the index if item found otherwise if item not found return -1
    static boolean linearsearch(int[] arr, int target){
        if(arr.length==0){
            return false;
        }

        //Run for a loop
        for(int element: arr ){
            if(element==target){
                return true;
            }
        }
        //This line will execute if none of the return statements above have executed and hence target not found
        return false;

    }
}


