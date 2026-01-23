1class Solution {
2    public int specialArray(int[] nums) {
3        int n=nums.length;
4        while(n!=0){
5            int count=0;
6            for( int i:nums){
7                if(n<=i){
8                    count++;
9                }
10            }
11            if(count==n){
12                return n;
13            }
14            n--;
15        }
16        return -1;
17    }
18}