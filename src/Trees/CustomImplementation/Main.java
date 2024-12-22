package Trees.CustomImplementation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tree tree=new Tree();
        Scanner scanner=new Scanner(System.in);
        tree.populate(scanner);
        tree.display();
    }
}
