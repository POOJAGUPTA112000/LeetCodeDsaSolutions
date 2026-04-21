1class Solution {
2    public boolean findRotation(int[][] mat, int[][] target) {
3        int n=mat.length;
4        for( int i=1;i<=2*n;i++){
5            for( int j=0;j<=mat.length-1;j++){
6                for( int k=j+1;k<=mat[j].length-1;k++){
7                    int a =mat[j][k];
8                    mat[j][k]=mat[k][j];
9                    mat[k][j]=a;
10                }
11            }
12             for( int j=0;j<=mat.length-1;j++){
13                for( int k=0;k<=(mat[j].length-1)/2;k++){
14                    int a =mat[j][k];
15                    mat[j][k]=mat[j][mat[j].length-1-k];
16                  mat[j][mat[j].length-1-k]=a;
17                }
18            }
19            boolean flag=true;
20            ones:
21            for( int j=0;j<=mat.length-1;j++){
22                for( int k=0;k<=mat[j].length-1;k++){
23                   if(mat[j][k]!=target[j][k]){
24                        flag=!flag;
25                        break ones;
26                   }
27                }
28            }
29            if(flag){
30                return true;
31            }
32        }
33        return false;
34    }
35}