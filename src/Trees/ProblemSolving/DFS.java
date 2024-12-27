package Trees.ProblemSolving;

import Trees.SelfBalancingTrees.AVL.AVL;

import java.util.LinkedList;
import java.util.Queue;

public class DFS {
    public static void main(String[] args) {
        AVL tree = new AVL();
        tree.populate(new int[]{3,9,20,15,7});
        tree.preDisplay();
//        Queue<AVL.Node> nodes = new LinkedList<>();
//        nodes.add(tree.root);
        System.out.println(diameter(tree.root,0,0));
    }
    static int diameter(AVL.Node node,int level,int max){
        if(node==null){
            return max;
        }
        if(level>max){
            max=level;
        }
        diameter(node.left,level+1,max);
        diameter(node.right,level+1,max);
        return max;
    }
}
