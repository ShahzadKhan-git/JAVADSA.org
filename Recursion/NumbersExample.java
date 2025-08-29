package Recursion;

public class NumbersExample {
    public static void main(String[] args) {
        //Print first 5 numbers
        number1(1);
    }
    static void number1(int n){
        System.out.println(n);
        number2(2);
    }
    static void number2(int n){
        System.out.println(n);
        number3(3);
    }
    static void number3(int n){
        System.out.println(n);
        number4(4);
    }
    static void number4(int n){
        System.out.println(n);
        number5(5);
    }
    static void number5(int n){
        System.out.println(n);
    }
}
