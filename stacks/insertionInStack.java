package stacks;

import java.util.Stack;

public class insertionInStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(3);
        st.push(5);
        st.push(7);
        st.push(9);
        System.out.println(st);

        int index = 2; //This is the index where I want to push element
        int x = 4; //THis is the value which I want to push into the stack

        Stack<Integer> temp = new Stack<>();
        while(st.size()>index){
            temp.push(st.pop());
        }
        st.push(x);

        while(temp.size()>0){
            st.push(temp.pop());
        }
        System.out.println(st);

    }
}
