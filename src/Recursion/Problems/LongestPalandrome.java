package Recursion.Problems;

import java.util.ArrayList;
import java.util.List;

public class LongestPalandrome {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        helper("","aacabdkacaa",list);
        System.out.println(list);
        String longestPal="";
        while (!list.isEmpty()){
            if("aacabdkacaa".contains(list.get(0)) && (isPal(list.getFirst()) && list.getFirst().length()>longestPal.length())){
                longestPal=list.getFirst();
            }
            list.removeFirst();
        }
        System.out.println(longestPal);
    }
    public static void helper(String p, String up, List<String> list){
        if(up.isEmpty()){
            list.add(p);
            return;
        }
        char l=up.charAt(0);
        helper(p+l,up.substring(1),list);
        helper(p,up.substring(1),list);
    }
    public static boolean isPal(String s){
        for (int i = 0; i < s.length()/2; i++) {
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}
