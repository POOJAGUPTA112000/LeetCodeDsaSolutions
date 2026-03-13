1class Solution {
2    public boolean backspaceCompare(String s, String t) {
3        Stack<Character> s1 = new Stack<>();
4        Stack<Character> s2 = new Stack<>();
5        // if(s.length()!=t.length()){
6        //     return false;
7        // }
8        for( int i=0;i<=s.length()-1;i++){
9            if(s1.size()>0){
10                if(s.charAt(i)=='#'){
11                    s1.pop();
12                }else{
13                    s1.push(s.charAt(i));
14                }
15            }else{
16                  if(s.charAt(i)=='#'){
17                    continue;
18                }
19                s1.push(s.charAt(i));
20            }
21        }
22        for( int i=0;i<=t.length()-1;i++){
23            if(s2.size()>0){
24                if(t.charAt(i)=='#'){
25                    s2.pop();
26                }else{
27                    s2.push(t.charAt(i));
28                }
29            }else{
30                if(t.charAt(i)=='#'){
31                    continue;
32                }
33                s2.push(t.charAt(i));
34            }
35        }
36        if(s1.size()!=s2.size()){
37            return false;
38        }
39        StringBuilder str1 = new StringBuilder("");
40         StringBuilder str2 = new StringBuilder("");
41         for(Character c : s1){
42            if(c=='#'){
43                continue;
44            }
45            str1.append(c);
46         }
47         for(Character c : s2){
48             if(c=='#'){
49                continue;
50            }
51            str2.append(c);
52         }
53         System.out.println(str1.toString() +" "+str2.toString());
54         return str1.toString().equals(str2.toString());
55    }
56}