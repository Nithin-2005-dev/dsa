package Graphs.Traversals;

import Graphs.Implementation.AdjacencyList;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;

public class DFS {
    /*
    algo:
    ->start with any vertex, and mark it as visited
    ->find all neighbours of the node being visited
    ->put all the unvisited neighbours from above step int the stack
    ->pop top node from stack to continue with step 2
    IMP:if we pop and the node has already been visited,just ignore that node and continue with next pop
     */
    public static void main(String[] args) {
        AdjacencyList graph=new AdjacencyList();
        HashSet<Integer> set=new HashSet<>();
        Stack<Integer> stack=new Stack<>();
        graph.addVertex(10);
        graph.addVertex(20);
        graph.addVertex(30);
        graph.addVertex(40);
        graph.addVertex(50);
        graph.addEdge(10,20);
        graph.addEdge(10,30);
        graph.addEdge(20,10);
        graph.addEdge(20,40);
        graph.addEdge(20,50);
        graph.addEdge(30,10);
        graph.addEdge(30,40);
        graph.addEdge(40,20);
        graph.addEdge(40,30);
        graph.addEdge(40,50);
        graph.addEdge(50,20);
        graph.addEdge(50,40);
        stack.add(10);
//        dfs(set,stack,graph.adjacencyList);
        dfsRec(set,10,graph.adjacencyList);
//        System.out.println(set);
    }
    public static void dfs(HashSet<Integer> set, Stack<Integer> stack, HashMap<Integer, List<Integer>> map){
        while (!stack.isEmpty()){
            int vertex=stack.pop();
            if(!set.contains(vertex)){
                set.add(vertex);
                System.out.print(vertex+" ");
                for (int i = 0; i < map.get(vertex).size(); i++) {
                    if(!set.contains(map.get(vertex).get(i))){
                        stack.push(map.get(vertex).get(i));
                    }
                }
            }
        }
    }
    public static void dfsRec(HashSet<Integer> set,int vertex,HashMap<Integer, List<Integer>> map){
            set.add(vertex);
        System.out.print(vertex+" ");
        for (int i = 0; i < map.get(vertex).size(); i++) {
            if(!set.contains(map.get(vertex).get(i))){
                dfsRec(set,map.get(vertex).get(i),map);
            }
        }
    }
}
