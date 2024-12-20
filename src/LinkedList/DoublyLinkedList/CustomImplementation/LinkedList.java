package LinkedList.DoublyLinkedList.CustomImplementation;

public class LinkedList {
   private Node head;
   private int size;
    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        if(head!=null){
            head.pre=node;
        }
        head=node;
        size++;
    }
    public void insertLast(int val){
        Node node=new Node(val);
        if(head==null){
            head=node;
            node.pre=null;
            return;
        }
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
        node.pre=temp;
        size++;
    }
    public void insert(int p,int val){
        if(p==0){
            insertFirst(val);
            return;
        }
        if(p==size){
            insertLast(val);
            return;
        }
        Node temp=head;
        for (int i = 1; i < p; i++) {
            temp=temp.next;
        }
        Node node=new Node(val);
        Node sec=temp.next;
        temp.next=node;
        node.pre=temp;
        node.next=sec;
        sec.pre=node;
    }
    public void display(){
        Node temp=head;
        while (temp!=null){
            if(temp.next==null){
                System.out.println(temp.value);
            }else {
                System.out.print(temp.value+"<->");
            }
            temp=temp.next;
        }
    }
    public LinkedList() {
        this.size = 0;
    }

    private class Node{
        int value;
        Node next;

        public Node(int value, Node next, Node pre) {
            this.value = value;
            this.next = next;
            this.pre = pre;
        }

        Node pre;
        public Node(int value) {
            this.value = value;
        }
    }
}
