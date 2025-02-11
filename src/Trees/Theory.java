package Trees;

public class Theory {
    /*
    why?
    ->the time complexity of inserting,deleting is O(logn)
    ->ordered storage
     */
    /*
    where is it used?
    ->file systems
    ->databases
    ->algorithms/networking
    ->maths
    ->dts->ml
    ->compression of files
    ->future data structures
     */
    /*
    properties:
    1)size=total number of nodes
    2)edge=the line joining two nodes
    3)height=max number of lines between node and leaf node
    4)leaf nodes=lower most nodes
    5)level=height of root-height of node
     */
    /*
    types of binary tree:
    1)complete binary tree
    ->all the levels are fill
    ->last level should fill from left to right
    2)full binary tree:
    ->each node has either 0 children or two children
    ->use in compression
    3)perfect binary tree:
    ->all levers are full
    ->leaf nodes are on same level
    4)height balanced binary tree:
    ->average height o(logn)
    5)skewed binary tree:
    ->every node has 1 child
    ->average height is o(n)
    6)ordered binary tree:
    ->every node has some property
     */
    /*
    properties that will help in some questions:
    1)perfect binary tree,height=h
    total nodes=2^(n+1)-1
    total leaf nodes=2^h
    n=number of leaves
    log(n+1) levels at least
    2)strict binary tree, n->leaf nodes
    n-1->internal nodes
     */
}
