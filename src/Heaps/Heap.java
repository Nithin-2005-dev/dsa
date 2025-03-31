package Heaps;

import java.util.ArrayList;

public class Heap<T extends Comparable<T>>{
    private ArrayList<T> list;
    public Heap(){
        list=new ArrayList<>();
    }
    private void swap(int first,int second){
        T temp=list.get(first);
        list.set(first,list.get(second));
        list.set(second,temp);
    }
    private int parent(int i){
        return (i-1)/2;
    }
    private int leftChild(int i){
        return 2*i+1;
    }
    private int rightChild(int i){
        return 2*i+2;
    }
    public void insert(T n){
        list.add(n);
        upHeap(list.size()-1);
    }
    public T remove(int i) throws Exception{
        if(i>=list.size()){
            throw new Exception("enter valid index");
        }
        T x=list.get(i);
        if (list.size() == 1) {
            list.removeFirst();
            return x;
        }
        list.set(i,list.removeLast());
        if (i > 0 && list.get(i).compareTo(list.get(parent(i))) < 0) {
            upHeap(i);
        } else {
            downHeap(i);
        }
        return x;
    }
    private void upHeap(int i){
        if(i==0){
            return;
        }
        int p=parent(i);
        if(list.get(p).compareTo(list.get(i))>0){
            swap(p,i);
            upHeap(p);
        }
    }

    private void downHeap(int i){
       int lc=leftChild(i);
       int rc=rightChild(i);
        int smallest = i;

        if (lc < list.size() && list.get(lc).compareTo(list.get(smallest)) < 0) {
            smallest = lc;
        }
        if (rc < list.size() && list.get(rc).compareTo(list.get(smallest)) < 0) {
            smallest = rc;
        }

        if (smallest != i) {
            swap(i, smallest);
            downHeap(smallest);
        }
    }
    public T getMin(){
        return list.getFirst();
    }
    public ArrayList<T> getHeap(){
        return list;
    }
    public ArrayList<T> sort() throws Exception {
        ArrayList<T> data=new ArrayList<>();
        while (!list.isEmpty()){
            data.add(remove(0));
        }
        int n=data.size();
        for (int i = 0; i < n; i++) {
            insert(data.get(i));
        }
        return data;
    }
}
