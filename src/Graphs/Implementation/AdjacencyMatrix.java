package Graphs.Implementation;

import java.util.ArrayList;
/*
pros:
->simple structure
->efficient for dense graphs
->quick edge queries
 */
/*
cons:
->space complexity: o(n^2)
->expensive operations,not suitable for dynamic graphs
->memory expensive
 */
public class AdjacencyMatrix {
    private int[][] adjMatrix;
    private int numVertices;
    public AdjacencyMatrix(int numVertices){
        this.numVertices=numVertices;
        this.adjMatrix=new int[numVertices][numVertices];
    }
    public void addEdge(int i,int j){
        adjMatrix[i][j]=1;
        adjMatrix[j][i]=1;
    }
    public void removeEdge(int i,int j){
        adjMatrix[i][j]=0;
        adjMatrix[j][i]=0;
    }
    public void addVertix(){
        int[][] newMat=new int[numVertices+1][numVertices+1];
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                newMat[i][j]=adjMatrix[i][j];
            }
        }
        adjMatrix=newMat;
        numVertices++;
    }
    public void removeVertix(int v){
        int[][] newMat=new int[numVertices-1][numVertices-1];
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                if(i!=v && j!=v) {
                    newMat[i][j] = adjMatrix[i][j];
                }
            }
        }
        adjMatrix=newMat;
        numVertices--;
    }
}
