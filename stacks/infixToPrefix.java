package stacks;

import java.util.Stack;

public class infixToPrefix {

    public static void main(String[] args) {
        String str = "9-(5+3)*4/6";
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int) ch;

            if (ascii >= 48 && ascii <= 57) {
                String s = " " + ch;
                val.push(s);
            } else if (op.size() == 0 || ch=='(' || op.peek()=='(') {
                op.push(ch);
            } else if(ch==')'){
                while(op.peek()!='('){
                    String val2 = val.pop();
                    String val1 = val.pop();
                    char x = op.pop();
                    String y = x + val1 + val2;
                    val.push(y);
                }
                op.pop();
            }
            else {
                if (ch == '+' || ch == '-') {
                    String val2 = val.pop();
                    String val1 = val.pop();
                    char x = op.pop();
                    String y = x + val1 + val2;
                    val.push(y);

                    op.push(ch);
                } else if (ch == '*' || ch == '/') {
                    if (op.peek() == '*' || op.peek() == '/') {
                        String val2 = val.pop();
                        String val1 = val.pop();
                        char x = op.pop();
                        String y = x + val1 + val2;
                        val.push(y);

                    } else {
                        op.push(ch);
                    }
                }
            }

        }

        while(val.size()>1){
            String val2 = val.pop();
            String val1 = val.pop();
            char x = op.pop();
            String y = x + val1 + val2;
            val.push(y);

        }
        System.out.println(val.pop());

    }
}
