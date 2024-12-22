package Trees.BinarySearchTree;

import Trees.CustomImplementation.Tree;
public class Main {
    public static void main(String[] args) {
        BST tree=new BST();
        tree.populateSorted(new int[]{1,2,3,4,5,6,7,8,9});
        tree.preDisplay();
        tree.preOrder();
    }
}
