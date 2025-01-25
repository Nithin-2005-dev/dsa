package arrays.Problems;

public class SubarraySumEqualsToK {
    public static void main(String[] args) {
        System.out.println(subarraySum(new int[]{1,-1,0},0));
    }
    public static int subarraySum(int[] nums, int k) {
        int i=0;
        int j=0;
        int sum=0;
        int count=0;
        while(j<nums.length){
            if((sum+nums[i])==k){
                sum+=nums[i];
                count++;
                i++;
            }else if(sum+nums[i]>k){
                j++;
                i=j;
            }else{
                sum+=nums[i];
                i++;
            }
            if(i>=nums.length){
                sum=0;
                j++;
                i=j;
            }
        }
        return count;
    }
}
