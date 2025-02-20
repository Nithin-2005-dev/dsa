package Trees.Implementation;

import java.util.Scanner;

public class BinaryTree {
    public Node root;
    public class Node{
        public int value;
        public Node left;
        public Node right;

        public Node(int value) {
            this.value = value;
        }
    }
    public void populate(Scanner scanner){
        System.out.print("Enter the root node:");
        int value=scanner.nextInt();
        root=new Node(value);
        populate(scanner,root);
    }
    public void populate(Scanner scanner,Node node){
        System.out.print("Do you want to enter left of "+node.value+":");
        boolean left=scanner.nextBoolean();
        if(left){
            System.out.print("Enter the value of left of "+node.value+":");
            int value=scanner.nextInt();
            node.left=new Node(value);
            populate(scanner,node.left);
        }
        System.out.print("Do you want to enter right of "+node.value+":");
        boolean right=scanner.nextBoolean();
        if(right){
            System.out.print("Enter the value of right of "+node.value+":");
            int value=scanner.nextInt();
            node.right=new Node(value);
            populate(scanner,node.right);
        }
    }
    public void display(Node node,String indent){
        if(node==null){
            return;
        }
        System.out.println(indent+node.value);
        display(node.left,indent+"  ");
        display(node.right,indent+"\t");
    }
    public void prettyDisplay(Node node,int level){
        if(node==null){
            return;
        }
        prettyDisplay(node.right,level+1);
        if(level!=0){
            for (int i = 0; i < level-1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|----->"+node.value);
        }else {
            System.out.println(node.value);
        }
        prettyDisplay(node.left,level+1);
    }
}
