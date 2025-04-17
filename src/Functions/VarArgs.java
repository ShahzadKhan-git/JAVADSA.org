package Functions;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
fun(2,34,56,6,65,4,34,5,6,54,3,65,5,43,56,54);
multiple(2,3,"Shahzad","Khan");
    }
    static void multiple(int a, int b, String ...v){

    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
