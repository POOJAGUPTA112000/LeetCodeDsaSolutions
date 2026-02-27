1class Solution {
2    public int[] numberOfLines(int[] widths, String s) {
3        int lines=1;
4        int space=100;
5        for( int i=0;i<=s.length()-1;i++){
6            int v = widths[s.charAt(i)- 'a'];
7            if(v>space){
8                lines++;
9                space=100;
10            }
11            space-=v;
12        }
13        space=100-space;
14        return new int[] {lines,space};
15    }
16}