package LinkedList.Problems;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
    public static boolean isHappy(int n) {
        int s=square(n);
        int f=square(square(n));
        while(f!=s){
            s=square(n);
            f=square(square(n));
        }
    return false;
    }
    public static int square(int n){
        int sum=0;
        while (n>0){
            int r=n%10;
            n/=10;
        }
        return sum;
    }
}
