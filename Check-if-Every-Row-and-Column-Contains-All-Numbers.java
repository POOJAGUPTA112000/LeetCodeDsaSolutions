1class Solution {
2    public boolean checkValid(int[][] matrix) {
3        // boolean flag=true;
4        // HashTable<Integer,Integer> map=new HashMap<>();
5        // for( int i=0;i<=matrix.length-1;i++){
6        //     for( int j=0;j<=matrix[i].length=1;j++){
7        //         map.put(matrix[i][j],map.getOrDefault(map[i][j],0)+1);
8        //         if(map.get(matrix[i][j]))
9        //     }
10        // }
11        for(int i=0;i<=matrix.length-1;i++){
12            HashSet<Integer> set1 =new HashSet<>();
13            HashSet<Integer> set2 =new HashSet<>();
14            for( int j=0;j<=matrix[i].length-1;j++){
15                if(set1.contains(matrix[i][j])){
16                    return false;
17                }else{
18                    set1.add(matrix[i][j]);
19                }
20                if(set2.contains(matrix[j][i])){
21                    return false;
22                }else{
23                    set2.add(matrix[j][i]);
24                }
25            }
26            if(set1.size()!=matrix.length){
27                return false;
28            }
29        }
30        return true;
31    }
32}