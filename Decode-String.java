1class Solution {
2    public String decodeString(String s) {
3        Stack<Integer> snum = new Stack<>();
4        Stack<StringBuilder> sstr = new Stack<>();
5        int curr =0;
6        StringBuilder cstr = new StringBuilder("");
7        for( char c : s.toCharArray()){
8            if(Character.isDigit(c)){
9                curr=curr*10+(c-'0');
10            }else{
11                if(c=='['){
12                    snum.push(curr);
13                    sstr.push(cstr);
14                    curr=0;
15                    cstr=new StringBuilder("");
16                }else{
17                    if(c==']'){
18                        int repeat = snum.pop();
19                        StringBuilder prev = sstr.pop();
20                        for( int i=0;i<repeat;i++){
21                            prev.append(cstr);
22                        }
23                        cstr = prev;
24                    }else{
25                        cstr.append(c);
26                    }
27                    
28                }
29            }
30        }
31        return cstr.toString();
32
33    }
34}