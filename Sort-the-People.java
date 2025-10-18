class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        TreeMap<Integer,String> map = new TreeMap<>(Comparator.reverseOrder());
        for( int i=0;i<=names.length-1;i++){
            map.put(heights[i],names[i]);
        }
        // Set<String> sets = map.keySet();
        String [] arr = new String [names.length];
        int i=0;
        for(Map.Entry<Integer,String> entry :map.entrySet()){
            arr[i] = entry.getValue();
            i++;
        }
        return arr;
    }
}