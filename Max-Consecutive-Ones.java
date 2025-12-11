1class Solution {
2    public int findMaxConsecutiveOnes(int[] nums) {
3        int count=0;
4        int m=0;
5        for( int i=0;i<=nums.length-1;i++){
6           if(nums[i]==1){
7            m++;
8           }else{
9            count=Math.max(count,m);
10            m=0;
11           }
12        }
13        count=Math.max(count,m);
14        return count;
15    }
16}