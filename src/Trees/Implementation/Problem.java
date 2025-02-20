package Trees.Implementation;

public class Problem {
    public static void main(String[] args) {
        System.out.println(findX(5,6,7));
    }
    public static int findX(int A,int B,int C){
        for (int i = Integer.MIN_VALUE; i < Integer.MAX_VALUE; i++) {
            if(((A|i)&(B|i))==C){
                return i;
            }
        }
        return -1;
    }
}
