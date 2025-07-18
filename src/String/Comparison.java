package String;

public class Comparison {
    public static void main(String[] args) {
        String a = "Kunal";
        String b = "Kunal";

        System.out.println(a==b);

        // == (Comparison operator)
        // This is a string pool and both points the same string object

        String name1 = new String("Shahzad");
        String name2 = new String("Shahzad");

        System.out.println(name1==name2);
        //This method point the same object but out of the string poll

        System.out.println(name1.equals(name2));
        // this method checks only that both the string are equal or not

        System.out.println(name1.charAt(0));

    }
}
