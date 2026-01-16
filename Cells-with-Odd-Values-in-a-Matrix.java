1class Solution {
2    public int oddCells(int m, int n, int[][] indices) {
3        int arr [][] =new int [m][n];
4        for(int i=0;i<=indices.length-1;i++){
5            int row = indices[i][0]; //0
6            int col = indices[i][1];  //1
7            // for whole row
8            for( int j=0;j<=arr[row].length-1;j++){
9                arr[row][j]+=1;
10                // arr[j][col]+=1;
11            }
12            for( int j=0;j<=arr.length-1;j++){
13                arr[j][col]+=1;
14            }
15        }
16        int count=0;
17        for( int i=0;i<=arr.length-1;i++){
18            for( int j=0;j<=arr[i].length-1;j++){
19                if(arr[i][j]%2!=0){
20                    count++;
21                }
22            }
23        }
24        return count;
25    }
26}