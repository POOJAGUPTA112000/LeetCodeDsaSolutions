1class Solution {
2    public void sortColors(int[] nums) {
3        merge(nums);
4    }
5    public void merge(int [] nums){
6        if(nums.length<=1){
7            return ;
8        }
9        int mid = nums.length/2;
10        int left [] = new int [mid];
11        int right[] =new int [nums.length-mid];
12        int i=0,j=0;
13        for( ; i<nums.length;i++){
14            if(i<mid){
15                left[i]=nums[i];
16            }else{
17                right[j]=nums[i];
18                j++;
19            }
20        }
21        merge(left);
22        merge(right);
23        makeOne(left,right,nums);
24    }
25    public void makeOne(int [] left ,int[] right,int [] nums){
26        int i=0;
27        int r =0, l =0;
28        while(r<right.length && l<left.length){
29            if(right[r]>left[l]){
30                nums[i]=left[l];
31                i++;
32                l++;
33            }else{
34                nums[i]=right[r];
35                r++;
36                i++;
37            }
38        }
39        while(l<left.length){
40            nums[i]=left[l];
41            i++;
42            l++;
43        }
44        while(r<right.length){
45            nums[i]=right[r];
46            r++;
47            i++;
48        }
49    }
50}
51
52// class Solution {
53//     public void sortColors(int[] nums) {
54//         merge(nums);
55//     }
56//     public void merge(int [] arr){
57//         if(arr.length<=1){
58//             return;
59//         }
60//         int mid =arr.length/2;
61//         int [] left =new int [mid];
62//         int [] right = new int [arr.length - mid];
63//         int j=0;
64//         for( int i=0;i<=arr.length-1;i++){
65//             if(mid>i){
66//                 left[i]=arr[i];
67//             }else{
68//                 right[j]=arr[i];
69//                 j++;
70//             }
71//         }
72//         merge(left);
73//         merge(right);
74//         mergeSort(left,right,arr); 
75//     }
76//     public void mergeSort( int left[],int right[],int [] arr){
77//         int r=0,l=0,i=0;
78//         while(r<right.length && l < left.length){
79//             if(left[l] < right [r]){
80//                 arr[i]=left[l];
81//                 l++;
82//             }else{
83//                 arr[i]=right[r];
84//                 r++;
85//             }
86//             i++;
87//         }
88//         while(l<left.length){
89//             arr[i]=left[l];
90//             l++;
91//             i++;
92//         }
93//         while(r<right.length){
94//             arr[i]=right[r];
95//             r++;
96//             i++;
97//         }
98//     }
99// }
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
119
120
121
122
123
124
125
126
127
128
129
130
131
132
133
134// // class Solution {
135// //     public void sortColors(int[] nums) {
136// //         int low=0;
137// //         int mid=0;
138// //         int high =nums.length-1;
139// //         while(mid<=high){
140// //             if(nums[mid]==0){
141// //                 int l=nums[mid];
142// //                 nums[mid]=nums[low];
143// //                 nums[low]=l;
144// //                 mid++;
145// //                 low++;
146// //             }else{
147// //                 if(nums[mid]==1){
148// //                     mid++;
149// //                 }else{
150// //                     int h=nums[mid];
151// //                     nums[mid]=nums[high];
152// //                     nums[high]=h;
153// //                     high--;
154// //                 }
155// //             }
156// //         }
157// //     }
158    
159// // }