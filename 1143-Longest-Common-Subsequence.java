class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int [][] dp = new int [text1.length()][text2.length()];
        for( int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return callfun(text1.length()-1, text2.length()-1, text1, text2,dp);
    }
    public int callfun(int i, int j, String str1, String str2,int [][]dp){
        if(i<0 || j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j]; 
        if(str1.charAt(i)==str2.charAt(j)){
            return 1 + callfun(i-1,j-1,str1,str2,dp);
        }
        return dp[i][j]=Math.max(callfun(i-1,j,str1,str2,dp),callfun(i,j-1,str1,str2,dp));        
    }
}