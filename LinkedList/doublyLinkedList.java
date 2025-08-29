package LinkedList;

public class doublyLinkedList {
    public static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
        }
    }
    public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void displayrev(Node tail){
        Node temp = tail;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.prev;
        }
        System.out.println();
    }
    public static void display2(Node random){
        Node temp = random;
        while(temp.prev!=null){
            temp=temp.prev;
        }
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static Node insertAtHead(Node head, int x){
        Node t = new Node(x);
        t.next = head;
        head.prev = t;
        head =t;
        return head;
    }

    public static void insertAtTail(Node head, int y){
        Node temp = head;
        while(temp.next!= null){
            temp = temp.next;
        }
        Node t = new Node(y);
        temp.next = t;
        t.prev = temp;

    }

    public static void insertAtIdx(Node head, int idx, int x){
        Node s = head;
        for(int i=1; i<=idx-1; i++){
            s = s.next;
        }
        Node r = s.next;
        Node t = new Node(x);
        s.next = t;
        t.prev = s;
        t.next = r;
        r.prev = t;
    }

    public static void deleteAtHead(Node head,int index){
        if(index == 0) {
            head = head.next;
            head.prev = null;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(10);
        Node c = new Node(2);
        Node d = new Node(99);
        Node e = new Node(13);
        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = null;

        display(a);
        displayrev(e);
        display2(c);

        Node newHead = insertAtHead(a,35);
        display(newHead);

        insertAtTail(a,40);
        display(a);

        insertAtIdx(a,2,50);
        display(a);

        display(a);



    }
}
