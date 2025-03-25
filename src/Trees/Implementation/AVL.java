package Trees.Implementation;

public class AVL {
    public static void main(String[] args) {
        AVL tree=new AVL();
        tree.populate(new int[]{1,2,3,4,5,6});
        tree.display();
    }
    private static class Node {
        int value;
        int height;
        Node right;
        Node left;

        public Node(int value) {
            this.height=0;
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
    private Node root;
    public AVL(){

    }
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
    private Node insert(int val, Node node){
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
        return rotate(node);
    }
    private Node rotate(Node node){
        if((height(node.left)-height(node.right))>1){
            //left heavy
            if(height(node.left.left)>=height(node.left.right)) {
                //left left case
                return rightRotate(node);
            }else{
                //left right case
                node.left=leftRotate(node.left);
                return rightRotate(node);
            }
        }
        if((height(node.left)-height(node.right))<-1){
            //right heavy
            if(height(node.right.left)<=height(node.right.right)){
                //right right case
                return leftRotate(node);
            }else{
                //right left case
                node.right=rightRotate(node.right);
                return leftRotate(node);
            }
        }
        return node;
    }
    private Node rightRotate(Node p){
        Node c=p.left;
        Node t2=c.right;
        c.right=p;
            p.left=t2;
        c.height = Math.max(height(c.left), height(c.right)) + 1;
        p.height = Math.max(height(p.left), height(p.right)) + 1;
        return c;
    }
    private Node leftRotate(Node c){
        Node p=c.right;
        Node t2=p.left;
        p.left=c;
        c.right=t2;
        c.height = Math.max(height(c.left), height(c.right)) + 1;
        p.height = Math.max(height(p.left), height(p.right)) + 1;
        return p;
    }
    public void display(Node node, String details){
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
