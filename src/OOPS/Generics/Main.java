package OOPS.Generics;

public class Main {
    public static void main(String[] args) {
        CustomArrayList<Integer> list=new CustomArrayList<>();
        list.add(10);
        System.out.println(list.get(0));
        System.out.println(list.size());
        list.add(20);
        list.add(30);
        System.out.println(list);
    }
}
