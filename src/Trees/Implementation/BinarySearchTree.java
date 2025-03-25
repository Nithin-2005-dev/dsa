package Trees.Implementation;

public class BinarySearchTree {
    static class Node {
        int value;
        int height;
        Node right;
        Node left;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
    private Node root;
    public int height(Node node){
        if(node==null){
            return -1;
        }
        return node.height;
    }
    public boolean isEmpty(){
        return root==null;
    }
    public void display(){
        display(root,"Root Node: ");
    }
    public void insert(int val){
        root=insert(val,root);
    }
    private Node insert(int val,Node node){
        if(node==null){
            Node newNode=new Node(val);
            return newNode;
        }
        if(val<node.value){
            node.left=insert(val,node.left);
        }
        if(val>node.value){
            node.right=insert(val,node.right);
        }
        node.height=Math.max(height(node.left),height(node.right))+1;
        return node;
    }
    public void display(Node node,String details){
        if(node==null){
            return;
        }
        System.out.println(details+node.getValue());
        display(node.left,"Left child of "+node.getValue()+": ");
        display(node.right,"Right child of "+node.getValue()+": ");
    }
    public void populate(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            insert(nums[i]);
        }
    }
    public boolean balanced(){
        return balanced(root);
    }
    private boolean balanced(Node node){
        if (node==null){
            return true;
        }
        return Math.abs(height(node.left)-height(node.right))<=1 && balanced(node.left) && balanced(node.right);
    }
}
