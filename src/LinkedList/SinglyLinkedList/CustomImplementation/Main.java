package LinkedList.SinglyLinkedList.CustomImplementation;

public class Main {
    public static void main(String[] args) {
        LinkedList list =new LinkedList();
        list.insertLast(40);
        list.insertFirst(10);
        list.insertFirst(14);
        list.insertFirst(12);
        list.insert(3,33);
        list.deleteFirst();
        System.out.println(list.deleteLast());
        System.out.println(list.delete(1));
        list.insert(1,100);
        list.insert(1,10);
        list.display();
        System.out.println(list.find(500));
    }
}
