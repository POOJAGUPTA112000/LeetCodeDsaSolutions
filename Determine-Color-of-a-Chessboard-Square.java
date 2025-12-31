1class Solution {
2    public boolean squareIsWhite(String coordinates) {
3        if((findNum(coordinates.charAt(0))+Character.getNumericValue(coordinates.charAt(1)))%2==0){
4            return false;
5        }
6        return true;
7    }
8    public static int findNum(char ch){
9        switch(ch){
10            case 'a':
11            return 1;
12            case 'b':
13            return 2;
14            case 'c':
15            return 3;
16            case 'd':
17            return 4;
18            case 'e':
19            return 5;
20            case 'f':
21            return 6;
22            case 'g':
23            return 7;
24            case 'h':
25            return 8;
26            default:
27        }
28        return 0;
29    }
30}
31
32
33
34
35// class Solution {
36//     public boolean squareIsWhite(String coordinates) {
37//         if(findChar(coordinates.charAt(0))){
38//             boolean flag = false;
39//             for( int i=1;i<=Character.getNumericValue(coordinates.charAt(1));i++){
40//                 if(flag=false){
41//                     flag=true;
42//                 }else{
43//                     flag=false;
44//                 }
45//             }
46//             if(flag==false){
47//                 return false;
48//             }else{
49//                 return true;
50//             }
51//         }else{
52//             boolean flag=true;
53//              for( int i=1;i<=Character.getNumericValue(coordinates.charAt(1));i++){
54//                 if(flag=false){
55//                     flag=true;
56//                 }else{
57//                     flag=false;
58//                 }
59//             }
60//             if(flag==false){
61//                 return true;
62//             }
63//         }
64//         return false;
65//     }
66//     public static boolean findChar(char ch){
67//         switch(ch){
68//             case 'a':
69//             case 'c':
70//             case 'e':
71//             case 'g':
72//             return true;
73//             default:
74//         }
75//         return false;
76//     }
77// }