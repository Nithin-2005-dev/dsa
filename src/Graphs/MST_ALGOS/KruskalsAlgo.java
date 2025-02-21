package Graphs.MST_ALGOS;

import Graphs.Implementation.AdjacencyListWithWeights;

import java.util.*;

public class KruskalsAlgo {
    /*
    algo:
    ->add all the edges to the priority queue.
    ->start a queue and pop until the queue is empty.
        ->if the nodes of the edges are not visited.it is part of MST.
        ->add the associated nodes of the edge to the visited set.
        ->repeat the loop.
     */
    public List<AdjacencyListWithWeights.GraphEdge> krukalMST(AdjacencyListWithWeights graph){
        List<AdjacencyListWithWeights.GraphEdge>[] vertices=graph.getAdjacencyList();
        PriorityQueue<AdjacencyListWithWeights.GraphEdge> priorityQueue=new PriorityQueue<>(Comparator.comparingInt(AdjacencyListWithWeights.GraphEdge::getWeight));
        for (List<AdjacencyListWithWeights.GraphEdge> edges:vertices){
            priorityQueue.add((AdjacencyListWithWeights.GraphEdge) edges);
        }
        List<AdjacencyListWithWeights.GraphEdge> mstEdges=new ArrayList<>();
        HashSet<Integer> inMST=new HashSet<>();
        while (!priorityQueue.isEmpty()){
            AdjacencyListWithWeights.GraphEdge currentEdge=priorityQueue.poll();
            int source= currentEdge.getSource();
            int destination= currentEdge.getDestination();
            if (inMST.contains(source) && inMST.contains(destination)) continue;
            mstEdges.add(currentEdge);
            inMST.add(source);
            inMST.add(destination);
        }
        return mstEdges;
    }
}
