class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        int dp[][] = new int [n][n];
        // for( int i=0;i<n;i++){
        //     Arrays.fill(dp[i],Integer.MAX_VALUE);
        // }
        for( int j=0;j<n;j++){
            Arrays.fill(dp[j],(int)1e9);
        }
        int mini=Integer.MAX_VALUE;
        for(int i=0 ; i< n ; i++){
            mini=Math.min(mini,callfun(0,i,dp,matrix));
        }
        return mini;
    }
    public int callfun( int row ,int col , int [][]dp , int [][]matrix){
        if(col<0 || col > matrix.length-1 ) return (int)1e9;
        if(row == matrix.length-1) return matrix[row][col];

        if(dp[row][col]!= (int)1e9 )return dp[row][col];

        // left diagonal 
        int l1 = matrix[row][col]+callfun(row+1,col-1,dp,matrix);
        // down
        int l2 = matrix[row][col]+callfun(row+1,col,dp,matrix);
        // right diagonal
        int l3 = matrix[row][col]+callfun(row+1,col+1,dp,matrix);

        return dp[row][col]=Math.min(l1,Math.min(l2,l3));
    }
}