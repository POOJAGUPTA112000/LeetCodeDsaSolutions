class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashMap<Integer,Integer> map =new HashMap<>();
         int arr []=new int [2];
        for( int i=1;i<=Math.pow(grid.length,2);i++){
            map.put(i,0);
        }
        System.out.println(map);
    //    int k=1;
        for( int i=0;i<=grid.length-1;i++){
            for( int j=0;j<=grid[i].length-1;j++){
                map.put(grid[i][j],map.getOrDefault(grid[i][j],0)+1);
            }
        }
        System.out.println(map);
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
                if(entry.getValue()==2){
                    arr[0]=entry.getKey();
                    continue;
                }
                if(entry.getValue()==0){
                    arr[1]=entry.getKey();
                    continue;
                }
        }
        return arr;
    }
}