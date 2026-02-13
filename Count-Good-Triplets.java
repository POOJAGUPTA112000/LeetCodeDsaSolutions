1class Solution {
2    public int countGoodTriplets(int[] arr, int a, int b, int c) {
3        int count=0;
4        for( int i=0;i<=arr.length-3;i++){
5            for( int j=i+1;j<=arr.length-2;j++){
6                for( int k=j+1;k<=arr.length-1;k++){
7                    if(Math.abs(arr[i]-arr[j])<=a && Math.abs(arr[j]-arr[k])<=b && Math.abs(arr[i]-arr[k])<=c){
8                        count++;
9                    }
10                }
11            }
12        }
13        return count;
14    }
15}