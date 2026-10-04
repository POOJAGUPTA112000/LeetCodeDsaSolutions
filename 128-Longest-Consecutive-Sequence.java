class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int mlen=1;
       HashSet<Integer> set = new HashSet<>();
       for( int i: nums){
        set.add(i);
       }
        for( Integer i: set ){
            if(!set.contains(i-1)){
                int count=1;
                int n= (int)i;
                while(set.contains(n+1)){
                    count++;
                    n++;
                }
                mlen=Math.max(mlen,count);
            }
        } 
        return mlen;
    }
    // int callthat(Set<Integer> s , int n){
    //     if(!s.contains(n)){
    //         return 0;
    //     }
    //     return 1+callthat(s,n+1);
    //     // return c;
    // }
}