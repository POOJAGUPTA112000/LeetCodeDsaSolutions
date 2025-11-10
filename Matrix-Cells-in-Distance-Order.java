class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int [] [] arr =new int [rows*cols][3];
        int k=0;
        for( int i=0;i<rows;i++){
            for( int j=0;j<cols;j++){
                arr[k][0]=Math.abs(i-rCenter) + Math.abs(j-cCenter);
                arr[k][1]=i;
                arr[k][2]=j;
                k++;
            }
        }
        for( int i=0;i<=arr.length-2;i++){
            for( int j=i+1;j<=arr.length-1;j++){
                if(arr[i][0]>arr[j][0]){
                    k=arr[i][0];
                    arr[i][0]=arr[j][0];
                    arr[j][0]=k;
                    k=arr[i][1];
                    arr[i][1]=arr[j][1];
                    arr[j][1]=k;
                     k=arr[i][2];
                    arr[i][2]=arr[j][2];
                    arr[j][2]=k;
                }
            }
        }
        int [][] mat=new int [arr.length][2];
        for( int i=0;i<=mat.length-1;i++){
            mat[i][0]=arr[i][1];
            mat[i][1]=arr[i][2];            
        }
        return mat;
    }
}