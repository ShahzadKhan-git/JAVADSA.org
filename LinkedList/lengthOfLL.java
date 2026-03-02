package LinkedList;

public class lengthOfLL {
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
        for(int i=1; i< arr.length; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    public static int lengthLL(Node head){
        int count =0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            count++;
        }
        return count;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4};
        Node head = convert2LL(arr);
        System.out.println(lengthLL(head));

    }
}
