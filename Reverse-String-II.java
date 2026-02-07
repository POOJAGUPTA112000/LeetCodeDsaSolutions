1class Solution {
2    public String reverseStr(String s, int k) {
3        char ch [] =s.toCharArray();
4        for( int i=0;i<s.length()-1;i=i+2*k){
5            int l=i;
6            int r = Math.min(i+k-1,ch.length-1);
7            while(l<r){
8                char c= ch[l];
9                ch[l]=ch[r];
10                ch[r]=c;
11                l++;
12                r--;
13            }
14        }
15        return new String(ch);
16    }
17}