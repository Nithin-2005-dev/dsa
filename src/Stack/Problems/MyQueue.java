package Stack.Problems;


import java.util.Stack;

public class MyQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    public MyQueue() {
        this.stack1=new Stack<>();
        this.stack2=new Stack<>();
    }

    public void push(int x) {
        stack1.push(x);
    }

    public int pop() {
        int size=stack1.size();
        for(int i=0;i<size;i++){
            stack2.push(stack1.pop());
        }
        int removed=stack2.pop();
        for (int i = 0; i < size-1; i++) {
            stack1.push(stack2.pop());
        }
        return removed;
    }

    public int peek() {
        int size=stack1.size();
        for(int i=0;i<size;i++){
            stack2.push(stack1.pop());
        }
        int removed=stack2.pop();
        stack2.push(removed);
        for (int i = 0; i < size; i++) {
            stack1.push(stack2.pop());
        }
        return removed;
    }

    public boolean empty() {
        return stack1.size()==0;
    }
}
