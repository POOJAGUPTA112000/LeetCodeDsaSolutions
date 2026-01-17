1class Solution {
2    public int maxDistance(int[] colors) {
3        int m1=findhouse(0,colors);
4        int m2=findhouse2(colors.length-1,colors);
5        // for( int i=0;i<colors.length-1/2;i++){
6        //     for( int j=colors.length-1;j>=colors.length/2;j--){
7        //         if(colors[i]!=colors[j]){
8        //             m = Math.max(m, Math.abs(i-j));
9        //         }
10        //     }
11        // }
12        return Math.max(m1,m2);
13    }
14    public static int findhouse( int num, int [] colors){
15        int m=0;
16        for( int i=num+1;i<=colors.length-1;i++){
17            if(colors[num]!=colors[i]){
18                 m = Math.max(m, Math.abs(i-num));
19            }
20        }
21        return m;
22    }
23    public static int findhouse2( int num, int [] colors){
24        int m=0;
25        for( int i=num-1;i>=0;i--){
26            if(colors[num]!=colors[i]){
27                 m = Math.max(m, Math.abs(i-num));
28            }
29        }
30        return m;
31    }
32}