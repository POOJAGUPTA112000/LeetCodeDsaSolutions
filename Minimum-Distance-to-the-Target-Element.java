1class Solution {
2    public int getMinDistance(int[] nums, int target, int start) {
3        int m =Integer.MAX_VALUE;
4        for( int i=start;i<=nums.length-1;i++){
5            if(nums[i]==target){
6                m= Math.min(m,Math.abs(i-start));
7            }
8        }
9        for(int i=start ;i>=0;i--){
10            if(nums[i]==target){
11                 m= Math.min(m,Math.abs(i-start));
12            }
13        }
14        return m;
15    }
16}