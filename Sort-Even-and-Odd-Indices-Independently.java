1class Solution {
2    public int[] sortEvenOdd(int[] nums) {
3        for( int i=0;i<nums.length-1;i+=2){//incresing order sort
4               for( int j=i+2;j<=nums.length-1;j+=2){
5                    if(nums[i]>nums[j]){
6                        int a =nums[i];
7                        nums[i]=nums[j];
8                        nums[j]=a;
9                    }
10               }
11        }
12        for( int i=1;i<=nums.length-1;i+=2){//decresing order order sort
13               for( int j=i+2;j<=nums.length-1;j+=2){
14                    if(nums[i]<nums[j]){
15                        int a =nums[i];
16                        nums[i]=nums[j];
17                        nums[j]=a;
18                    }
19               }
20        }
21        return nums;
22    }
23}