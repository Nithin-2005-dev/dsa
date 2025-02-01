package arrays.Problems;

public class JumpGame {
    public static void main(String[] args) {
        Boolean check=false;
        jumper(0,2,0,new int[]{2,3,1,1,4},check);
        System.out.println(check);
    }
    static void jumper(int curr, int currVal, int sum, int[] nums, Boolean check){
        if(sum==nums.length){
            check=true;
            return;
        }
        if(sum>nums.length){
            jumper(0,nums[curr]-1,0,nums,check);
        }
            jumper(curr+1,nums[curr],sum+nums[curr],nums,check);
    }
}
