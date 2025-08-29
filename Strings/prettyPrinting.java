package Strings;

public class prettyPrinting {
    public static void main(String[] args) {
        float num = 78.2344667f;
        System.out.printf("Formatted number is %.2f", num);

        //Here we println can't process Format specifier like %.2f

        System.out.printf("\nPie : %.2f", Math.PI);

        System.out.printf("\nMy name is %s and I am not a %s", "Khan", "Terrorist");
    }
}
