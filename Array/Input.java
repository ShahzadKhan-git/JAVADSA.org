package Array;
import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 40;
        arr[3] = 50;
        arr[4] = 60;
        System.out.println(arr[4]);

        //input using for loop
        for (int i = 0; i < arr.length; i++) {
           System.out.println("Enter the array " + i + " : ");
           arr[i] = sc.nextInt();
        }
         for(int i=0;i<arr.length;i++){
           System.out.print(arr[i] + " ");
         }

        //for each loop to print the array
        for (int num : arr) { //for every element in array,print the element
            System.out.println(num + " ");//here num represents the element of the array
        }

        //just a simple way to print an array, it is best
        System.out.println(Arrays.toString(arr));

        //arrays of objects
        String[] str = new String[4];
        for(int i=0;i<str.length;i++){
            str[i]=sc.nextLine();
        }
        System.out.println(Arrays.toString(str));

        //Direct access the element and print them
        str[1]="Shahzad";
        System.out.println(Arrays.toString(str));
    }
}
