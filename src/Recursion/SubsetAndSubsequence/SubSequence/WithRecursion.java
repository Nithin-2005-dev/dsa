package Recursion.SubsetAndSubsequence.SubSequence;

import java.util.ArrayList;
import java.util.List;

public class WithRecursion {
    //the pattern of taking something and removing something is know as sub sequence pattern
    public static void main(String[] args) {
        System.out.println(subseq("","abc",new ArrayList<String>()));
    }
    static List<String> subseq(String p, String up, List<String> list){
        if(up.isEmpty()){
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        subseq(p+ch,up.substring(1),list);
        subseq(p,up.substring(1),list);
        return list;
    }
}
