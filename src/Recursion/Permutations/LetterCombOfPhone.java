package Recursion.Permutations;

import java.util.ArrayList;
import java.util.List;

public class LetterCombOfPhone {
    public static void main(String[] args) {
        String[] letters={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        System.out.println(getPers(letters,"","23"));
    }
    static List<String> getPers(String[] letters,String p,String up){
        if(up.isEmpty()){
            List<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char letter=up.charAt(0);
        String word=letters[letter-50];
        List<String> list=new ArrayList<>();
        for(int i=0;i<(word.length());i++){
            List<String> comeList=getPers(letters,p+word.charAt(i),up.substring(1));
            list.addAll(comeList);
        }
        return list;
    }
}
