package stacks;

import java.util.Stack;

public class reverseStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(3);
        st.push(5);
        st.push(7);

        System.out.println(st);

        Stack<Integer> rt = new Stack<>();
        while(!st.isEmpty()){
            rt.push(st.pop());
        }

        Stack<Integer> at = new Stack<>();
        while(!rt.isEmpty()){
            at.push(rt.pop());
        }

        while(!at.isEmpty()){
            st.push(at.pop());
        }
        System.out.println(st);



    }
}
