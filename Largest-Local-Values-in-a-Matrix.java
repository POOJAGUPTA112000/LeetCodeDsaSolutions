class Solution {
    public int[][] largestLocal(int[][] grid) {
        int [][] arr =new int [grid.length-2][grid.length-2];

        for( int i=0;i<grid.length-2;i++){
            for( int j=0;j<grid.length-2;j++){
                int m=0;
                for(int k=i;k<i+3;k++){
                    for(int l=j;l<j+3;l++){
                        m=Math.max(m,grid[k][l]);
                    }
                }
                arr[i][j]=m;
            }
        }
        return arr;
    }
}