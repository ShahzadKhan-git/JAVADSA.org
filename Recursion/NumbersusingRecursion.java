package Recursion;

public class NumbersusingRecursion {
    public static void main(String[] args) {
        //Print first 5 numbers : 1,2,3,4,5
        print(1);
    }
    static void print(int n){

        //Base Condition
        if(n==5){
            System.out.println(n);
            return;
        }
        System.out.println(n);

        //Recursive Call
        print(n+1);
    }
}
