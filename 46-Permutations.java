class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list =new ArrayList<>();
        callfun(0,nums,list);
        return list;
    }
    void callfun(int i , int [] nums ,List<List<Integer>> list){
        if(i==nums.length){
            List<Integer> p = new ArrayList<>();
            for( int k :nums){
                p.add(k);
            }
            list.add(new ArrayList<>(p));
            return;
        }
        for( int j=i; j<nums.length ;j++){
            swap(nums,j,i);
            callfun(i+1,nums,list);
            swap(nums,j,i);
        }
    }
    void swap (int [] nums , int a, int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}









// class Solution {
//     public List<List<Integer>> permute(int[] nums) {
//         List<List<Integer> > list = new ArrayList<>();
//         boolean map [] = new boolean [nums.length];
//         callfun(0,nums,list,new ArrayList<>(),map);
//         return list;
//     }
//     void callfun( int i, int [] nums ,List<List<Integer>> list , List<Integer> ds,boolean [] map){
//         if(ds.size()==nums.length){
//             list.add(new ArrayList<>(ds));
//             return;
//         }
//         for( int j = 0 ; j<nums.length ; j++){
//             if(!map[j]){
//                 map[j]=true;
//                 ds.add(nums[j]);
//                 callfun(j+1,nums,list,ds,map);
//                 ds.remove(ds.size()-1);
//                 map[j]=false;
//             }
//         }
//     }
// }