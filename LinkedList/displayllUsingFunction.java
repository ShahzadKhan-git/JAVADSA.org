package LinkedList;

public class displayllUsingFunction {

    public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }

    //Calling Recursively
    static void displayr(Node head){
        if(head == null) return;

        System.out.print(head.data + " ");
        displayr(head.next);
    }
    //This will print the list but in reverse order
    static void displayreverse(Node head){
        if(head == null) return;

        displayreverse(head.next);
        System.out.print(head.data + " ");

    }

    static int length(Node head){
        int count = 0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(12);
        Node b = new Node(24);
        Node c = new Node(36);

        a.next = b;
        b.next = c;

        displayreverse(a);
        int length = length(a);
        System.out.println("\n" + length);

    }
}
