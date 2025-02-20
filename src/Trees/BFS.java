package Trees;

import Trees.Implementation.BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS {

    public static void main(String[] args) {
        BinaryTree tree=new BinaryTree();
        Scanner in=new Scanner(System.in);
        tree.populate(in);
        ArrayList<Integer> list=new ArrayList<>();
        bfs(list,tree.root);
        System.out.println(list);
    }
    public static void bfs(ArrayList<Integer> list, BinaryTree.Node node){
        Queue<BinaryTree.Node> queue=new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()){
            node=queue.remove();
            if(node!=null){
            list.add(node.value);
            queue.add(node.left);
            queue.add(node.right);
            }
        }
    }
}
