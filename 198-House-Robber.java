class Solution {
    public int rob(int[] nums) {
    int dp [] = new int [nums.length];
    Arrays.fill(dp,-1);
    return callfun(nums.length-1,nums,dp);    
    }
    public static int callfun(int n ,  int [] nums, int [] dp){
        if(n==0){
            return nums[0];
        }
        if(n<0) return 0;
        if(dp[n]!=-1) return dp[n];
        int pick=nums[n]+callfun(n-2,nums,dp);
        int npick= callfun(n-1,nums,dp);
        // System.out.println(pick+" "+npick+" "+dp[n]);
        dp[n]=Math.max(pick,npick);
        System.out.println(pick+" "+npick+" "+dp[n]);
        return dp[n];
    }

}