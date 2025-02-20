package Graphs.Implementation;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
/*
pros:
->good for spare graphs
->efficient for dynamic graphs
->easy to iterate through neighbours
 */
/*
cons:
->slow to check edges
->additional overhead for storage
->less intuitive for dense graphs
 */
public class AdjacencyList {
    private HashMap<Integer, List<Integer>> adjacencyList;
    public AdjacencyList(){
        this.adjacencyList=new HashMap<>();
    }
    public void addVertex(int vertex){
        adjacencyList.put(vertex,new LinkedList<>());
    }
    public void addEdge(int source,int destination){
        adjacencyList.get(source).add(destination);
        adjacencyList.get(destination).add(source);
    }
    public void removeEdge(int source,int destination){
        adjacencyList.get(source).remove((Integer) destination);
        adjacencyList.get(destination).remove((Integer) source);
    }
    public void removeVertices(int vertex){
        adjacencyList.remove(vertex);
        for (List<Integer> neighbours:adjacencyList.values()){
            neighbours.remove((Integer) vertex);
        }
    }
}
