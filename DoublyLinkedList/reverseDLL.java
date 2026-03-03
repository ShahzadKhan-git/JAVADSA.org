package DoublyLinkedList;

import java.util.Scanner;

public class reverseDLL {
    public static class Node{
        int data;
        Node next;
        Node back;

        Node(int data){
            this.data = data;
            this.next = null;
            this.back = null;
        }

        Node(int data1, Node next1, Node back1){
            this.data = data1;
            this.next = next1;
            this.back = back1;
        }
    }

    public static Node convertArr2DLL(int[] arr){
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

    public static Node reverse(Node head){
        Node prev = null;
        Node current = head;

        while(current!=null){
            prev = current.back;
            current.back = current.next;
            current.next = prev;

            current = current.back;
        }
        return prev.back;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        Node head = convertArr2DLL(arr);

        head = reverse(head);
        print(head);
    }
}
