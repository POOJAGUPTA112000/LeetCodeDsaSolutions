class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> arr =new ArrayList<>();
        for(int i=0;i<=nums.length-1;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int size=nums.length/3;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()>size){
                arr.add(entry.getKey());
            }
        }
        return arr;
    }
}