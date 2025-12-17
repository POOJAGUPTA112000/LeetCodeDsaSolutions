1class Solution {
2    public int repeatedNTimes(int[] nums) {
3        HashMap<Integer,Integer> map =new HashMap<>();
4        for( int i : nums){
5            map.put(i,map.getOrDefault(i,0)+1);
6        }
7        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
8            if(entry.getValue()>=(nums.length/2)){
9                return entry.getKey();
10            }
11        }
12        return 1;
13    }
14}