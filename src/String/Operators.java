package String;
import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b'); //adds the ASCII value

        System.out.println("a" + "b"); //Concatenate the string

        System.out.println((char)('a' + 3)); //ASCII value of a is 97 so, 97+3 is converted 100 that is the ASCII value of d

        System.out.println("a" + 1);
        //This will be same as "a" + "1"
        //Integer will be converted to Integer that will call toString()

        System.out.println("Shahzad" + new Integer(8055));

        String ans = new Integer(55) + "" + new ArrayList<>();
        System.out.println(ans);

        System.out.println("a" + 'a'); //If one of the datatype is string then it is converted into string
    }
}
