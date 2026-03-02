package LinkedList;

public class deletionInLL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node convert2LL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1; i<arr.length; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    public static void print(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    private static Node removesHead(Node head){
        if(head == null) return null;
        head = head.next;
        return head;
    }

    private static Node removesTail(Node head){
        if(head == null || head.next ==null) return null;
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    public static void main(String[] args){
        int[] arr = {2,3,5,7};
        Node head = convert2LL(arr);
        head = removesTail(head);
        print(head);

    }
}
