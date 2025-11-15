class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int count=0;
        for(int i : fruits){
            int min=Integer.MAX_VALUE;
            int p=-1;
            for( int j=0;j<=baskets.length-1;j++){
                if(baskets[j]==0){
                    continue;
                }
                if(i<=baskets[j] && min>baskets[j]){
                    min=baskets[j];
                    p=j;
                    break;
                }
            }
            if(p!=-1){
                baskets[p]=0;
            } else{
                count++;
            }           
        }
        return count;
    }
}