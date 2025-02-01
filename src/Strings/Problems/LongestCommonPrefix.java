package Strings.Problems;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }
    public static String longestCommonPrefix(String[] strs) {
        String base=strs[0];
        while(!base.isEmpty()){
            boolean check=true;
            for(int i=0;i<strs.length;i++){
                if(!strs[i].startsWith(base)){
                    check=false;
                    break;
                }
            }
            if(check){
                return base;
            }else{
                base=base.substring(0,base.length()-1);
            }
        }
        return "";
    }
}
