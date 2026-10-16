class Solution {
    public void solveSudoku(char[][] board) {
        callfun(board);
    }
    static boolean callfun(char [] [] board){
         for( int row=0 ; row <board.length;row++){   
            for( int col=0;col<board[0].length;col++){
                if(board[row][col]==('.')){
                    for( int i=1;i<=9;i++){
                        if(isSafe(row,col,board,(char)(i+'0'))){
                            board[row][col]=(char) (i+'0');
                            // System.out.println(board[row][col]+" "+row+" " +col);
                            if(callfun(board)==true) return true;
                            else board[row][col]='.';
                        }
                    }
                    return false;
                }
                // return false;
            }
        }    
        return true;
    }
    static boolean isSafe(int row,int col,char [] [] board, char val){
        for( int i=0;i<9;i++){
            if(board[i][col]==val) return false;
            if(board[row][i] == val ) return false;
            if(board[3*(row/3) + i/3 ] [3 *(col/3) + i%3] == val)return false;
        }
        return true;
    }
}