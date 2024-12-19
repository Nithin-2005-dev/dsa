package OOPS.AccessControls;

public class A {
    private int num;
    String name;
    int[] arr;

    public int getNum() {
        return num;
    }

    public A(int num, String name, int[] arr) {
        this.num = num;
        this.name = name;
        this.arr = arr;
    }
    public A(int num, String name) {
        this.num = num;
        this.name = name;
    }
}
