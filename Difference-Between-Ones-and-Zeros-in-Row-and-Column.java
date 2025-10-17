class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[] rowOnes = new int[m];
        int[] colOnes = new int[n];

        // count ones in each row
        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) sum++;
            }
            rowOnes[i] = sum;
        }

        // count ones in each column
        for (int j = 0; j < n; j++) {
            int sum = 0;
            for (int i = 0; i < m; i++) {
                if (grid[i][j] == 1) sum++;
            }
            colOnes[j] = sum;
        }

        int[][] res = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // ones in row + ones in col - zeros in row - zeros in col
                // zeros in row = n - rowOnes[i]
                // zeros in col = m - colOnes[j]
                res[i][j] = rowOnes[i] + colOnes[j] - (n - rowOnes[i]) - (m - colOnes[j]);
            }
        }
        return res;
    }
}














// class Solution {
//     public int[][] onesMinusZeros(int[][] grid) {
//         int onerow [] =new int [grid.length];
//         int onecol [] = new int [grid[0].length];
//         for( int i=0;i<=grid.length-1;i++){
//             int sum=0;
//             for( int j=0;j<=grid[i].length-1;j++){
//                 if(grid[i][j]==1){
//                     sum+=1;
//                 }
//             }
//             onerow[i]=sum;
//             sum=0;
//             for(int j=0;j<=grid.length-1;j++){
//                 if(grid[j][i]==1){
//                     sum+=1;
//                 }
//             }
//             onecol[i]=sum;
//         }
//         System.out.println(Arrays.toString(onerow));
//         System.out.println(Arrays.toString(onecol));
//         int [][] newg = new int [grid.length][grid[0].length];
//         for( int i=0;i<=grid.length-1;i++){
//             for( int j=0;j<=grid[i].length-1;j++){
//                 newg[i][j]=onerow[i] + onecol[j] - (grid.length-onerow[i])-(grid[i].length-onecol[j]);
//                 System.out.println(onerow[i]+ " "  + onecol[j]+ " " +  (grid.length-onerow[i]) + " " +(grid[i].length-onecol[j]));
//             }
//         }
//         return newg;

//     }
// }













// // for( int i=0;i<=grid.length-1;i++){
// //             int sum=0;
// //             for( int j=0;j<=grid[i].length-1;j++){
// //                 if(grid[i][j]==1){
// //                     sum+=1;
// //                 }
// //             }
// //             onerow[i]=sum;
// //             sum=0;
// //             for( int j=0;j<=grid.length-1;j++){
// //                 if(grid[j][i]==1){
// //                     sum+=1;
// //                 }
// //             }
// //             onecol[i]=sum;            
// //         } 



























// // class Solution {
// //     public int[][] onesMinusZeros(int[][] grid) {
// //         int [][] arr =new int [grid.length][grid[0].length];
// //         for( int i=0;i<=grid.length-1;i++){
// //             for( int j=0;j<=grid[i].length-1;j++){
// //                 int sum=0;
// //                 for( int k=0;k<=grid[i].length-1;k++){
// //                         if(grid[i][k]==1){
// //                             sum+=1;
// //                         }else{
// //                             sum-=1;
// //                         }
// //                 }
// //                 for( int k=0;k<=grid.length-1;k++){
// //                         if(grid[k][j]==1){
// //                             sum+=1;
// //                         }else{
// //                             sum-=1;
// //                         }
// //                 }
// //                 arr[i][j]=sum;
// //                 // int diff = onerow()
// //             }
// //         }
// //         // for( int i=0;i<=grid.length-1;i++){
// //         //     for( int j=0;j<=grid.length-1;j++){
// //         //         System.out.print(arr[i][j]+" ");
// //         //     }
// //         //     System.out.println();
// //         // }
// //         return arr;
// //     }
   
// // }