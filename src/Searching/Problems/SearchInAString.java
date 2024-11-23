package Searching.Problems;

import java.util.Scanner;
public class SearchInAString {
    public static void main(String[] args) {
        System.out.println(SearchChar("janu",'u'));
    }
    static int SearchChar(String word,char c){
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i)==c){
                return i;
            }
        }
        return -1;
    }
}
