class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        // list.add(new ArrayList<>([]));
        callfun(0,nums,list,new ArrayList<>());
        return list;
    }
    void callfun(int i,int [] arr, List<List<Integer>> list, List<Integer> ds){
        if(i==arr.length){
            // System.out.println(ds);
            list.add(new ArrayList<>(ds));
            return;
        }
        ds.add(arr[i]);
        callfun(i+1,arr,list,ds);
        ds.remove(ds.size()-1);
        callfun(i+1,arr,list,ds);
    }
}