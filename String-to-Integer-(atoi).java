1class Solution {
2    public int myAtoi(String s) {
3        int num=0;
4        int sing =1;
5        s = s.trim();
6        for( int i=0;i<=s.length()-1;i++){
7            if(s.charAt(i)==' ' || s.charAt(i)=='.'){
8                break;
9            }else{
10                if(i==0 && (s.charAt(i)=='-' || s.charAt(i)=='+')){
11                    if(s.charAt(i)=='+'){
12                        sing=1;
13                    }else{
14                        sing= -1;
15                    }
16                }else{
17                    if(!Character.isDigit(s.charAt(i))){
18                        break;
19                    }else{
20                        int digit = s.charAt(i)-'0';
21                        // Integer.max > num*10+digit
22                        if(num>(Integer.MAX_VALUE-digit)/10){
23                            return sing==1?Integer.MAX_VALUE:Integer.MIN_VALUE; 
24                        }
25                        num=num*10+digit;
26                    }
27                }
28            }
29        }
30        return num*sing;
31
32    }
33}
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
75// class Solution {
76//     public int myAtoi(String str) {
77//         int num=0;
78//         int c=1;
79//         String s =str.trim();
80//         for( int i=0;i<=s.length()-1;i++){
81//             if(s.charAt(i)==' ' || s.charAt(i)=='.'){
82//                 break;
83//             }
84//             if(i==0 && (s.charAt(i)=='+' || s.charAt(i)=='-')){
85//                 if(s.charAt(i)=='-'){
86//                     c=-1;
87//                 }else{
88//                     c=1;
89//                 }
90//                 continue;
91//             }else{
92//                 if(s.charAt(i)=='+' || s.charAt(i)=='-'){
93//                     break;
94//                 }else{
95//                     if(!Character.isDigit(s.charAt(i))){
96//                         break;
97//                     }else{
98//                         int digit = s.charAt(i)-'0';
99//                         //  we are doing this as need to check num is in int limits
100//                         // Integer.MAX_VAlUE > num*10+digit
101//                         // so integer.MAX_VALUE-digit>=num*10;
102//                         // num>(Integer.MAX_VALUE-digit)/10;
103//                         if (num > (Integer.MAX_VALUE - digit) / 10) {
104//                             return c == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
105//                         }
106//                         num=num*10+digit;
107//                     }
108//                 }
109//             }
110//         }
111//         return c*num;
112//     }
113// }