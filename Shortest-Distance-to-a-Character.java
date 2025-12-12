1class Solution {
2    public int[] shortestToChar(String s, char c) {
3        int [] arr =new int [s.length()];
4        for( int i=0;i<=s.length()-1;i++){
5            int adis=Integer.MAX_VALUE;
6            for( int j=i;j<=s.length()-1;j++){
7                    if(s.charAt(j)==c){
8                        adis=Math.abs(i-j);
9                        break;
10                    }
11            }
12            int bdis=Integer.MAX_VALUE;
13            for( int j=i;j>=0;j--){
14                 if(s.charAt(j)==c){
15                        bdis=Math.abs(i-j);
16                        break;
17                    }
18            }
19            arr[i]=Math.min(adis,bdis);
20        }
21        return arr;
22    }
23}