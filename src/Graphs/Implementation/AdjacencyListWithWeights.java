package Graphs.Implementation;

import java.util.ArrayList;
import java.util.List;

public class AdjacencyListWithWeights {
    public static class GraphEdge{
        private final int source;
        private final int destination;
        private final int weight;
        public GraphEdge(int source, int destination, int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }

        public int getSource() {
            return source;
        }

        public int getDestination() {
            return destination;
        }

        public int getWeight() {
            return weight;
        }
    }
    private int vertices;

    public int getVertices() {
        return vertices;
    }

    public ArrayList[] getAdjacencyList() {
        return adjacencyList;
    }

    private ArrayList[] adjacencyList;
    public AdjacencyListWithWeights(int vertices){
        this.vertices=vertices;
        adjacencyList=new ArrayList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjacencyList[i]=new ArrayList<>();
        }
    }
    public void addDirectedEdge(int source,int destination,int weight){
        GraphEdge edge=new GraphEdge(source, destination, weight);
        adjacencyList[source].add(edge);
    }
    public void addUnDirectedEdge(int source,int destination,int weight){
        GraphEdge std=new GraphEdge(source, destination, weight);
        GraphEdge dts=new GraphEdge(destination, source, weight);
        adjacencyList[source].add(std);
        adjacencyList[destination].add(dts);
    }
}
