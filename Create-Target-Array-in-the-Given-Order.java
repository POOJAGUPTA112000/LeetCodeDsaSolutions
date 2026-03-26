1class Solution {
2    public int[] createTargetArray(int[] nums, int[] index) {
3        ArrayList<Integer> arr =new ArrayList<>();
4        for( int i=0;i<=index.length-1;i++){
5            arr.add(index[i],nums[i]);
6        }
7        return arr.stream().mapToInt(i -> i).toArray(); 
8    }
9}
10
11
12
13
14
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
33// class Solution {
34//     public int[] createTargetArray(int[] nums, int[] index) {
35//         int [] arr =new int [nums.length];
36//         Arrays.fill(arr,-1);
37//         for( int i=0;i<=index.length-1;i++){
38//             int a = nums[i];
39           
40//             if(arr[index[i]]>-1){
41//                 int j=arr.length-1;
42//                 while(j>=i){
43//                     arr[j]=arr[j-1];
44//                     j--;
45//                 }
46//             }
47//             arr[index[i]]=nums[i];
48//             // System.out.println(Arrays.toString(arr) + " " + index[i]+" "+nums[i]);
49//         }
50//         return arr;
51//     }
52// }