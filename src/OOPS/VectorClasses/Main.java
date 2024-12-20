package OOPS.VectorClasses;

import java.util.List;
import java.util.Vector;

public class Main {
    //arraylist is not synchronized because multiple threads can access it.
    //linked list is synchronized so a single thread can access it at same time.
    public static void main(String[] args) {
        List<Integer> list=new Vector<>();
        list.add(45);
        list.add(40);
        list.add(95);
        list.add(55);
        System.out.println(list);
    }
}