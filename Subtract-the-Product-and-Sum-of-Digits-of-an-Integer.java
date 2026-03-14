1class Solution {
2    public int subtractProductAndSum(int n) {
3        int sum=0;
4        int pro=1;
5        while(n!=0){
6            sum+=n%10;
7            pro*=n%10;
8            n=n/10;
9        }
10        return pro-sum;
11    }
12}