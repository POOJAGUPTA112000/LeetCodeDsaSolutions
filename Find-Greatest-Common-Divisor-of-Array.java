1class Solution {
2    public int findGCD(int[] nums) {
3        Arrays.sort(nums);
4        int a=nums[0];
5        int b=nums[nums.length-1];
6        int res = a>b ? b : a;
7        while(res>0){
8            if(a%res==0 && b%res==0){
9                break;
10            }
11            res--;
12        }
13        return res;
14    }
15}