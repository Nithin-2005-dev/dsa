package Stack.CustomImplementation;

public class Stack {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;
    private int ptr=-1;
    public Stack(int size){
        this.data=new int[size];
    }
    public Stack(){
        this(DEFAULT_SIZE);
    }
    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full!!");
            return false;
        }
        ptr++;
        data[ptr]=item;
        return true;
    }
    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("cannot pop from empty stack!");
        }
        int removed=data[ptr];
        ptr--;
        return removed;
    }
    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("cannot peek from empty stack!");
        }
        return data[ptr];
    }
    protected boolean isFull() {
        return ptr==data.length-1;
    }
    protected boolean isEmpty() {
        return ptr==-1;
    }
}
