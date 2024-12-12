package MathsForDSA.Problems;

public class RangeXOR {
    public static void main(String[] args) {
        int a=3;
        int b=9;
        int ans=XOR(b)^XOR(a-1);
        System.out.println(ans);
    }
    static int XOR(int a){
        if(a%4==0){
            return 0;
        } else if (a%4==1) {
            return 1;
        } else if (a%4==2){
            return a+1;
        }else {
            return 0;
        }
    }
}
