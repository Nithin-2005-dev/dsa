package MathsForDSA.Problems;

public class NthMagicNumber {
    public static void main(String[] args) {
        int n=5;
        int magic=0;
        int i=1;
        while(n>0){
            int last=n&1;
            magic+= (int) (last*Math.pow(5,i));
            n=n>>1;
            i++;
        }
        System.out.println(magic);
    }
}
