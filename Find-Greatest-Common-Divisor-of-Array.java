1class Solution {
2    public int findGCD(int[] nums) {
3        // Arrays.sort(nums);
4        // int a=nums[0];
5        // int b=nums[nums.length-1];
6        // int res = a>b ? b : a;
7        // while(res>0){
8        //     if(a%res==0 && b%res==0){
9        //         break;
10        //     }
11        //     res--;
12        // }
13        // return res;
14        int max=Integer.MIN_VALUE;
15        int min=Integer.MAX_VALUE;
16        for( int i : nums){
17                if(i>max){
18                    max=i;
19                }
20                if(i<min){
21                min=i;
22                }
23        }
24        int b=min;
25        while(b>0){
26            if(max%b==0 && min%b==0){
27                break;
28            }
29            b--;
30        }
31        return b;
32    }
33}