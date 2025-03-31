package Heaps;

public class Main {
    public static void main(String[] args) throws Exception {
        Heap<Integer> heap=new Heap<>();
        heap.insert(30);
        heap.insert(54);
        heap.insert(10);
        heap.insert(3);
        System.out.println(heap.getMin());
        System.out.println(heap.getHeap());
        heap.remove(1);
        System.out.println(heap.getMin());
        System.out.println(heap.getHeap());
        System.out.println(heap.sort());
    }
}
