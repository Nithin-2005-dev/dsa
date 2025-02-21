package Graphs.MST_ALGOS;

import Graphs.Implementation.AdjacencyListWithWeights;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class PrimsAlog {
    /*
    algo:
    ->start with any vertex
    ->add the vertex to visited set,and it's edges to priority queue
    ->start loop until queue is empty
        ->pop an edge
        ->check vertices of the edge. if both are visited,add edge to MST.
        ->add new edges to priority queue and mark node as visited
        ->repeat the loop
        IMP:if both nodes of edge are visited,ignore and continue
     */
    public List<AdjacencyListWithWeights.GraphEdge> primMST(AdjacencyListWithWeights graph){
        List<AdjacencyListWithWeights.GraphEdge>[] vertices=graph.getAdjacencyList();
        boolean[] inMST=new boolean[vertices.length];
        PriorityQueue<AdjacencyListWithWeights.GraphEdge> priorityQueue=new PriorityQueue<>(Comparator.comparingInt(AdjacencyListWithWeights.GraphEdge::getWeight));
        List<AdjacencyListWithWeights.GraphEdge> mstEdges=new ArrayList<>();
        int startVertex=0;
        inMST[startVertex]=true;
        priorityQueue.addAll(vertices[startVertex]);
        while (!priorityQueue.isEmpty()){
            AdjacencyListWithWeights.GraphEdge currentEdge=priorityQueue.poll();
            int destination=currentEdge.getDestination();
            if(inMST[destination]){
                continue;
            }
            mstEdges.add(currentEdge);
            inMST[destination]=true;
            priorityQueue.addAll(vertices[destination]);
        }
        return mstEdges;
    }
}
