1class Solution {
2    public int countTriples(int n) {
3    int count=0;
4    for( int i=1;i<=n;i++){
5        for( int j=1;j<=n;j++){
6            for( int k=n;k>=0;k--){
7            if(i*i + j*j == k*k && i!=j){
8                count++;
9            }
10            }
11        }
12    }
13    return count;
14    }
15}