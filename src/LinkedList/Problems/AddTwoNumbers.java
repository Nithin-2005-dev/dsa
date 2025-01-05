package LinkedList.Problems;
import LinkedList.SinglyLinkedList.CustomImplementation.LinkedList;
import LinkedList.SinglyLinkedList.CustomImplementation.LinkedList.*;
public class AddTwoNumbers {
    public static void main(String[] args) {
        LinkedList l1=new LinkedList();
        LinkedList l2=new LinkedList();
        l1.insertFirst(9);
        l1.insertFirst(9);
        l1.insertFirst(9);
        l1.insertFirst(9);
        l1.insertFirst(9);
        l1.insertFirst(9);
        l1.insertFirst(9);
        l2.insertFirst(9);
        l2.insertFirst(9);
        l2.insertFirst(9);
        l2.insertFirst(9);
        Node head=(addTwoNumbers(l1.head,l2.head));
        while(head!=null){
            System.out.print(head.value+"->");
            head=head.next;
        }
    }
    public static Node addTwoNumbers(Node l1, Node l2) {
        int remain=0;
        Node root=new Node();
        Node head=root;
        int r=0;
        while(l1!=null && l2!=null){
            int sum=l1.value+l2.value+remain;
            r=sum%10;
            remain=sum/10;
            root.value=r;
            if(l1.next!=null || l2.next!=null) {
                root.next = new Node();
                root = root.next;
            }
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null){

            int sum=l1.value+remain;
            r=sum%10;
            remain=sum/10;
            root.value=r;
            if(l1.next!=null) {
                root.next = new Node();
                root = root.next;
            }
            l1=l1.next;
        }
        while(l2!=null){
            int sum=l2.value+remain;
            r=sum%10;
            remain=sum/10;
            root.value=r;
            if(l2.next!=null) {
                root.next = new Node();
                root = root.next;
            }
            l2=l2.next;
        }
        if(remain!=0){
            while(remain!=0){
                r=remain%10;
                root.next = new Node(r);
                root = root.next;
                remain=remain/10;
            }
        }
        return head;
    }
}
