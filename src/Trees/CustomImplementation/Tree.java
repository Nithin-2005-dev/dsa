package Trees.CustomImplementation;

import java.util.Scanner;

public class Tree {
    private static class Node{
       private int value;
       private Node right;
       private Node left;
       public Node(int val){
           this.value=val;
       }
    }
    private Node root;
    //insert elements
    public void populate(Scanner scanner){
        System.out.println("enter the root node:");
        int val=scanner.nextInt();
        root=new Node(val);
        populate(scanner,root);
    }
    private void populate(Scanner scanner,Node node){
        System.out.print("Do you want to enter left of "+node.value+":");
        boolean left=scanner.nextBoolean();
        if(left){
            System.out.print("enter the value of left of "+node.value+":");
            int value=scanner.nextInt();
            node.left=new Node(value);
            populate(scanner,node.left);
        }
        System.out.print("Do you want to enter right of "+node.value+":");
        boolean right=scanner.nextBoolean();
        if(right){
            System.out.print("enter the value of right of "+node.value+":");
            int val=scanner.nextInt();
            node.right=new Node(val);
            populate(scanner,node.right);
        }
    }
    public void display(){
        display(root,0);
    }
    private void display(Node node,int level){
        if(node==null){
            return;
        }
        display(node.right,level+1);
        if(level!=0){
            for (int i = 0; i < level-1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|----->"+node.value);
        }else {
            System.out.println(node.value);
        }
        display(node.left,level+1);
    }
    private void display(Node node,String indent){
        if(node==null){
            return;
        }
        System.out.println(indent+node.value);
        display(node.left,indent+"\t");
        display(node.right,indent+"\t");
    }
}
