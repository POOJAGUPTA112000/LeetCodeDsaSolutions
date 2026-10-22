class Solution {
    public int change(int amount, int[] coins) {
        int dp[][] = new int [coins.length][amount+1];
        for( int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return callfun(coins.length-1,amount,coins,dp);
    }

    int callfun(int i, int amount, int[] coins, int [][] dp){
        if(i==0){
            if(amount%coins[0]==0) return 1;
            return 0;
        }

        // if(amount==0) return 1;
        if(dp[i][amount]!=-1 ) return dp[i][amount];

        int npick = callfun(i-1,amount,coins,dp);

        int np=0;

        if(coins[i]<= amount){
            np = callfun(i,amount-coins[i],coins,dp);
        }

        return dp[i][amount]=npick + np;
    }
}