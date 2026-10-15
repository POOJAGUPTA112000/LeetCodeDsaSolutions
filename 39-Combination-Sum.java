class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if(candidates.length<=1 && candidates[0]>target){
            return new ArrayList<>();
        }
        List<List<Integer>> list = new ArrayList<>();
        // List<Integer> nums= new ArrayList<>();
        callfun(0,target,candidates.length,candidates,new ArrayList<>(),list);
        return list;
    }
    void callfun(int i, int target, int N , int [] candidates, List<Integer> arr ,List<List<Integer>> list){
        if(i==N){
            if(target==0){    
                System.out.println(arr);
                list.add(new ArrayList<>(arr));
            }
            return ;
        }
        if(candidates[i]<=target){
        arr.add(candidates[i]);
        System.out.println(arr);
        // sum+=candidates[i];
        callfun(i,target-candidates[i],N,candidates,arr,list);
        arr.remove(arr.size()-1);
        // sum-=candidates[i];
        }
        callfun(i+1,target,N,candidates,arr,list);
    }
}