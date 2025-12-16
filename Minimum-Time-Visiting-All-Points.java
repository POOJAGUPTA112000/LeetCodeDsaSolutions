1class Solution {
2    public int minTimeToVisitAllPoints(int[][] points) {
3        int count=0;
4        for( int i=1;i<=points.length-1;i++){
5            count+=Math.max(Math.abs(points[i-1][0]-points[i][0]),Math.abs(points[i-1][1]-points[i][1]));
6        }
7        return count;
8    }
9}