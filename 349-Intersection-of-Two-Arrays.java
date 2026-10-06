class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set =new HashSet<>();
        for(int i : nums1){
            set.add(i);
        }
        for(int i: nums2){
            if(set.contains(i) && !list.contains(i)){
                list.add(i);
            }
        }
        System.out.println(list.toString());
        int [] arr = new int [list.size()];
        for( int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}