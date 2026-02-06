1class Solution {
2    public int countHillValley(int[] nums) {
3        int count=0;
4        int left=0;
5        for(int i=1;i<nums.length-1;i++){
6            if(nums[i]!=nums[i+1]){
7                if((nums[i]>nums[left] && nums[i]>nums[i+1]) || 
8                 (nums[i]<nums[left] && nums[i] <nums[i+1])){
9                    count++;
10                }
11                left=i;
12            }
13        }
14        return count;
15    }
16}