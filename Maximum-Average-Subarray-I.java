1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3        // int count=0;
4        if(nums.length==1){
5            return (double)nums[0];
6        }
7        double maxav= -Double.MAX_VALUE;
8        for( int i=0;i<=nums.length-k;i++){
9            int sum=0;
10            for( int j=i;j<=i+k-1;j++){
11                sum+=nums[j];
12            }
13            maxav=Math.max(maxav,sum/(double)k);
14        }
15        return maxav;
16    }    
17}