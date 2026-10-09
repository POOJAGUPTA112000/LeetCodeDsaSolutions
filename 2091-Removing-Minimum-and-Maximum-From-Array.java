class Solution {
    public int minimumDeletions(int[] nums) {
        // int k=nums[0];
        int mi=0;
        int mj=0;
        // int k1=nums[0];
        for( int i=1;i<nums.length;i++){
            if(nums[i]>nums[mi]){
                mi=i;
            }
            if(nums[i]<nums[mj]){
                mj=i;
            }
            
        }
        // int m=Math.min(mi,mj);
        int m1=nums.length-Math.min(mi,mj);
        int m2=Math.max(mi,mj)+1;
        int m3=Math.min(mi,mj)+1+nums.length-Math.max(mi,mj);
        System.out.println(nums[mi]+" "+nums[mj]+" "+mi +" "+ mj +"\n" + m1+" "+m2+" "+m3);
        return Math.min(m1,Math.min(m2,m3));



    }
}
