package Maps_And_Sets;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSumReturnOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            int diff = target - arr[i];

            if(map.containsKey(diff)){
                System.out.println(arr[map.get(diff)] + " " + arr[i]);
                return;
            }

            map.put(arr[i],i);
        }
    }
}
