class Solution {
    public int cherryPickup(int[][] grid) {
        int [][][] dp = new int [grid.length][grid[0].length][grid[0].length];
        for( int i=0;i<grid.length;i++){
            for( int j=0;j<grid[0].length;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        return callfun(0,0,grid[0].length-1,grid,dp);
    }
    public int callfun(int i, int j, int k ,int [][] grid,int [][][] dp) {
        // boundary case
        if(j<0 || j > grid[0].length-1 || k<0 || k > grid[0].length-1) {
            return (int)-1e9;
        }
        // edge case
        if(i==grid.length-1){
            if(j==k) return grid[i][j];
            else return (grid[i][j] + grid[i][k]);
        }
        if(dp[i][j][k]!=-1)return dp[i][j][k];
        int maxi=0;
        for( int l1=-1; l1<=1; l1++){
            for( int l2=-1; l2<=1 ;l2++){
                int val = 0;
                if( j==k) val = grid[i][j];
                else val = grid[i][j]+grid[i][k] ;
                val+=callfun(i+1,j+l1,k+l2,grid,dp);
                maxi=Math.max(maxi,val);
            }
        } 
        return dp[i][j][k]=maxi;
    }
}