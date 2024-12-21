package Queues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Theory {
    //it contains on push and pop methods
    //we can't remove or insert the elements in between
    //the one which is first inserted will be removed first and vice versa
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        queue.add(10);
        queue.add(40);
        queue.add(30);
        queue.add(20);
        System.out.println(queue);
        Deque<Integer> deque=new ArrayDeque<>();
        deque.add(10);
        deque.add(20);
        deque.addLast(100);
        System.out.println(deque);
    }
}
