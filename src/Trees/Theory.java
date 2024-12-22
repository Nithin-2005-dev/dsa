package Trees;
public class Theory {
    /*
    why?
    ->you can do operations like inserting and deleting in O(log(n))
    ->ordered storage
    ->cost-efficient
     */
    /*
    limitation:
    ->unbalanced binary tree
    how to solve?
    ->self balanced binary tree
     */
    /*
    where is it used?
    1)file systems
    2)databases
    3)algorithms in networking
    4)maths
    5)decision trees->machine learning
    6)compressions of files
    7)future data structures
     */
    /*
    properties:
    1)size=total number of nodes
    2)child->nodes of parent and parent->node from which it is originated
    3)siblings->nodes which are in same level
    4)edge:line that is connecting to parent and child
    5)height->maximum number of edges of node from leaf nodes
    6)leaf nodes:bottom most nodes
    7)level=the difference of height from that node and height of root node
    8)ancestor->nodes which are higher level than the given node
    9)descendant:below nodes of ancestors
     */
    /*
    types of binary trees:
    1)complete binary tree:
    ->all the levels are filled apart from last level but the levels are filled from left to right
    2)full binary tree/strict binary tree:
    ->every node should contain either 0 children or 2 children
    ->use case:compression/segment trees
    3)perfect binary tree:
    ->all internal nodes should contain 2 children
    ->all the leaf nodes are in same level
    4)height balanced binary tree:
    ->average height O(log(n))
    5)skewed binary tree:
    ->every node has single child
    6)ordered binary tree:
    ->every node has some property
     ->eg:binary search tree
     */
    /*
    properties that helps in solving questions:
    1)for perfect binary tree:
     ->height=h total nodes=2^(h+1)-1
     ->total leaf nodes=2^h-1
     2)for strict binary tree:
     ->no.of leaf nodes=no.of internal nodes+1
     3)no.of leaf nodes=1+no.of internal nodes with 2 children
     */
    /*
    ways to implement:
    1)linked representation
    2)sequential->using array
     */
    /*
    traversal methods:
    1)pre-order:
    N->L->R
    ->used fro evaluating math expressions or making a copy
    ->in serialisation also it helps
    2)in-order:
    L->N->R
    ->in BST,visit node in sorted manner
    3)post-order:
    L->R->N
    ->delete from binary tree
    ->bottom-up calculation
     */
    /*
    BFS & DFS (or) BFT & DFT
     */
}
