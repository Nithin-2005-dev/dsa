package Strings.PatternProblems;

public class Pattern3 {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            if(i<=9/2){
                for (int j = 0; j <=i; j++) {
                    System.out.print("* ");
                }
            }else{
                for (int j = 0; j <=9-i-1; j++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
