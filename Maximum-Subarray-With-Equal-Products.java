1class Solution {
2    public int maxLength(int[] nums) {
3        int count=1;
4        for( int i=0;i<nums.length-1;i++){
5            int p=1;
6            int g=0;
7            int l=1;
8            int ans=nums[0];
9            for( int j=i;j<nums.length;j++){
10                p*=nums[j];
11                g=(g==0)? nums[j]:gcd(g,nums[j]);
12                l=lcm(l,nums[j]);
13                if(p==g*l){
14                    count=Math.max(count,j-i+1);
15                }
16            }
17        }
18        return count;
19    }
20
21    public int gcd(int a,int b){
22        return b==0 ? a : gcd(b, a%b);
23    }
24    public int lcm (int a,int b){
25        int gc = gcd(a,b);
26        return a*b/gc;
27    }
28}