package LinkedList;

public class insertionInLL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
        Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    public static Node convertArr2LL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1; i<arr.length; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    public static Node insertHead(Node head, int val){
        Node temp = new Node(val);
        temp.next = head;
        return temp;
    }

    public static Node insertTail(Node head, int val){
        if(head == null) return new Node(val);
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        Node newNode = new Node(val);
        temp.next = newNode;
        return head;
    }

    public static Node insertAtK(Node head, int element, int k){
        if(head == null){
            if(k==1){
                return new Node(element);
            }
            else{
                return head;
            }
        }
        if(k==1){
            Node temp = new Node(element);
            temp.next = head;
            return temp;
        }
        int count =0;
        Node temp = head;
        while(temp!=null){
            count++;
            if(count == (k-1)){
               Node x = new Node(element);
                x.next = temp.next;
                temp.next = x;
                break;
            }
            temp = temp.next;
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

    public static void main(String[] args){
        int[] arr = {2,3,4,5,6};
        Node head = convertArr2LL(arr);
        head = insertAtK( head,100, 2);
        print(head);
    }
}
