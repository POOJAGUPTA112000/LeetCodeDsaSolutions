class Solution {
    public int uniquePathsWithObstacles(int[][] ob) {
        if(ob[0][0]==1 || ob[ob.length-1][ob[0].length-1] == 1 ) return 0;
        int m=ob.length;
        int n=ob[0].length;
        int dp [][] = new int [m][n];
        for( int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }
        return callfun(m-1,n-1,ob,dp);
    }
    static public int callfun(int m, int n, int [][] ob,int [][]dp){
        System.out.println(m+" "+n);
        if(m==0 && n==0) return 1;
        if(m<0 || n <0 ) return 0;
        if(ob[m][n]==1) return 0;
        if(dp[m][n]!=-1) return dp[m][n];
        int left = callfun(m,n-1,ob,dp);
        int right = callfun(m-1,n,ob,dp);
        dp[m][n]=left+right;
        System.out.println(m+" "+n+" " + dp[m][n]);
        return dp[m][n];
    } 
}