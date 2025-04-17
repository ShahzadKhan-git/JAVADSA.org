package Functions;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        //greeting();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name= sc.nextLine();
        String personalized = mygreet(name);
        System.out.println(personalized);
    }
    static String mygreet(String name){
        String message= "Hello " + name;
        return message;
    }
    static void greeting(){
        System.out.println("Hello World");
    }

}
