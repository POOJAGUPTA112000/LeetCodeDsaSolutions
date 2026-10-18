class Solution {
    public int minPathSum(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int sum=0;
        if(r==1){
            for(int i=0;i<c;i++){
                sum+=grid[0][i];
            }
            return sum;
        }
        if(c==1){
            for( int i=0;i<r;i++){
                sum+=grid[i][0];
            }
            return sum;
        }
        int [][] dp =new int[r][c];
        for( int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return callfun(r-1,c-1,grid,dp);
    }
    public static int callfun(int m, int n, int[][] grid, int [][]dp){
        if(m==0 && n==0) return grid[m][n];
        if(m<0 || n<0) return (int)1e9;

        if(dp[m][n]!=-1) return dp[m][n];
        // left 
        int left = grid[m][n]+callfun(m,n-1,grid,dp);
        // up
        int up = grid[m][n]+callfun(m-1,n,grid,dp);

        dp[m][n]=Math.min(left,up);
        return dp[m][n];
    }

}