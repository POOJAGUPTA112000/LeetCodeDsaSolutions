class Solution {
    public int climbStairs(int n) {
        int dp [] = new int[n+1];
        Arrays.fill(dp,-1);
        return call(dp,n);
    }
    int call(int [] dp,int n){
        if(n==0){
            return 1;
        }
        if(n==1){
            return 1;
        }
        int left,right;
        if(dp[n-1]!=-1){
            left=dp[n-1];
        }else{
            left=call(dp,n-1);
        }
        if(dp[n-2]!=-1){
            right=dp[n-2];
        }else{
            right=call(dp,n-2);
        }
        dp[n]=left+right;
        return dp[n];       
    }
}