class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> list =new HashSet<>();
        callfun(0,nums,list,new ArrayList<>());
        return new ArrayList<>(list);
    }
    void callfun(int i,int [] nums ,Set<List<Integer>> list , List<Integer> ds){
        if(i==nums.length){
            list.add(new ArrayList<>(ds));
            return;
        }
        ds.add(nums[i]);
        callfun(i+1,nums,list,ds);
        ds.remove(ds.size()-1);
        callfun(i+1,nums,list,ds);
    }
}