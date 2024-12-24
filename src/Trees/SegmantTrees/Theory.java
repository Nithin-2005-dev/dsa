package Trees.SegmantTrees;

public class Theory {
    /*
    a=[1,3,5,5,6,6,5,4,3];
    ->to find sum of numbers in array time complexity is O(n)
    ->O(n) not good enough,find O(log(n)) solution
    ->segment trees can solve this problem
     */
    /*
    segment->perform query on a range
    ->segment tree is a binary tree which has internal info of operation
    ->segment tree is full binary tree
    ->leaf nodes=n
    ->internal nodes=n-1
    ->total nodes=2n-1
     */
    /*
    cases:
    1)node interval is inside the query interval->return the value
    2)node interval is completely outside query interval->return default value of query
    3)node interval is overlapping with query interval->return the necessary nodes
     */
    /*
    how to update in O(log(n)) time:
    1)check index lies in interval
    2)if yes,then check child nodes ,if child range is out , no change in value ,just return
    3)in the end you will reach leaf,update the leaf and recursion will update the tree
     */
}
