package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>(10);
        list.add(23);
        list.add(21);
        list.add(25);
        list.add(26);
        list.add(54);
        list.add(20);
        list.add(23);
        list.add(43);


        System.out.println(list.contains(25));//check if it contains the elements
        System.out.println(list);

        list.set(0,34); //change the 0th index element

        list.remove(2);
        System.out.println(list);

        //Input
        for(int i=0; i<5 ;i++){
            list.add(sc.nextInt());
        }

        //Get Item in any index
        for(int i=0; i<5; i++){
            System.out.println(list.get(i));
        }

        System.out.println(list);

    }
}
