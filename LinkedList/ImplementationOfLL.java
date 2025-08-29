package LinkedList;

public class ImplementationOfLL {

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    public static class LinkedList{
        Node head = null;
        Node tail = null;
        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head==null){    //head==null means list is empty
                head = temp;
                tail = temp;
            }
            else{
                tail.next = temp;
                tail = temp;
            }
        }
        void insertAtBeginning(int val){
            Node temp = new Node(val);
            if(head==null){
                head = temp;
                tail = temp;
            }
            else{
                temp.next = head;
                head = temp;
            }
        }

        void insertAt(int index, int val){
            Node t = new Node(val);
            Node temp = head;
            if(index == length()){ //If we try to ensure that if we insert at end then tail pointer moves accordingly
                insertAtEnd(val);
                return;
            }
            else if(index==0){
                insertAtBeginning(val);
                return;
            } else if (index<0 || index>length()) {
                return;
            }

            for(int i=0; i<index-1;i++){
                temp=temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }

        int getAt(int index){
            if(index<0 || index>length()){
                return -1;
            }
            Node temp = head;
            for(int i=0; i<index;i++){
                temp=temp.next;
            }
            return temp.data;
        }

        int getNthfromlast(int index){
            Node temp= head ;
            int m = length() - index -1;
            for(int i=0; i<= m-1;i++){
                temp=temp.next;
            }
            return temp.data;
        }


        void display(){
            Node temp =head;
            while(temp!=null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

        int length(){ //It is a function of time complexity O(n)
            Node temp =head;
            int count=0;
            while(temp!=null){
                count++;
                temp = temp.next;
            }
            return count;
        }

        void deleteAt(int index){
            Node temp = head;
            for(int i=1;i<=index-1;i++){
                temp = temp.next;
            }
            temp.next=temp.next.next;
            if(index==length()-1){
                tail = temp;
            } 
            if(index==0){
                head=head.next;
            }
        }
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(5);
        ll.insertAtEnd(51);
        ll.insertAtEnd(52);
        ll.insertAtEnd(15);
        ll.insertAtBeginning(2);

        ll.insertAt(2,50);
        ll.deleteAt(0);
        ll.display();
        System.out.println("\n" + ll.getAt(0));
        System.out.println("\n" + ll.length());

        System.out.println(ll.getNthfromlast(1));
    }
}
