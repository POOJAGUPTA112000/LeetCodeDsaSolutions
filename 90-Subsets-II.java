class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list =new ArrayList<>();
        callfun(0,nums,list,new ArrayList<>());
        return list;
    }
    void callfun(int i,int [] nums ,List<List<Integer>> list , List<Integer> ds){
        list.add(new ArrayList<>(ds));
        for( int j=i ; j<nums.length; j++){
            if(j>i && nums[j]==nums[j-1]) continue;
            ds.add(nums[j]);
            callfun(j+1,nums,list,ds);
            ds.remove(ds.size()-1);
            // callfun(j+1,nums,list,ds);
        }
        
    }
}