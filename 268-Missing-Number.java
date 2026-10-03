class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int len=nums.length;
        int [] n =new int[len];
        for(int i=0;i<=len-1;i++){
            n[i]=i;
        }
        
        if(nums[nums.length-1] != nums.length){
            return nums.length;
        }

        for(int i=0;i<=len-1;i++){
            if(nums[i]!=n[i]){
                return n[i];
            }
        
           
        }
        
        return 1;
        }
        
    }
