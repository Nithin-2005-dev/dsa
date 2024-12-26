package Trees.ProblemSolving;
import Trees.SelfBalancingTrees.AVL.*;

import java.util.*;

public class BfsAndDfs {
    /*
    BFS:
    ->breadth first search
    ->traversal in each level horizontally.

    when to use:-
    1)when answer lies near the root node.
    2)when you are asked to search by level.
     */
    public static void main(String[] args) {
        AVL tree = new AVL();
        tree.populate(new int[]{3,9,20,15,7});
        tree.preDisplay();
        Queue<AVL.Node> nodes = new LinkedList<>();
        nodes.add(tree.root);
//        BFS(nodes, tree.root);
//        System.out.println("END");
        System.out.println(zigzagLevelOrder(tree.root));
    }

    public static void BFS(Queue<AVL.Node> nodes, AVL.Node node) {
        if (nodes.isEmpty()) {
            return;
        }

            System.out.print(nodes.remove().getValue() + "->");
            if(node.left!=null){
                nodes.add(node.left);
            }
            if(node.right!=null){
                nodes.add(node.right);
            }
            BFS(nodes, nodes.peek());
    }
    public static List<List<Integer>> zigzagLevelOrder(AVL.Node root) {
        List<List<Integer>> result=new ArrayList<>();
        Deque<AVL.Node> queue=new LinkedList<>();
        if(root==null){
            return result;
        }
        queue.add(root);
        int j=1;
        while(!queue.isEmpty()){
            List<Integer> list=new ArrayList<>();
            int size=queue.size();
            if(j%2!=0){
                for(int i=0;i<size;i++){
                    AVL.Node n=queue.removeFirst();
                    if(n.left!=null){
                        queue.addLast(n.left);
                    }
                    if(n.right!=null){
                        queue.addLast(n.right);
                    }
                    list.add(n.value);
                }
            }else{
                for(int i=0;i<size;i++){
                    AVL.Node n=queue.removeLast();
                    if(n.right!=null){
                        queue.addFirst(n.right);
                    }
                    if(n.left!=null){
                        queue.addFirst(n.left);
                    }
                    list.add(n.value);
                }
            }
            result.add(list);
            j++;
        }
        return result;
    }
}