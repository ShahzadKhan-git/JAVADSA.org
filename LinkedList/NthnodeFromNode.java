package LinkedList;

public class NthnodeFromNode {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    static void display(Node head){
        Node temp = head;
        while(temp!=null){

            System.out.print(temp.data + " ");
            temp=temp.next;
        }
    }

    static Node nthFromlast(Node head,int index){
        Node slow = head;
        Node fast = head;

        for(int i=1; i<=index; i++){
            fast = fast.next;
        }

        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    static void deleteNthFromEnd(Node head,int index){
        Node fast = head;
        Node slow = head;
        nthFromlast(head,index);
        slow = slow.next;
        slow.next = slow.next.next;
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);

       a.next = b;
       b.next =c;
       c.next = d;

       display(a);

       Node p = nthFromlast(a,2);
       System.out.println("\n" + p.data);
       
       deleteNthFromEnd(a,2);
       display(a);


    }
}
