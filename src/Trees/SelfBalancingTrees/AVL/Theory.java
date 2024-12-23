package Trees.SelfBalancingTrees.AVL;

public class Theory {
    //it is self-balancing binary tree
    //AVL->adelson-velskii and landis
    /*
    Algorithm:
    1)insert normally node n
    2)start from node n and find the node that makes the tree unbalanced
    3)using one of the 4 rules ,rotate.
    ->https://www.youtube.com/watch?v=CVA85JuJEn0&list=PPSV at 20 minutes
    i)if child and grand child are at left then do right rotate(p)
    ii)for left-right case do left rotate(c) and then apply case i
    iii)for right-right case do left rotate(p)
    iV)for right-left case do right rotate(c) and apply  case iii
     */
    /*
    time complexity:
   ->O(log(n))+O(n)->for rotation
    =O(log(n))
     */
}