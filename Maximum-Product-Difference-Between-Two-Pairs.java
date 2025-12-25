1class Solution {
2    public int maxProductDifference(int[] nums) {
3        Arrays.sort(nums);
4        return nums[nums.length-1]*nums[nums.length-2]-nums[0]*nums[1];
5    }
6}