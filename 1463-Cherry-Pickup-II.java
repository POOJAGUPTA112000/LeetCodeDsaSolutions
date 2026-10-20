class Solution {
    public int cherryPickup(int[][] grid) {
        int dp[][][] = new int [grid.length][grid[0].length][grid[0].length];
        for( int i=0;i<dp.length;i++){
            for( int j=0;j<dp[i].length;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        return callfun(0,0,grid[0].length-1,grid,dp);
    }
    public int callfun(int i, int j1, int j2, int [][] grid, int [][][] dp){
        // boundary case
        if(j1<0 || j1 > grid[0].length-1 || j2 < 0  || j2 > grid[0].length-1) return (int)-1e8;
        // base case
        if(i==grid.length-1){
            if(j1==j2){ 
                return grid[i][j1];
            }else{
                return grid[i][j1] + grid[i][j2];
            }
        }
        if(dp[i][j1][j2]!=-1) return dp[i][j1][j2];
        int maxi=0;
        for( int d1=-1; d1<=1; d1++){
            for( int d2=-1 ; d2<=1 ; d2++){
                int value=0;
                if(j1==j2){ value = grid[i][j1];}
                else value =grid[i][j1] + grid[i][j2];
                value+= callfun(i+1,j1+d1,j2+d2 , grid,dp);
                maxi=Math.max(maxi,value);
            }
        }
        return dp[i][j1][j2]=maxi;
    }
}