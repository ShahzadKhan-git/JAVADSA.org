package RecursionArray;

public class SortedArray {
    public static void main(String[] args) {
        //To check whether the array is sorted or not
        int[] arr = {1,2,3,45,56,77,87};
        System.out.println(sorted(arr,0));
    }

    static boolean sorted(int[] arr,int index){
        if(index == arr.length-1 ){
            return true;
        }
        return arr[index] < arr[index+1] && sorted(arr,index+1);
    }
}
