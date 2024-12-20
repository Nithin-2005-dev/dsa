package LinkedList.CircularLinkedList.CustomImplementation;

public class Main {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(40);
        list.insert(60);
        list.insert(30);
        list.delete(40);
        list.display();
    }
}
