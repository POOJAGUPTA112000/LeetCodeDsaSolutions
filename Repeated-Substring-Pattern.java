1class Solution {
2    public boolean repeatedSubstringPattern(String s) {
3        if(s.length()==1){
4            return false;
5        }
6        if(s.length()==2){
7            if(s.charAt(0)==s.charAt(1)){
8                return true;
9            }
10            return false;
11        }
12        StringBuilder str = new StringBuilder("");
13        for( int i=0;i<=s.length()/2;i++){
14            str.append(s.charAt(i));
15            String snew = s.substring(i+1) + str.toString();
16            // System.out.println(snew+" " + s);
17            if(snew.equals(s)){
18                return true;
19            }else{
20
21            }
22        }
23        return false;
24    }
25}
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
70// class Solution {
71//     public boolean repeatedSubstringPattern(String s) {
72//         if(s.length()==1){
73//             return false;
74//         }
75//         StringBuilder str =new StringBuilder("");
76//         for(int i=0;i<=s.length()-1;i++){
77//             str.append(s.charAt(i));
78//             boolean flag=true;
79//             for(int j=i+1;j<=s.length()-1-str.length();j+=str.toString().length()){
80//                 System.out.println(str.toString() +" "+ s.substring(j,j+str.length()));
81//                 if(str.toString().equals(s.substring(j,j+str.length()))){
82//                    ch // System.out.println(str.toString() +" "+ s.substring(j,j+str.length()-1));
83//                     continue;
84//                 }else{
85//                     flag=!flag;
86//                     break;
87//                 }
88//             }
89//             if(flag==true){
90//                 return true;
91//             }
92//         }
93//         return false;
94        
95//         // str.append(charAt(left));
96//         // if(s.length()<=2){
97//         //     return false;
98//         // }
99//         // int left=0;
100//         // for( int i=1;i<=s.length()-1;i++){
101//         //     // str.append(s.charAt(i));
102//         //     if(s.substring(i+1).contains(s.substring(left,i+1)) && (i-left+1)>=2){
103//         //         return true;
104//         //     }else{
105//         //         left++;
106//         //     }
107//         // }
108//         // return false;
109//     }
110// }