package arrays.Problems;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int r=1;
        ArrayList<Integer> deque=new ArrayList<>();
        for(int i=0;i<digits.length;i++){
            int sum=digits[digits.length-i-1]+r;
            if(sum<10){
                deque.add(0,sum);
                r=0;
            }else{
                deque.add(0,sum%10);
                r=sum/10;
            }
        }
        while(r>0){
            deque.add(0,r%10);
            r=r/10;
        }
        System.out.println(deque);
        int[] result=new int[deque.size()];
        int n=deque.size();
        for(int i=0;i<n;i++){
            result[i]=deque.get(i);
        }
        return result;
    }
}
