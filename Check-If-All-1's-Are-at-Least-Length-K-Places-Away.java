1class Solution {
2    public boolean kLengthApart(int[] nums, int k) {
3        int start=0;
4        if(nums[0]==1){
5         start =0;
6        }else{
7            for( int i=0;i<=nums.length-1;i++){
8                if(nums[i]==1){
9                    start=i;
10                    break;
11                }
12            }
13        }
14        // int end =nums.length-1;
15        for(int i=start+1;i<=nums.length-1;i++){
16            if(nums[i]==1){
17                if(!((i-start-1)>=k)){
18                    return false;
19                }else{
20                    start=i;
21                }
22            }
23        }
24        return true;
25}
26}