package LinearSearch;

public class ReturnElement {
    public static void main(String[] args) {
        int [] nums= {12,34,53,565,63,3532,55,12,4,5,6,86,98,6,56};
        int target = 53;
        int ans = linearsearch(nums , target);
        System.out.println(ans);

    }
    // Search and return elememt
    static int linearsearch(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }

        //Run for a loop
        for(int element : arr){
            if(element==target){
                return element;
            }
        }
        //This line will execute if none of the return statements above have executed and hence target not found
        return Integer.MAX_VALUE;
        //Here we do not return -1 cause -1 can be the element in an array

    }
}


