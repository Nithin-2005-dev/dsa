package Recursion.Permutations;

import java.util.ArrayList;

public class Problem {
    public static void main(String[] args) {
        System.out.println( getPermutations("","abc"));
    }
    static ArrayList<String> getPermutations(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans=new ArrayList<>();
        for (int i = 0; i <=p.length(); i++) {
           ans.addAll(getPermutations(p.substring(0,i)+up.charAt(0)+p.substring(i),up.substring(1)));
        }
        return ans;
    }
}
