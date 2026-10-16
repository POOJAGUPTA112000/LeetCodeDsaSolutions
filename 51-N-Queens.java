import java.util.*;
class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> str = new ArrayList<>();
        if(n==2 || n==3){
            return str;
        }
        if(n==1){
           List<String> s = new ArrayList<>();
           s.add("Q");
          str.add(new ArrayList<>(s));
          return str;
        }
        char [][] ds = new char [n][n];
        for( int i=0;i<n;i++){
           Arrays.fill(ds[i],'.');
        }
        callfun(0,n,str,ds);
        return str;
    }
    static void callfun(int col ,int n,List<List<String >> list,char [][] queen){
        if(col==n){
            List<String> s =new ArrayList<>();
            for(int k=0;k<queen.length;k++){
                s.add(new String(queen[k]));
            }
            list.add(new ArrayList<>(s));
            return;
        }
        // col=0,1,2,3,4
        for( int row=0;row<n;row++){
            if(isSafe(row,col,queen)){
                queen[row][col]='Q';
                callfun(col+1,n,list,queen);
                queen[row][col]='.';
            }
        }
    }
    static boolean isSafe(int row,int col,char [][] queen){
        // for upward direction;
        int r=row;
        int c=col;
        while(r>=0 && c>=0){
            if(queen[r][c]==('Q')) return false;
            r--;
            c--;
        }
        // for left;
        for(int left = col;left>=0;left--){
            if(queen[row][left] ==('Q')) return false;
        }
        r=row;
        c=col;
        // for downwards
        while(r<queen.length && c>=0){
            if(queen[r][c]==('Q')) return false;
            r++;
            c--;
        }
        return true;        
    }
}