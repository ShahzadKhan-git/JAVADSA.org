package Maps_And_Sets;

import java.util.HashMap;
import java.util.Scanner;
import java.util.*;

public class characterCounting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                if (map.containsKey(ch)) {
                    int freq = map.get(ch);
                    map.put(ch, freq + 1);
                } else map.put(ch, 1);
            }
        }

        for(Character key : map.keySet()){
            System.out.println(key + "-" + map.get(key));
        }

    }
}
