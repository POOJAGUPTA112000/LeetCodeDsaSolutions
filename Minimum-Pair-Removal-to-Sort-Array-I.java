1class Solution {
2    public int minimumPairRemoval(int[] nums) {
3        ArrayList<Integer> arr =new ArrayList<>();
4        for( int i: nums){
5            arr.add(i);
6        }
7       int op=0;
8       boolean flag=false;
9       while(flag!=true){
10       boolean flag2=true;
11            for( int i=1;i<arr.size();i++){
12                if(arr.get(i-1)>arr.get(i)){
13                    flag2=false;
14                    break;
15                }
16            }
17        if(flag2 == true){
18            return op;
19        }
20            int sum=Integer.MAX_VALUE;
21            int i1=0;
22            int i2=0;
23        for( int i=0;i<arr.size()-1;i++){
24            if(sum>(arr.get(i)+arr.get(i+1))){
25                sum=arr.get(i)+arr.get(i+1);
26                i1=i;
27                i2=i+1;
28            }
29        }
30        arr.remove(i2);
31        arr.remove(i1); 
32        arr.add(i1,sum);      
33        op++;
34       }
35    return op;
36    }
37}
38
39
40// class Solution {
41//     public int minimumPairRemoval(int[] nums) {
42//         boolean flag =true;
43//         for( int i=1;i<=nums.length-1;i++){
44//             if(!(nums[i-1]<=nums[i])){
45//                 flag = false;
46//                 break;
47//             }
48//         }
49//         if(flag==true){
50//             return 0;
51//         }
52//         List<Integer> arr = IntStream.of(nums).boxed().collect(Collectors.toList());
53//         int po=0;
54//         while(flag==false){
55//             int sum=Integer.MAX_VALUE;
56//             int i1;
57//             int i2;
58//             for( int i=1;i<=arr.size()-1;i++){
59//                 if(!(arr.get(i-1)>arr.get(i))){
60//                     falg=true;
61//                 }else{
62//                     flag=false;
63//                 }
64//                 if(sum>(arr.get(i-1)+arr(get(i)))){
65//                     sum=arr.get(i-1)+arr(get(i));
66//                     i1=i-1;
67//                     i2=i;
68//                 }
69//             }
70//         }
71
72
73
74//     }
75// }