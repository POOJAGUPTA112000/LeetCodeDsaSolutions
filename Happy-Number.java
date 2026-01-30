1class Solution {
2    public boolean isHappy(int n) {
3        int slow=n;
4        int fast=n;
5        do{
6            slow=sumSq(slow);
7            fast=sumSq(sumSq(fast));
8        }while(slow!=fast);
9        if(slow==1){
10            return true;
11        }
12        return false;
13    }
14    public int sumSq( int num){
15        int sum=0;
16        while(num!=0){
17            sum+=Math.pow(num%10,2);
18            num=num/10;
19        }
20        return sum;
21    }    
22}