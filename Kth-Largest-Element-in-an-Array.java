class Solution {
    public int findKthLargest(int[] num, int k) {
        int count=1;
        // ArrayList<Integer> nums =new ArrayList<>(Arrays.asList(num));
        // while(count<=k){
        //     int max=Integer.MIN_VALUE;
        //     int index = 0;
        //     for( int  i =0;i<nums.size();i++){
        //         if(nums[i]>max){
        //             max=nums[i];
        //             index=i;
        //         }
        //     }
        //     nums[index]=0;
        // }
        // return 0;
        Arrays.sort(num);
        return num[num.length-k];
    }
}