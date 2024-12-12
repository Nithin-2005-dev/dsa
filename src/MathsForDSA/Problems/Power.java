package MathsForDSA.Problems;

public class Power {
    public static void main(String[] args) {
        int b=6;
        int base=3;
        int ans=1;
        while(b>0){
            int last=b&1;
            if(last!=0) {
                ans *= last * base;
            }
            base=base*base;
            b=b>>1;
        }
        System.out.println(ans);
    }

}
