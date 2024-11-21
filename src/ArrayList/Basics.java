package ArrayList;

import java.util.ArrayList;

public class Basics {
    public static void main(String[] args) {
        //syntax
        ArrayList<Integer> list=new ArrayList<>(10);
        list.add(67);
        list.add(7);
        list.add(68);
        System.out.println(list);
        System.out.println(list.contains(67));
        list.set(0,99);
        System.out.println(list);
        System.out.println(list.contains(67));
        //Internal working of ArrayList
        /*
        1.size is fixed internally
        2.let's say arraylist fills by some amount
        -->it will create the new arraylist with size more than the current list
        -->old elements are copied in new one
        -->old one is deleted
         */
    }
}
