package StringAndStringBuilder.PatternProblems;

public class Pattern5 {
    public static void main(String[] args) {
        int c=1;
        for (int i = 0; i < 5; i++) {
            for (int j = (i); j<5; j++) {
                System.out.print(" ");
            }
            c=i;
            for (int j = 2*i; j >=0 ; j--) {
                System.out.print(c+1+" ");
                if(c<(j)/2){
                    c--;
                }else{
                    c++;
                }
            }
            System.out.println();
        }

    }
}
