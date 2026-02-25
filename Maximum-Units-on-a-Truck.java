1class Solution {
2    public int maximumUnits(int[][] boxTypes, int truckSize) {
3        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
4        int total=0;
5        for( int i=0;i<=boxTypes.length-1;i++){
6            int boxT=boxTypes[i][0];
7            int boxCount = boxTypes[i][1];
8            int ad = Math.min(boxT,truckSize);
9            total+=ad*boxCount;
10            truckSize-=ad;
11            if(truckSize==0){
12                break;
13            }
14        }
15        return total;
16    }
17}