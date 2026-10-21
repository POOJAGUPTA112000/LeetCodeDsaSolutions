class Solution {
    public boolean canPartition(int[] nums) {
      int sum=0;
      for( int i: nums){
        sum+=i;
      }
      if(sum%2!=0) return false;
      int target=sum/2;
      int [][] dp = new int[nums.length][target+1];
      for( int i=0;i<dp.length;i++){
        Arrays.fill(dp[i],-1);
      }
      return callfun(nums.length-1,target, nums, dp);
    
    }

    public static boolean callfun(int i, int k , int [] arr, int [][]dp){
        if(k==0) return true;
        if(i==0) return arr[0]==k;

        if(dp[i][k]!=-1) return dp[i][k]==1;

        // pick
        boolean pick=false;
        if(arr[i]<k){
            pick=callfun(i-1, k-arr[i],arr,dp);
        }
        boolean npick=callfun(i-1,k,arr,dp);

        boolean result = pick || npick;
        
        if(result) dp[i][k]=1;
        else dp[i][k]=0;
        return result;

    }
}