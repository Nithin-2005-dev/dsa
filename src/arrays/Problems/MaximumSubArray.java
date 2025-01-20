package arrays.Problems;

public class MaximumSubArray {
    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(findMax(nums,nums[0],0,0));
    }
    static int findMax(int[] nums,int max,int s,int e){
        if(e==nums.length){
            return max;
        }
        if(s>e){
            return findMax(nums,max,0,e+1);
        }
        int sum=0;
        for(int i=s;i<=e;i++){
            sum+=nums[i];
        }
        max = Math.max(max, sum);
        return findMax(nums,max,s+1,e);
    }
}
