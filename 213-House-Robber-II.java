class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0],nums[1]);
        
        int dp [] = new int [nums.length];
        Arrays.fill(dp,-1);
        int a1 = callfun(nums.length-2,dp,nums);
        Arrays.fill(dp,-1);
        nums[0]=0;
        int a2 = callfun(nums.length-1,dp,nums);
        return Math.max(a2,a1);
    }
    public static int callfun(int n,int [] dp, int [] nums){
        if(n == 0) return nums[n];
        if(n<0) return 0;
        if(dp[n]!=-1) return dp[n];
        int pick = nums[n] + callfun(n-2,dp,nums);
        int npick = callfun(n-1,dp,nums);
        dp[n]=Math.max(pick,npick);
        return dp[n];
    }
}