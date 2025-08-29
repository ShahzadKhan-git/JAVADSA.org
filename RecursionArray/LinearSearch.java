package RecursionArray;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {23, 4, 4, 53, 13, 65, 76, 80, 21};
        System.out.println(index(arr, 0, 4));

        ArrayList<Integer> ans = findList(arr, 4, 0, new ArrayList<>());
        System.out.println(ans);
    }

    static boolean search(int[] arr, int index, int target) {
        if (index == arr.length - 1) {
            return false;
        }
        return arr[index] == target || search(arr, index + 1, target);
    }

    //Return the index value of the target
    static int index(int[] arr, int index, int target) {
        if (index == arr.length - 1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return index(arr, index + 1, target);
        }
    }

    //Return the list of all the same target elements
//    static ArrayList<Integer> list = new ArrayList<>();
//    static int findAllindex(int[] arr, int index, int target){
//        if(index == arr.length-1){
//            return -1;
//        }
//        if(arr[index]==target){
//            list.add(index);
//        }
//        return findAllindex(arr,index+1,target);
//    }
//}

    static ArrayList<Integer> findList(int[] arr, int target, int index, ArrayList<Integer> list) {
        // Base condition
        if (index == arr.length) {
            return list;
        }

        // If target found, add index
        if (arr[index] == target) {
            list.add(index);
        }

        // Continue recursion
        return findList(arr, target, index + 1, list);
    }
}

