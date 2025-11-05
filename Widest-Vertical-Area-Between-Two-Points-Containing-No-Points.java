class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        // int min_dis=Integer.MAX_VALUE;
        // for(int i=0;i<points.length-1;i++){
        //     for( int j=i+1;j<=points.length-1;j++){
        //         if(points[i][0]>=points[j][0]){
        //             int k=points[i][0];
        //             points[i][0]=points[j][0];
        //             points[j][0]=k;
        //             k=points[i][1];
        //             points[i][1]=points[j][1];
        //             points[j][1]=k;
        //         }
        //     }
        // }
         Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));
        int m=0;
        for( int i=1;i<=points.length-1;i++){
            m=Math.max(m,(points[i][0]-points[i-1][0]));
        }
        return m;
    }
}