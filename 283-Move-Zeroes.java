class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length==1){
            return ;
        }
        int j=0;
        for( int i=j+1;i<nums.length;i++){
            if(nums[j]==0 && nums[i]!=0){
                nums[j]=nums[i];
                nums[i]=0;
                j++;
            }else{
                if(nums[j]!=0){
                    j++;
                }
            }
        }
        // return nums;
    }
}