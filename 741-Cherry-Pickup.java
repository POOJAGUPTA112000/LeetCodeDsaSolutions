class Solution {
    public int cherryPickup(int[][] grid) {
        int [][][] dp =  new int [grid.length][grid[0].length][grid[0].length];   
        for( int i=0;i<dp.length;i++){
            for( int j=0;j<dp.length;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        return Math.max(0,callfun(0,0,0,grid ,dp));
    }
    int callfun(int r1, int c1, int c2,int [][] grid, int [][][]dp ){
        int r2 =r1+c1-c2;
        // boundary case 
        if(r1>grid.length-1 || r2>grid.length-1 || c1>grid[0].length-1 || c2>grid[0].length-1 || grid[r1][c1]==-1 || grid[r2][c2]==-1 ) return (int)-1e9;
        // basecase
        if(r1==grid.length-1 && c1==grid[0].length-1) return grid[r1][c1];

        if(dp[r1][c1][c2]!=-1) return dp[r1][c1][c2];

        int count = 0;
        if(r1==r2 && c1==c2){
            count=grid[r1][c1];
        } 
        else{
            count+=(grid[r1][c1]+grid[r2][c2]);
        }

        // dd
        // dl
        // ll
        // ld
        int dd = callfun(r1+1,c1,c2,grid,dp);
        int dl = callfun(r1+1,c1,c2+1,grid,dp); 
        int ll = callfun(r1,c1+1,c2+1,grid,dp);
        int ld =callfun(r1 , c1+1,c2,grid,dp);

        return dp[r1][c1][c2] = Math.max(Math.max(dd,ll) ,Math.max(dl,ld))+count;
    }
}