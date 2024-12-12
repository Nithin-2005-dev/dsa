package MathsForDSA.Problems;

public class BinarySearchSquareRoot {
    public static void main(String[] args) {
        int n=40;
        int p=3;
        System.out.printf("%.3f",NewtonSqrt(n));
    }
    static double NewtonSqrt(double n){
        double x=n;
        double root=0.5*(x+ (n/x));
        while (true){
            root=0.5*(x+ (n/x));
    if(Math.abs(root-x)<0.1){
        break;
    }
    x=root;
        }
        return root;
    }
    static double sqrt(int n,int p){
        int s=0;
        int e=n;
        double root=0;
        while (s<e){
            int m=s+(e-s)/2;
            if(m*m==n){
                root=m;
                return root;
            }
            if(m*m<n){
                s=m+1;
            }else{
                e=m-1;
            }
        }
        double inc=0.1;
        for (int i = 0; i < p; i++) {
            while(root*root<=n){
                root+=inc;
            }
            root-=inc;
            inc/=10;
        }
        return root;
    }
}
