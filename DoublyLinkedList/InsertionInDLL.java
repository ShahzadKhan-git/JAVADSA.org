package DoublyLinkedList;

public class InsertionInDLL {
    public static class Node{
        int data;
        Node next;
        Node back;

        Node(int data){
            this.data= data;
            this.next = null;
            this.back = null;
        }

        Node(int data1, Node next1, Node back1){
            this.data = data1;
            this.next = next1;
            this.back = back1;
        }
    }
    public static Node convert2DLL(int[] arr){
        Node head = new Node(arr[0]);
        Node prev = head;
        for(int i=1; i<arr.length; i++){
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    public static void print(Node head){
       while(head!=null){
           System.out.print(head.data + " ");
           head = head.next;
       }
    }

    public static Node insertBeforeHead(Node head, int val){
        Node newHead = new Node(val, head, null);
        head.back = newHead;

        return newHead;
    }



    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        Node head = convert2DLL(arr);
        head = insertBeforeHead(head,0);
        print(head);
   }
}
