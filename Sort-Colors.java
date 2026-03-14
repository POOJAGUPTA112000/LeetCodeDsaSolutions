1class Solution {
2    public void sortColors(int[] nums) {
3        merge(nums);
4    }
5    public void merge(int [] arr){
6        if(arr.length<=1){
7            return;
8        }
9        int mid =arr.length/2;
10        int [] left =new int [mid];
11        int [] right = new int [arr.length - mid];
12        int j=0;
13        for( int i=0;i<=arr.length-1;i++){
14            if(mid>i){
15                left[i]=arr[i];
16            }else{
17                right[j]=arr[i];
18                j++;
19            }
20        }
21        merge(left);
22        merge(right);
23        mergeSort(left,right,arr); 
24    }
25    public void mergeSort( int left[],int right[],int [] arr){
26        int r=0,l=0,i=0;
27        while(r<right.length && l < left.length){
28            if(left[l] < right [r]){
29                arr[i]=left[l];
30                l++;
31            }else{
32                arr[i]=right[r];
33                r++;
34            }
35            i++;
36        }
37        while(l<left.length){
38            arr[i]=left[l];
39            l++;
40            i++;
41        }
42        while(r<right.length){
43            arr[i]=right[r];
44            r++;
45            i++;
46        }
47    }
48}
49
50
51
52
53
54
55
56
57
58
59
60
61
62
63
64
65
66
67
68
69
70
71
72
73
74
75
76
77
78
79
80
81
82
83// class Solution {
84//     public void sortColors(int[] nums) {
85//         int low=0;
86//         int mid=0;
87//         int high =nums.length-1;
88//         while(mid<=high){
89//             if(nums[mid]==0){
90//                 int l=nums[mid];
91//                 nums[mid]=nums[low];
92//                 nums[low]=l;
93//                 mid++;
94//                 low++;
95//             }else{
96//                 if(nums[mid]==1){
97//                     mid++;
98//                 }else{
99//                     int h=nums[mid];
100//                     nums[mid]=nums[high];
101//                     nums[high]=h;
102//                     high--;
103//                 }
104//             }
105//         }
106//     }
107    
108// }