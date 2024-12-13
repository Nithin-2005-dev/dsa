package Recursion.Problems;

public class Pattern1 {
    public static void main(String[] args) {
        pattern(4,0);
    }
    static void pattern(int i,int j){
        if(i==0){
            return;
        }
        if(j<i){
            System.out.print("* ");
            pattern(i,++j);
        }else {
            System.out.println();
            pattern(--i,0);
        }
    }
}
