class Solution {
    public int uniquePathsIII(int[][] grid) {
        int r= grid.length;
        int c= grid[0].length;
        int sr=-1;
        int sc=-1;
        int er=-1;
        int ec=-1;
        int count=0;
        for( int i=0;i<r;i++){
            for( int j=0;j<c;j++){
                if(grid[i][j]!=-1)count++;
                if(grid[i][j]==1){
                    sr=i;
                    sc=j;
                }
                if(grid[i][j]==2){
                    er=i;
                    ec=j;
                }
            }
        }
        // int [][] dp = new int [r][c];
        boolean [][] flag = new boolean[r][c];
        for( int i=0;i<flag.length;i++){
            Arrays.fill(flag[i],false);
        }
        return callfun(sr,sc,er,ec,grid,flag,count);
    }
    public static int callfun(int sr,int sc,int er, int ec, int [][]grid,boolean [][] flag,int count){
        
        if(sr <0 || sc<0 || sr>grid.length-1 || sc> grid[0].length-1) return 0;
        if(grid[sr][sc] ==-1 || flag[sr][sc]) return 0;
        // as we walk on one empty space
            count--;
        if(sr==er && sc==ec){
             return count==0 ? 1 : 0;
        }    
        // at first flag true the point i am standing 
        flag[sr][sc]=true;
        int up=0;
        int down=0;
        int right=0;
        int left=0;
        // down
        if(sr+1<grid.length && !flag[sr+1][sc]){
           up=callfun(sr+1,sc,er,ec,grid,flag,count);
        }
        // up
        if(sr-1>=0 && !flag[sr-1][sc]){
           down=callfun(sr-1,sc,er,ec,grid,flag,count);
        }
        // left
        if(sc-1 >=0 && !flag[sr][sc-1]){
            left=callfun(sr,sc-1,er,ec,grid,flag,count);
        }
        // right
        if(sc+1 < grid[0].length && !flag[sr][sc+1]){
            right=callfun(sr,sc+1,er,ec,grid,flag,count);
        }
        flag[sr][sc]=false;
        return up+down+left+right;
    }
}


















//  if(r==1){
//             int sum=0;
//             for(int i=0;i<c;i++){
//                 sum+=grid[0][c];
//             }
//             return sum;
//         }
//         if(c==1){
//             int sum=0;
//             for(int i=0;i<r;i++){
//                 sum+=grid[i][0];
//             }
//             return sum;
//         }