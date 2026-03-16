1class Solution {
2    public void rotate(int[] nums, int k) {
3        k%=nums.length;
4        reverse(nums,0,nums.length-1);
5        reverse(nums,0,k-1);
6        reverse(nums,k,nums.length-1);
7    }
8    public void reverse(int [] nums,int start ,int end){
9        while(start <= end){
10            int a = nums[start];
11            nums[start]=nums[end];
12            nums[end]=a;
13            end--;
14            start++;
15        }
16    }
17}
18
19
20
21
22
23
24
25// class Solution {
26//     public void rotate(int[] nums, int k) {
27//         if(k==0 || nums.length<=1){
28//                 return ; 
29//         }
30//         if(k>=nums.length){
31//             while(k!=0){
32//             int a=nums[nums.length-1];
33//             for( int i=nums.length-1;i>0;i--){
34//                 nums[i]=nums[i-1];
35//             }
36//             nums[0]=a;
37//             k--;
38//             }
39//             return;
40//         }
41//         int p=0;
42//         int q=nums.length-1;
43//         while(p<=q){
44//             int s=nums[p];
45//             nums[p]=nums[q];
46//             nums[q]=s;
47//             p++;
48//             q--;
49//         }
50//         // for( int i=0;i<=nums.length/2;i++){
51//         //     int a = nums[i];
52//         //    nums[i]= nums[nums.length-1-i];
53//         //    nums[nums.length-1-i]=a;
54//         // }
55//         System.out.println(Arrays.toString(nums));
56//         int a=0;
57//         int b=k-1;
58//         while(a<=b){
59//             int l =nums[a];
60//             nums[a]=nums[b];
61//             nums[b]=l;
62//             b--;
63//             a++;
64//         }
65//         // int j=0;
66//         // for( int i=0;i<=(k)/2;i++){
67//         //     int a =nums[i];
68//         //     nums[i]=nums[k-1-i];
69//         //     nums[k-1-i]=a;
70//         // }
71//         int low=k;
72//         int high=nums.length-1;
73//         while(low<=high){
74//             a = nums[low];
75//             nums[low]=nums[high];
76//             nums[high]=a;
77//             low++;
78//             high--;
79
80//         }
81//         // for( int i=k;i<=(nums.length+1)/2;i++){
82//         //     int a = nums[i];
83//         //     nums[i]=nums[nums.length-1-j];
84//         //     nums[nums.length-1-j]=a;
85//         //     j++;
86//         // }
87//     }
88// }
89
90
91
92
93
94
95
96
97
98
99
100
101
102
103
104
105
106
107
108
109
110
111
112
113
114
115
116
117
118
119// // class Solution {
120// //     public void rotate(int[] nums, int k) {
121// //         if(k==0){
122// //             return;
123// //         }
124// //         while(k!=0){
125// //             int a=nums[nums.length-1];
126// //             for( int i=nums.length-1;i>0;i--){
127// //                 nums[i]=nums[i-1];
128// //             }
129// //             nums[0]=a;
130// //             k--;
131// //         }
132// //     }
133// // }