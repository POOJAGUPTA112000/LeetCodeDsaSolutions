class Solution {
    public int minimumTotal(List<List<Integer>> tr) {
        int [][]dp = new int[tr.size()][tr.size()];
        for( int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],Integer.MAX_VALUE);
        }
        return callfun(0,0,tr,dp);
    }
    public int callfun(int row,int col,List<List<Integer>> list,int[][]dp){
        if(row==list.size()-1) return list.get(row).get(col);

        if(dp[row][col]!=Integer.MAX_VALUE) return dp[row][col];

        int left = list.get(row).get(col) + callfun(row+1,col,list,dp);
        int right = list.get(row).get(col) + callfun(row+1 ,col+1,list,dp);

        dp[row][col]=Math.min(left,right);

        return dp[row][col];
    }
}