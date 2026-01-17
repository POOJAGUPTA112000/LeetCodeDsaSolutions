1class Solution {
2    public int maxDistance(int[] colors) {
3        int m=0;
4        for( int i=0;i<colors.length-1;i++){
5            for( int j=i+1;j<=colors.length-1;j++){
6                if(colors[i]!=colors[j]){
7                    m = Math.max(m, Math.abs(i-j));
8                }
9            }
10        }
11        return m;
12    }
13}