package Trees.Implementation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree=new BinaryTree();
        Scanner scanner=new Scanner(System.in);
        tree.populate(scanner);
        tree.prettyDisplay(tree.root, 0);
    }
}
