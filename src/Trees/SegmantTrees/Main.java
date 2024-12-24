package Trees.SegmantTrees;

public class Main {
    public static void main(String[] args) {
        int[] arr={3,4,9,2,7};
        SegmentTree tree=new SegmentTree(arr);
        tree.display();
        tree.update(1,10);
        System.out.println(tree.query(0,1));
    }
}
