package Strings;

import java.util.Arrays;

public class reverseString {
    public static void reverse(char[] s){
        int left = 0;
        int right = s.length-1;

        while(left<right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(s));

    }
    public static void main(String[] args) {
        String s = "abcdef";
        char[] ch = s.toCharArray();
        System.out.println(Arrays.toString(ch));
        reverse(ch);

    }
}
