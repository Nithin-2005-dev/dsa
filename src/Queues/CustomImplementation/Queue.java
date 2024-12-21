package Queues.CustomImplementation;

public class Queue {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;
    int end=0;
    public Queue(int size){
        this.data=new int[size];
    }
    public Queue(){
        this(DEFAULT_SIZE);
    }
    protected boolean isFull() {
        return end==data.length;
    }
    protected boolean isEmpty() {
        return end==0;
    }
    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end++]=item;
        return true;
    }
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        int removed=data[0];
        for (int i = 1; i < end; i++) {
            data[i-1]=data[i];
        }
        end--;
        return removed;
    }
}
