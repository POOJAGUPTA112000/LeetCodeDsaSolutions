1class Solution {
2    public void sortColors(int[] nums) {
3        int low=0;
4        int mid=0;
5        int high =nums.length-1;
6        while(mid<=high){
7            if(nums[mid]==0){
8                int l=nums[mid];
9                nums[mid]=nums[low];
10                nums[low]=l;
11                mid++;
12                low++;
13            }else{
14                if(nums[mid]==1){
15                    mid++;
16                }else{
17                    int h=nums[mid];
18                    nums[mid]=nums[high];
19                    nums[high]=h;
20                    high--;
21                }
22            }
23        }
24    }
25}