package Recursion;

public class MessageProgram {
    public static void main(String[] args) {
        message();
    }
    static void message(){
        System.out.println("Hello World");
        message1();
    }
    static void message1(){
        System.out.println("Hello Universe");
        message2();
    }
    static void message2(){
        System.out.println("Hello Galaxies");
        message3();
    }
    static void message3(){
        System.out.println("Hello SolarSystem");
    }

}
//One Function calling another function