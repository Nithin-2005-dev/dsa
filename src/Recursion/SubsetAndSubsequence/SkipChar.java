package Recursion.SubsetAndSubsequence;

import java.util.Scanner;

public class SkipChar {
    public static void main(String[] args) {
        System.out.println(skipC("nithin",'i'));
        System.out.println(skipW("nithin","th"));
    }
    static String skipC(String o,char c){
        if(o.isEmpty()){
            return o;
        }
        if(o.charAt(0)==c){
            return ""+skipC(o.substring(1),c);
        }else{
            return o.charAt(0)+skipC(o.substring(1),c);
        }
    }
    static String skipW(String o,String w){
        if(o.isEmpty()){
            return o;
        }
        if(o.startsWith(w)){
            return ""+skipW(o.substring(w.length()),w);
        }else{
            return o.charAt(0)+skipW(o.substring(1),w);
        }
    }
}
