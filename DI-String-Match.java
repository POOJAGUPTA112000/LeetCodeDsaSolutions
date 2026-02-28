1class Solution {
2    public int[] diStringMatch(String s) {
3        int m=s.length();
4        int l=0;
5        int j=0;
6        int perm [] = new int [s.length()+1];
7        for( int i=0;i<perm.length-1;i++){
8            if(s.charAt(j)=='I'){
9                perm[i]=l;
10                l++;
11            }else{
12                perm[i]=m;
13                m--;
14            }
15            j++;
16        }
17        perm[j]=(s.charAt(s.length()-1))=='D'?m:l;
18        return perm;
19    }
20}