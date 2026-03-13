1class Solution {
2    public void moveZeroes(int[] nums) {
3        int l=0;
4        for( int i=1;i<nums.length;i++){
5            if(nums[l]!=0){
6                l++;
7            }
8            if(nums[l]==0 && nums[i]!=0){
9                nums[l]=nums[i];
10                nums[i]=0;
11                l++;
12            }
13        }
14    }
15}