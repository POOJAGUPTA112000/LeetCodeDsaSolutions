class Solution {
    public int fib(int n) {
        int k=n;
        int [] dp= new int [k+1];
        Arrays.fill(dp,-1);
        return call(dp,n);
    }
    int call(int [] dp ,int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n]=call(dp,n-1)+call(dp,n-2);
        return dp[n];
    }
}



// class Solution {
//     public int fib(int n) {
//         int a=0;
//         int b=1;
//     }
//     public int fibo(int a,int b ,int n){
//         if(n==0){
//             return a+b;
//         }
//         b = a+b;
//         a = b-a;
//     }
// }