package Trees.Implementation;

public class SegmentTree {
    public static void main(String[] args) {
        SegmentTree tree=new SegmentTree(new int[]{1,2,6,2,8,4,-9,8});
//        tree.display(tree.root);
        System.out.println(tree.query(5,7));
        tree.update(10,6);
        System.out.println(tree.query(5,7));
    }
   private class Node{
        int data;
        int start;
        int end;
        Node right;
        Node left;
       public Node(int start,int end){
           this.start=start;
           this.end=end;
       }
    }
    private Node root;
    public SegmentTree(int[] arr){
        this.root=constructTree(arr,0,arr.length-1);
    }

    private Node constructTree(int[] arr, int s, int e) {
        if(s==e) {
            Node leaf = new Node(s, e);
            leaf.data = arr[s];
            return leaf;
        }
        Node node=new Node(s,e);
        int mid=(s+e)/2;
        node.left=constructTree(arr,s,mid);
        node.right=constructTree(arr,mid+1,e);
        node.data = (node.left != null ? node.left.data : 0) + node.right.data;
        return node;
    }
    private void display(Node node){
        if(node==null){
            return;
        }
        String str="";
        if (node.left!=null){
            str=str+"Interval=["+node.left.start+"-"+node.left.end+"] and data:"+node.left.data+"->";
        }else{
            str=str+"No left child";
        }
        str=str+"Interval=["+node.start+"-"+node.end+"] and data:"+node.data+"->";
        if (node.right!=null){
            str=str+"Interval=["+node.right.start+"-"+node.right.end+"] and data:"+node.right.data+"->";
        }else{
            str=str+"No right child";
        }
        System.out.println(str);
        display(node.left);
        display(node.right);
    }
    public int query(int s,int e){
        return this.query(root,s,e);
    }
    private int query(Node node,int s,int e){
        if(node==null || node.start>e || node.end<s){
            return 0;
        }
        if(node.start>=s && node.end<=e){
            return node.data;
        }
        return query(node.left,s,e)+query(node.right,s,e);
    }
    public int update(int n,int i){
        return update(root,n,i);
    }
    private int update(Node node,int n,int i){
        if(i>= node.start && i<=node.end){
            if(i==node.start && i==node.end){
                node.data=n;
                return node.data;
            }else{
                node.data=update(node.left,n,i)+update(node.right,n,i);
                return node.data;
            }
        }else{
            return node.data;
        }
    }
}
