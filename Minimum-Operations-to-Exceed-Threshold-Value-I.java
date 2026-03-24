1class Solution {
2    public int minOperations(int[] nums, int k) {
3        int count=0;
4        for( int i : nums){
5            if(i<k){
6                count++;
7            }
8        }
9        return count;
10    }
11}