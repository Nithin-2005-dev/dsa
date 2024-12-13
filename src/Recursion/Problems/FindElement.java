package Recursion.Problems;

import arrays.Input.InputAnIntArray;

import java.util.ArrayList;
import java.util.List;

public class FindElement {
    public static void main(String[] args) {
        int[] arr= InputAnIntArray.ArrayInput();
//        System.out.println(find(arr,10,0));
        System.out.println(findMultiple2(arr,10,0));
    }
    static List<Integer> findMultiple2(int[] arr,int t,int i){
        if(i==arr.length-1){
            List<Integer> list=new ArrayList<>();
            return list;
        }
        List<Integer> list=findMultiple2(arr,t,++i);
        if (arr[i]==t){
            list.add(i);
        }
        return list;
    }
    static List<Integer> findMultiple(int[] arr,List<Integer> list,int t,int i){
        if(i==arr.length){
            return list;
        }
        if (arr[i]==t){
            list.add(i);
        }
        return findMultiple(arr,list,t,++i);
    }
    static int find(int[] arr,int t,int i){
        if(i>=arr.length){
            return -1;
        }
        if(arr[i]==t){
            return i;
        }else {
            return find(arr,t,++i);
        }
    }
}
