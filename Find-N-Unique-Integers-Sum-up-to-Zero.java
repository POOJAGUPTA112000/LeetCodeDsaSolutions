1class Solution {
2    public int[] sumZero(int n) {
3        if(n==1){
4            int [] arr ={0};
5            return arr;
6        }
7        int [] arr =new int [n];
8        int index =0;
9        for(int i=n/2;i>0;i--){
10            arr[index]=-i;
11            arr[arr.length-1-index]=i;
12            index++;    
13        }
14        if(n%2!=0){
15            arr[index]=0;
16        }
17        return arr;
18    }
19}