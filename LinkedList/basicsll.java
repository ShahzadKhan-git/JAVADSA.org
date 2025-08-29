package LinkedList;

public class basicsll{
    public static class Node{
        int data; //data
        Node next; //address of next node
        Node(int data){
            this.data = data;
        }
    }

    public static void insertAtEnd(Node head,int val){
        Node temp = new Node(val);
        Node t = head;
        while(t.next!=null){
            t = t.next;
        }
        t.next = temp;
    }
    public static void main(String[] args) {
        Node a = new Node(5); //Head
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);

        a.next = b; //5 -> 3 9 8 16 (Address of b is stored in the a)
        b.next = c; //5 -> 3 -> 9 8 16
        c.next = d; //5 -> 3 -> 9 -> 8 16
        d.next = e; //5 -> 3 -> 9 -> 8 -> 16

        //Displaying a LinkedList using Head only
        System.out.print(a.data + " -> ");
        System.out.print(a.next.data + " -> ");
        System.out.print(a.next.next.data + " -> ");
        System.out.print(a.next.next.next.data + " -> ");
        System.out.print(a.next.next.next.next.data+ "\n");

        //OR


        // Printing the list
        Node temp =  a;
       while(temp!=null){
           System.out.print(temp.data + " ");
           temp = temp.next;
       }

    }
}
