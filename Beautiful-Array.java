1class Solution {
2    public int[] beautifulArray(int n) {
3    //  if(n==1){
4    //     return new int [] {1};
5    //  }
6    //  if(n==2){
7    //     return new int [] {1,2};
8    //  }
9     int arr [] =new int [n];
10     for( int i=1;i<=n;i++){
11        arr[i-1]=i;
12     }
13    callfunction(arr,0,n-1);
14    return arr;
15    }    
16    public void callfunction(int [] arr, int left ,int right){
17        if(left>=right){
18            return;
19        }
20        ArrayList<Integer> l1= new ArrayList<>();
21        ArrayList<Integer> l2 = new ArrayList<>();
22        boolean flag=true;
23        for(int i=left;i<=right;i++){
24            if(flag){
25                l1.add(arr[i]);
26            }else{
27                l2.add(arr[i]);
28            }
29            flag=!flag;
30        }
31        for(int i=left;i<=right;i++){
32            if(!l1.isEmpty()){
33                arr[i]=l1.remove(0);
34            }else{
35                arr[i]=l2.remove(0);
36            }
37        }
38        callfunction(arr,left,(left+right)/2);
39        callfunction(arr,((left+right)/2)+1,right); 
40    } 
41}
42
43
44
45
46
47
48
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
78// class Solution {
79//     public int[] beautifulArray(int n) {
80//         if(n==1){
81//             return new int [] {1};
82//         }
83//         if(n==2){
84//             return new int [] {1,2};
85//         }
86//         int arr [] =new int[n];
87//         for( int i=0;i<n;i++){
88//             arr[i]=i+1;
89//         }
90//         // int i=0;
91//         // int j=i+2;
92//         boolean allGood=false;
93//         while(allGood!=true){
94//             int i=0;
95//             int j=0;
96//             for(j=i+2;j<=arr.length-1;j++){
97//                 for( int k =i+1;k<j;k++){
98//                 if(2*arr[k]==arr[i]+arr[j]){
99//                     int p=0;
100//                     if(Math.abs(k-i) > Math.abs(k-j)){
101//                         p=j;
102//                     }else{
103//                         p=i;
104//                     }
105//                     int l=arr[k];
106//                     arr[k]=arr[p];
107//                     arr[p]=l;
108//                     if(p==j){
109//                         j--;
110//                     }
111//                  }
112//                }
113//             } 
114              
115//         }
116//             return arr;
117//     }
118// }