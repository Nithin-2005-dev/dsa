package Graphs;

public class Theory {
    /*
    ->graphs are the network of nodes
    ->nodes are called as vertex
    ->connections are called as edges

    storing of graph:
    1)Adjacency list
    2)Adjacency matrix
    3)Edge list
    4)2D matrix(Implicit graph)


    Applications:
    1)maps
    2)social network
    2)delivery network
     */
    /*
  i)adjacency list(list of lists):
    0->{0(source),2(destination)}
    1->{1,2},{1,3}
    2->{2,0},{2,1},{2,3}
    3->{3,1},{3,2}

    implementation:
    ArrayList<Edge>[V] graph
    static class Edge{
        int source;
        int destination;
    }
  ii)Adjacency matrix
  ->represented in 2d matrix
  ->size is V*V
  ->edges are stored in specified index and puts weight in it

 iii)Edge list:
  ->source and destination is stored in list
     */
    /*
    graph traversals:
    1)BFS
    2)DFS

    BFS:
    ->go to immediate neighbours first.
    ->it is indirect level order traversal
    ->it contains one visited array and queue

    DFS:
    ->keep going to the first neighbour
     */
}
