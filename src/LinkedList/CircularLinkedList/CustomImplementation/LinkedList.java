package LinkedList.CircularLinkedList.CustomImplementation;


public class LinkedList {
    private Node tail;
    private Node head;
    public void insert(int value){
        Node node=new Node(value);
        if(head==null){
            head=node;
            tail=node;
            return;
        }
        tail.next=node;
        node.next=head;
        tail=node;
    }
    public void display(){
        Node temp=head;
        do{
            System.out.print(temp.value+"->");
            temp=temp.next;
        }while (temp!=head);
        System.out.println("HEAD");
    }
    public void delete(int val){
        Node temp=head;
        while (temp.next.value!=val){
            temp=temp.next;
        }
        Node temp2=temp.next;
        temp.next=temp2.next;
    }
    private class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
