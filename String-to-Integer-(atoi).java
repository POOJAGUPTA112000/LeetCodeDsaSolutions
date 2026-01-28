1class Solution {
2    public int myAtoi(String str) {
3        int num=0;
4        int c=1;
5        String s =str.trim();
6        for( int i=0;i<=s.length()-1;i++){
7            if(s.charAt(i)==' ' || s.charAt(i)=='.'){
8                break;
9            }
10            if(i==0 && (s.charAt(i)=='+' || s.charAt(i)=='-')){
11                if(s.charAt(i)=='-'){
12                    c=-1;
13                }else{
14                    c=1;
15                }
16                continue;
17            }else{
18                if(s.charAt(i)=='+' || s.charAt(i)=='-'){
19                    break;
20                }else{
21                    if(!Character.isDigit(s.charAt(i))){
22                        break;
23                    }else{
24                        int digit = s.charAt(i)-'0';
25                        if (num > (Integer.MAX_VALUE - digit) / 10) {
26                            return c == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
27                        }
28                        num=num*10+digit;
29                    }
30                }
31            }
32        }
33        return c*num;
34    }
35}