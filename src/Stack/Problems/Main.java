package Stack.Problems;

public class Main {
    public static void main(String[] args) {
        MyQueue queue=new MyQueue();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        System.out.println(queue.pop());
        queue.push(5);
        System.out.println(queue.pop());
    }
}
