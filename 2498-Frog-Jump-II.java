class Solution {
    public int maxJump(int[] stones) {
        int max_cost=0;
        if(stones.length==2){
            return Math.abs(stones[0]-stones[1]);
        }
        int i=0;

        if(stones.length%2==0){
            for( i=0;i<stones.length && i+2 <stones.length;i+=2){
                max_cost=Math.max(max_cost, Math.abs(stones[i]-stones[i+2]));
            }
            if(i==stones.length){
                max_cost=Math.max(max_cost, Math.abs(stones[stones.length-1] - stones[stones.length-2]));
            }
            // max_cost=Math.max(max_cost,stones[0]-stones[1])
            for(i=stones.length-1 ; i>=0 && i-2 >=0;i-=2){
                max_cost=Math.max(max_cost, Math.abs(stones[i] -stones[i-2]));
            }
            if(i==-1){
                max_cost=Math.max(max_cost, Math.abs(stones[1] -stones[0]));
            }
        }else{
            for( i=0;i< stones.length && i+2 < stones.length ;i+=2){
                max_cost=Math.max(max_cost, Math.abs(stones[i] - stones[i+2]));
            }
            max_cost=Math.max(max_cost, Math.abs(stones[stones.length-1] - stones[stones.length-2]));

            for(i=stones.length-2 ; i>=0 && i-2 >=0 ;i-=2){
                max_cost=Math.max(max_cost, Math.abs(stones[i] - stones[i-2]));
            }
            if(i==-1){
                max_cost=Math.max(max_cost, Math.abs(stones[1] - stones[0]));
            }
        }
        return max_cost;

    }
}