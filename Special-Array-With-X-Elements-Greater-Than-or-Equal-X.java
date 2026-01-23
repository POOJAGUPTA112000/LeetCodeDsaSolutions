1class Solution {
2    public int specialArray(int[] nums) {
3        Arrays.sort(nums);
4        int l=0;
5        int h=nums.length;
6        while(l<=h){
7            int mid=(l+h)/2;
8            int count=0;
9            for( int i: nums){
10                if(mid<=i){
11                    count++;
12                }
13            }
14            if(mid==count){
15                return mid;
16            }
17            if(count <mid){
18                h=mid-1;
19            }else{
20                l=mid+1;
21            }
22        }
23        return -1;
24    }
25}
26
27
28// class Solution {
29//     public int specialArray(int[] nums) {
30//         int n=nums.length;
31//         while(n!=0){
32//             int count=0;
33//             for( int i:nums){
34//                 if(n<=i){
35//                     count++;
36//                 }
37//             }
38//             if(count==n){
39//                 return n;
40//             }
41//             n--;
42//         }
43//         return -1;
44//     }
45// }