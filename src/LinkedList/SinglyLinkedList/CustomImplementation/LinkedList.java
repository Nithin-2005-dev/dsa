package LinkedList.SinglyLinkedList.CustomImplementation;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;
    public LinkedList(){
        this.size=0;
    }
    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size++;
    }
    public void insertLast(int val){
        Node node=new Node(val);
        if(tail!=null){
            tail.next=node;
        }
        tail=node;
        if(head==null){
            head=tail;
        }
        size++;
    }
    public Node find(int val){
        Node temp=head;
        while (temp!=null){
            if(temp.value==val){
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }
    public void display(){
        Node temp=head;
        while (temp!=null){
            if(temp.next==null){
                System.out.println(temp.value);
            }else {
                System.out.print(temp.value+"->");
            }
            temp=temp.next;
        }
    }
    //insert using recursion
    public void insertRec(int val,int index){
        insertRec(val,index,head);
    }
    private Node insertRec(int val,int index,Node node){
        if(index==0){
            Node temp=new Node(val);
            temp.next=node;
            size++;
            return temp;
        }
        node.next=insertRec(val,index-1,node.next);
        return node;
    }
    public void insert(int p,int val){
        if(p==0){
            this.insertFirst(val);
            return;
        }
        if(p==size){
            this.insertLast(val);
            return;
        }
        Node temp=head;
        for (int i = 1; i <p ; i++) {
            if(temp!=null){
                temp=temp.next;
            }else {
                System.out.println("not possible");
                return;
            }
        }
        Node node=new Node(val);
        Node sec=temp.next;
        temp.next=node;
        node.next=sec;
        size++;
    }
    public int deleteFirst(){
        int val= head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }
    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node temp=head;
        for (int i = 1; i < size-1; i++) {
            temp=temp.next;
        }
        int val=temp.next.value;
        temp.next=null;
        size--;
        return val;
    }
    public int delete(int index){
        if(index==0){
           return deleteFirst();
        }
        if(index==size-1){
           return deleteLast();
        }
        Node temp=head;
        for (int i = 1; i < index-1; i++) {
            temp=temp.next;
        }
        Node tgt=temp.next;
        temp.next=tgt.next;
        return tgt.value;
    }
    private class Node{
        private int value;
        private Node next;
        public Node(int value) {
            this.value=value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
