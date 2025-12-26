1class Solution {
2    public boolean threeConsecutiveOdds(int[] arr) {
3        for( int i=1;i<arr.length-1;i++){
4            if(arr[i-1]%2!=0 && arr[i]%2!=0 && arr[i+1]%2!=0){
5                return true;
6            }
7        }
8        return false;
9    }
10}