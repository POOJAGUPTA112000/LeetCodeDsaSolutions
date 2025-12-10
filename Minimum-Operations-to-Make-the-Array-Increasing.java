1class Solution {
2    public int minOperations(int[] nums) {
3        int count=0;
4        for( int i=0;i<nums.length-1;i++){
5            while(!(nums[i]<nums[i+1])){
6                count++;
7                nums[i+1]+=1;
8            }
9        }
10        return count;
11    }
12}