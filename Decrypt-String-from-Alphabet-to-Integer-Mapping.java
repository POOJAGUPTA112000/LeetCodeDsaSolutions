1class Solution {
2    public String freqAlphabets(String s) {
3     StringBuilder str= new StringBuilder("");
4     for( int i=s.length()-1;i>=0;i--){
5        if(s.charAt(i)=='#'){
6            String snew = s.charAt(i-2)+"" + s.charAt(i-1);
7            System.out.println(snew);
8            i-=2;
9            str.append(mapchar(snew));
10        }else{
11            str.append(mapchar(s.charAt(i)+""));
12        }
13      }
14      return str.reverse().toString();
15    }
16    public String mapchar(String s1){
17        int a = Integer.parseInt(s1);
18            switch(a){
19                case 1 :
20                return "a";
21                 case 2:
22                return "b";
23                 case 3:
24                return "c";
25                 case 4:
26                return "d";
27                 case 5:
28                return "e";
29                 case 6:
30                return "f";
31                 case 7:
32                return "g";
33                 case 8:
34                return "h";
35                 case 9:
36                return "i";
37                case 10: return "j"; 
38                case 11: return "k"; 
39                case 12: return "l"; 
40                case 13: return "m"; 
41                case 14: return "n"; 
42                case 15: return "o"; 
43                case 16: return "p"; 
44                case 17: return "q"; 
45                case 18: return "r"; 
46                case 19: return "s"; 
47                case 20: return "t"; 
48                case 21: return "u"; 
49                case 22: return "v"; 
50                case 23: return "w"; 
51                case 24: return "x"; 
52                case 25: return "y"; 
53                case 26: return "z";  
54            }
55        return "non";
56    }
57}