class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> list =new ArrayList<>();
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        for( int i=0;i<nums.length-2;i++){
            if(i>0 && (nums[i]==nums[i-1])){
                continue;
            }
            int j=i+1;
            int k=nums.length-1;
            int sum=0;
            while(j<k){
                sum=(nums[i]+nums[k]+nums[j]);
                // System.out.println(nums[i]+" "+nums[j]+" "+nums[k]+" = "+sum);
                if(sum==0){
                    ArrayList<Integer> a = new ArrayList<>();
                    a.add(nums[i]);
                    a.add(nums[j]);
                    a.add(nums[k]);
                    list.add(a);   
                    j++; 
                    k--;
                while((j<k && nums[j]==nums[j-1])){
                    j++;
                }
                while((k>j && nums[k]==nums[k+1])){
                    k--;
                }
                }else{
                    if(sum>0){
                        k--;
                    }else{
                        j++;
                    }
                }

            }
        }
        return list;
    }
}