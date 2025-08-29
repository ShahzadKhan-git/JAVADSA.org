package Recursion;

public class QueReturndecreasing {
    public static void main(String[] args) {
        //Return numbers from n to 1;

       // decreasing(5);
        //increasing(5);
        both(5);
    }
    static void decreasing(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        decreasing(n-1);
    }

    static void increasing(int n){
        if(n==0){
            return;
        }
        increasing(n-1);
        System.out.println(n);
    }

    static void both(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        both(n-1);
        System.out.println(n);
    }
}
