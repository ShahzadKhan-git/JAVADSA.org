package stacks;

import java.util.Stack;

public class basics {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(3);
        st.push(5);
        st.push(7);
        st.push(9);

        //To view top of the element
        System.out.println(st.peek());

        //To print all the elements in the stack
        System.out.println(st);

        st.pop();
        System.out.println(st);

        //To find out size of the element
        System.out.println("Size is: " + st.size());

        //To print first element of the stack
        while(st.size()>1){
            st.pop();
        }
        System.out.println(st.peek());

    }
}
