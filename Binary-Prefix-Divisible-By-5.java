1class Solution {
2    public List<Boolean> prefixesDivBy5(int[] nums) {
3        ArrayList<Boolean> list =new ArrayList<>();
4        int prev=0;
5        for( int i=0;i<=nums.length-1;i++){
6            if((prev*2 + nums[i])%5==0){
7                list.add(true);
8            }else{
9                list.add(false);
10            }
11            prev=(prev*2 + nums[i])%5;
12        }
13        return list;
14
15    }
16}