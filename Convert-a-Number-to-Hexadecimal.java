1class Solution {
2    public String toHex(int n) {
3        if(n==0)return "0";
4        
5        long  num = n & 0xffffffffL;
6        StringBuilder str =new StringBuilder("");
7        while(num>=16){
8            str.append(callfun((int)(num%16)));
9            num=num/16;
10        }
11        str.append(callfun((int)num));
12        return str.reverse().toString();
13    }
14    public String callfun(int val){
15        if(val<10){
16            return val+"";
17        }
18        switch(val){
19            case 10 :
20             return "a";
21            case 11 :
22            return "b" ;
23            case 12 :
24            return "c";
25            case 13 :
26            return "d";
27            case 14:
28            return "e";
29            case 15:
30            return "f";
31        }
32        return "non";
33    }
34
35}