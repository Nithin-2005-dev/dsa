package Graphs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class DisjointSet {
    ArrayList<Integer> rank,parent,size;
    DisjointSet(int n){
        rank=new ArrayList<>(Collections.nCopies(n,0));
        size=new ArrayList<>(Collections.nCopies(n,1));
        parent=new ArrayList<>(Collections.nCopies(n,0));
        for (int i = 0; i <= n; i++) {
            parent.set(i,i);
        }
    }
    int findParent(int node){
        if(node==parent.get(node)) return node;
        int p=findParent(parent.get(node));
        parent.set(node,p);
        return p;
    }
    void unionByRank(int u,int v){
        int ulp_u=findParent(u);
        int ulp_v=findParent(v);
        if(ulp_u==ulp_v) return;
        if(rank.get(ulp_u)<rank.get(ulp_v)){
            parent.set(ulp_u,ulp_v);
        }else if(rank.get(ulp_u)>rank.get(ulp_v)){
            parent.set(ulp_v,ulp_u);
        }else{
            parent.set(ulp_v,ulp_u);
            rank.set(ulp_u,rank.get(ulp_u)+1);
        }
    }
    void unionBySize(int u,int v){
        int ulp_u = findParent(u);
        int ulp_v = findParent(v);
        if (ulp_u == ulp_v) return;
        if(size.get(ulp_u)<size.get(ulp_v)){
            parent.set(ulp_u,ulp_v);
            size.set(ulp_v,size.get(ulp_v)+size.get(ulp_u));
        }else{
            parent.set(ulp_v,ulp_u);
            size.set(ulp_u,size.get(ulp_v)+size.get(ulp_u));
        }
    }
}
