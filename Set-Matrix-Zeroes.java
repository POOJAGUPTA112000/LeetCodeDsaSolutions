1class Solution {
2    public void setZeroes(int[][] matrix) {
3        List<List<Integer>> li = new ArrayList<>();
4        for(int i=0;i<=matrix.length-1;i++){
5            for( int j=0;j<=matrix[i].length-1;j++){
6                ArrayList<Integer> a =new ArrayList<>();
7                if(matrix[i][j]==0){
8                    a.add(i);
9                    a.add(j);
10                    li.add(a);
11                }
12            }
13        }
14        System.out.println(li);
15            for(int i=0;i<=li.size()-1;i++){
16                int r=li.get(i).get(0);
17                int c=li.get(i).get(1);
18
19                for(int j=c;j<=matrix[r].length-1;j++){
20                    matrix[r][j]=0;
21                }
22                for( int j=c;j>=0;j--){
23                     matrix[r][j]=0;
24                }
25                for( int j=r;j<=matrix.length-1;j++){
26                    matrix[j][c]=0;
27                }
28                for( int j=r;j>=0;j--){
29                     matrix[j][c]=0;
30                }
31            }
32    }
33}