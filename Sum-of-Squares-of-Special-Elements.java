1class Solution {
2    public int sumOfSquares(int[] nums) {
3        int sum=0;
4        for(int i=0;i<=nums.length-1;i++){
5            if(nums.length%(i+1)==0){
6                sum+=Math.pow(nums[i],2);
7            }
8        }
9        return sum;
10    }
11}