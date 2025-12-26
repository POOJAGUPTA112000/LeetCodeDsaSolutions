1class Solution {
2    public boolean isPrefixString(String s, String[] words) {
3       StringBuilder str =new StringBuilder("");
4    //    int num=0;
5        for( String i : words){
6            str.append(i);
7            // System.out.println(str);
8            if(s.equals(str.toString())){
9                return true;
10            }
11            if(str.toString().length()>s.length()){
12                return false;
13            }
14        }
15
16        return false;
17    }
18}
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
53// int num=s.length();
54//         StringBuilder str = new StringBuilder("");
55//         for(int i=0;i<=s.length()-1;i++){
56//             if(num==0){
57//                 break;
58//             }
59//                 num-=words[i].length();
60//                 str.append(words[i]);
61//         }
62//         if(str.toString().equals(s)){
63//             return true;
64//         }
65//         return false;