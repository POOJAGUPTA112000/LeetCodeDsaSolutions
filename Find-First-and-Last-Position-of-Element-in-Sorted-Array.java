1class Solution {
2    public int[] searchRange(int[] nums, int target) {
3        // if(nums.length==0){
4        //     return {-1,-1};
5        // }
6        int k=0;
7        int [] arr=new int[2];
8        for( int i=0;i<=nums.length-1;i++){
9            if(nums[i]==target){
10                arr[k]=i;
11                k++;
12                break;
13            }
14        }
15        for( int i=nums.length-1;i>=0;i--){
16             if(nums[i]==target){
17                arr[k]=i;
18                k++;
19                break;
20            }
21        }
22        if(k==0){
23            arr[0]=-1;
24            arr[1]=-1;
25        }
26        return arr;
27    }
28}