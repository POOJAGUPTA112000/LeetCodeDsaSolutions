class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum=0;
        int count=0;
        for(int i: nums){
            sum+=i;
            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}


// class Solution {
//     public int subarraySum(int[] nums, int k) {
//         // if(k == 0 || nums.length==0){
//         //     return 0;
//         // }
//         int count=0;
//         int sum=0;
//         for(int i=0;i<=nums.length-1;i++){
//             // int sum=0;
//             // for( int j=i;j<=nums.length-1;j++){
//             //     sum=sum+nums[j]; 
//             //     System.out.println(nums[j] +" "+sum+" "+k);
//             //     if(sum==k){
//             //         count++;
//             //     }
//             //     }
//                 sum+=nums[i];
//                 if(sum==k){
//                     count++;
//                     sum=nums[i];
//                 }
//                 if(sum>k){
//                     if((nums[i]-sum)==k){
//                         count++;
//                     }else{
//                         sum=0;
//                         i--;                        
//                     }
//                 }
//             }
//         return count;
//     }
// }
