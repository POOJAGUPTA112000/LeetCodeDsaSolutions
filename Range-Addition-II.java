1class Solution {
2    public int maxCount(int m, int n, int[][] ops) {
3        if(ops.length==0){
4            return m*n;
5        }
6        int r=Integer.MAX_VALUE;
7        int c=Integer.MAX_VALUE;
8        for( int i=0;i<=ops.length-1;i++){
9            r=Math.min(r,ops[i][0]);
10            c=Math.min(c,ops[i][1]);
11        }
12        return r*c;
13    }
14}
15
16
17
18
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
40// class Solution{
41//     public int maxCount(int m, int n, int[][] ops) {
42//         int arr [][] = new int [m][n];
43//         int max = Integer.MIN_VALUE;
44//         if(ops.length==0){
45//             return m*n;
46//         }
47//         for(int i=0;i<=ops.length-1;i++){
48//             int x=ops[i][0];
49//             int y=ops[i][1]; 
50//             for(int j=0;j<x;j++){
51//                 for(int k=0;k<y;k++){
52//                     arr[j][k]+=1;
53//                     if(arr[j][k]>max){
54//                         max=arr[j][k];
55//                     }
56//                 }
57//             }
58//         }
59//         int count=0;
60//         for(int i=0;i<=arr.length-1;i++){
61//             for(int j=0;j<=arr[i].length-1;j++){
62//                 if(arr[i][j]==max){
63//                     count++;
64//                 }
65//             }
66//         }
67//         return count;
68//     }
69// }