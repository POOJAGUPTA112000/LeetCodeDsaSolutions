1class Solution {
2    public void moveZeroes(int[] nums) {
3        if(nums.length<=1){
4            return ;
5        }
6        int l=0;
7        for( int i=1;i<=nums.length-1;i++){
8            if(nums[l]!=0){
9                l++;
10            }
11            if(nums[l]==0 && nums[i]!=0){
12                nums[l]=nums[i];
13                nums[i]=0;
14                l++;
15            }
16        }
17    }
18}
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36
37
38
39
40
41
42
43
44
45// class Solution {
46//     public void moveZeroes(int[] nums) {
47//         int l=0;
48//         for( int i=1;i<nums.length;i++){
49//             if(nums[l]!=0){
50//                 l++;
51//             }
52//             if(nums[l]==0 && nums[i]!=0){
53//                 nums[l]=nums[i];
54//                 nums[i]=0;
55//                 l++;
56//             }
57//         }
58//     }
59// }