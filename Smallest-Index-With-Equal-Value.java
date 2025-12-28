1class Solution {
2    public int smallestEqual(int[] nums) {
3        // int count=0;
4        for( int i=0;i<=nums.length-1;i++){
5            if(i%10==nums[i]){
6                return i;
7            }
8        }
9        return -1;
10    }
11}