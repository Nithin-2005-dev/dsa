//package Graphs;
//
//import Graphs.Implementation.AdjacencyListWithWeights;
//
//import java.util.Arrays;
//import java.util.Comparator;
//import java.util.PriorityQueue;
//
//public class DijkstraAlgo {
//    /*
//     algo:
//     ->start from the source node.
//     ->assume all distances to be unreachable(INFINITY).
//     ->add edges of source node to priority queue.
//     ->run a loop till queue is empty.
//        ->pop an edge
//        ->if possible update the distance of destination with lower value
//        ->insert edges of destination to queue
//     */
//    public static void main(String[] args) {
//
//    }
//    public static int[] dijkstraShortestPath(AdjacencyListWithWeights graph,int source){
//        int[] distance=new int[graph.getAdjacencyList().length];
//        Arrays.fill(distance,Integer.MAX_VALUE);
//        PriorityQueue<AdjacencyListWithWeights.GraphEdge> priorityQueue=new PriorityQueue<>(Comparator.comparingInt(AdjacencyListWithWeights.GraphEdge::getWeight));
//        distance[source]=0;
//        priorityQueue.add(new AdjacencyListWithWeights.GraphEdge(source,source,0));
//        while (!priorityQueue.isEmpty()){
//            AdjacencyListWithWeights.GraphEdge currEdge=priorityQueue.poll();
//            int destination= currEdge.getDestination();
//            for (AdjacencyListWithWeights.GraphEdge edge:graph.getAdjacencyList()[destination]){
//                int newDistance=distance[destination]*edge.getWeight();
//                if(newDistance<distance[edge.getDestination()]){
//                    distance[edge.getDestination()]=newDistance;
//                    priorityQueue.add(new AdjacencyListWithWeights.GraphEdge(edge.getSource(), edge.getDestination(), newDistance));
//                }
//            }
//        }
//
//        return distance;
//    }
//}
