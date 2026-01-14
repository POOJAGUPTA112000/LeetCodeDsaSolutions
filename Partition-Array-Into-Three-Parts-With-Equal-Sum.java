1class Solution {
2    public boolean canThreePartsEqualSum(int[] arr) {
3        int sum=0;
4        for( int i : arr){
5            sum+=i;
6        }
7        if(sum%3!=0){
8            return false;
9        }
10        int j=0;
11        int count=0;
12        for( int i : arr){
13            j+=i;
14            if(j==(sum/3)){
15                count++;
16                j=0;
17            }
18        }
19        if(count>=3){
20            return true;
21        }
22        return false;
23    }
24}