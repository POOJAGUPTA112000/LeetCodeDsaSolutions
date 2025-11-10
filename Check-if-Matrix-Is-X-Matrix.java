class Solution {
    public boolean checkXMatrix(int[][] grid) {
        boolean flag =true;
        for( int i=0;i<=grid.length-1;i++){
            for( int j=0;j<=grid[i].length-1;j++){
                if(i==j || i==grid.length-1-j){
                    if(grid[i][j]<=0){
                        flag=false;
                        return flag;
                    }
                }else{
                    if(grid[i][j]!=0){
                        flag=false;
                        return flag;
                    }
                }
            }
        }
        return flag;
    }
}