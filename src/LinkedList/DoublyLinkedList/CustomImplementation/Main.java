package LinkedList.DoublyLinkedList.CustomImplementation;

public class Main {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertLast(40);
        list.insert(3,50);
        list.display();
    }
}
