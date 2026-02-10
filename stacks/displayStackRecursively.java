package stacks;

import java.util.Stack;

public class displayStackRecursively {
    public static void displayRecRev(Stack<Integer> s) {
        if (s.isEmpty()) return; //it can be also written as if s.size()==0

        int top = s.pop();
        System.out.print(top + " ");
        displayRecRev(s);  //Here it is displayed reve rsely
        s.push(top);
    }

        public static void displayRec(Stack<Integer> s){
            if(s.isEmpty()) return; //it can be also written as if s.size()==0

            int top = s.pop();
            displayRec(s);
            System.out.print(top + " ");

            s.push(top);


        }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(3);
        st.push(5);
        st.push(8);
        st.push(10);
        System.out.println(st);

        displayRec(st);

       // displayRecRev(st);

    }
}
