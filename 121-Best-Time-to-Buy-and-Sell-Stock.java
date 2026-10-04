class Solution {
    public int maxProfit(int[] prices) {
         if(prices.length==0){
        return 0;
    }
    int sum=0;
    int mincost=prices[0];
    for( int i=1;i<prices.length;i++){
            if(mincost>prices[i]){
                mincost=prices[i];
            }else{
                if(sum<(prices[i]-mincost)){
                    sum=(prices[i]-mincost);
                }
            }
        }
        return sum;
    }
}