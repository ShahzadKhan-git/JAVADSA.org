package stacks;

public class linkedListImplementationOfStack {
    public static class Node {
       int data;
       Node next;
       Node(int data){
           this.data = data;
       }
    }

    public static class Stack{
        Node head = null;
        int size =0;

        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }
        int pop(){
            if(head==null){
                System.out.println("Stack is Empty");
                return -1;
            }
            int x = head.data;
            head = head.next;
            return x;

        }

        int peek(){
            if(head==null){
                System.out.println("Stack is Empty");
                return -1;
            }
            return head.data;
        }

        void displayRec(Node h){
            if(h==null) return;
            displayRec(h.next);
            System.out.print(h.data + "");
        }
        void display(){
            displayRec(head);
            System.out.println();
        }

        int size(){
            return size;
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(4);
        st.push(6);

        st.display();

        st.pop();
        st.display();

        System.out.println(st.peek());

        System.out.println(st.size());
    }
}
