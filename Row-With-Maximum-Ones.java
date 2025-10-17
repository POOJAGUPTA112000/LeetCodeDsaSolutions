class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int num=0;
        int count1=Integer.MIN_VALUE;
        for(int i=0;i<=mat.length-1;i++){
            int count=0;
            for( int j=0;j<=mat[i].length-1;j++){
                if(mat[i][j]==1){
                    count++;
                }
            }
            if(count1<count){
                count1=count;
                num=i;
            }
            // System.out.println(i+" " +num+" " + count1 +" " +count);
        }
        int arr []=new int[2];
        arr[0]=num;
        arr[1]=count1;
        return arr;
    }
}