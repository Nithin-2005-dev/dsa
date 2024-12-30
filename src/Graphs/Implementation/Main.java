package Graphs.Implementation;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Edge>[] graph=new ArrayList[7];
        createGraph(graph);
        System.out.println(Arrays.toString(graph));
        boolean[] visited=new boolean[graph.length];
//        for (int i = 0; i < graph.length; i++) {
//            if(!visited[i]){
//                BFS(graph,visited,i);
//            }
//        }
        DFS(graph,0,visited);
    }
    public static void createGraph(ArrayList<Edge>[] graph){
        for (int i=0;i< graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,1));
        graph[1].add(new Edge(1,0,4));
        graph[1].add(new Edge(1,3,5));
        graph[2].add(new Edge(2,0,3));
        graph[2].add(new Edge(2,4,2));
        graph[3].add(new Edge(1,1,1));
        graph[3].add(new Edge(1,4,5));
        graph[3].add(new Edge(1,5,5));
        graph[4].add(new Edge(4,2,5));
        graph[4].add(new Edge(4,3,5));
        graph[4].add(new Edge(4,5,5));
        graph[5].add(new Edge(5,3,5));
        graph[5].add(new Edge(5,5,5));
        graph[5].add(new Edge(5,6,5));
        graph[6].add(new Edge(6,5,5));

    }
    public static void BFS(ArrayList<Edge>[] graph,boolean[] visited,int start){
        Queue<Integer> queue=new LinkedList<>();
        queue.add(start);
        while (!queue.isEmpty()){
            int current= queue.remove();
            if(!visited[current]){
                System.out.println(current+" ");
                visited[current]=true;
                for (int i = 0; i < graph[current].size(); i++) {
                    Edge e=graph[current].get(i);
                    queue.add(e.destination);
                }
            }
        }
    }
    public static void DFS(ArrayList<Edge>[] graph,int current,boolean[] visited){
        System.out.print(current+" ");
        visited[current]=true;
        for (int i = 0; i < graph[current].size(); i++) {
            Edge e=graph[current].get(i);
            if(!visited[e.destination]) {
                DFS(graph, e.destination, visited);
            }
        }
    }
}
