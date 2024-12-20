package OOPS.Generics;

import java.util.Arrays;

public class CustomArrayList<T> {
    private Object[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;
    public CustomArrayList(){
        this.data=new Object[DEFAULT_SIZE];
    }
    public void add(T num){
        if(this.isFull()){
            resize();
        }
        data[size++]=num;
    }

    private void resize() {
        Object[] temp=new Object[data.length*2];
        for (int i = 0; i < data.length; i++) {
            temp[i]=data[i];
        }
        data=temp;
    }
    public T remove(){
        T removed= (T) data[--size];
        return removed;
    }
    public T get(int index){
        return (T) data[index];
    }
    public int size(){
        return size;
    }
    public void set(int index,int value){
        data[index]=value;
    }
    private boolean isFull() {
        return size==data.length;
    }

    @Override
    public String toString() {
        StringBuilder list=new StringBuilder();
        list.append("[");
        for (int i = 0; i < size; i++) {
            if(i<size-1){
                list.append(data[i]).append(",");
            }else {
                list.append(data[i]);
            }
        }
        list.append("]");
        return list.toString();
    }
}
