1class Solution {
2    public boolean lemonadeChange(int[] nums) {
3        int r5=0;
4        int r10=0;
5        int r20=0;
6        for( int i=0;i<=nums.length-1;i++){
7            if(nums[i]==5){
8                r5+=nums[i];
9            }else{
10                if(nums[i]==10){
11                    if(r5>=5){
12                        r10+=nums[i];
13                        r5-=5;
14                    }else{
15                        return false;
16                    }
17                }else{
18                    if(nums[i]==20){
19                        r20+=nums[i];
20                        if(r10>=10 && r5>=5){
21                            r10-=10;
22                            r5-=5;
23                        }else{
24                            if(r5>=15){
25                                r5-=15; 
26                            }
27                            else{
28                            return false;
29                             }
30                        // if(r10<0 || r5<=0){
31                        //     return false;
32                        // }
33                    }
34                }
35            }
36        // return true;
37        }
38        }
39        return true;
40    }
41}