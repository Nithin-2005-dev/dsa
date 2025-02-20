package Graphs.Traversals;

import Graphs.Implementation.AdjacencyList;

import java.util.*;

public class BFS {
    public static void main(String[] args) {
        AdjacencyList graph=new AdjacencyList();
        HashSet<Integer> set=new HashSet<>();
        Queue<Integer> queue=new LinkedList<>();
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
        queue.add(10);
        bfs(set,queue,graph.adjacencyList);
//        System.out.println(set);
    }
    public static void bfs(HashSet<Integer> set, Queue<Integer> queue, HashMap<Integer, List<Integer>> map) {
        while (!queue.isEmpty()) {
            int vertex = queue.remove();
            if (!set.contains(vertex)) {
                set.add(vertex);
                System.out.print(vertex + " ");
                for (int i = 0; i < map.get(vertex).size(); i++) {
                    if (!set.contains(map.get(vertex).get(i))) {
                        queue.add(map.get(vertex).get(i));
                    }
                }
            }
        }
    }
}
