1class Solution {
2    public int distributeCandies(int[] candyType) {
3        HashMap<Integer,Integer> map =new HashMap<>();
4        for( int i : candyType){
5            map.put(i,map.getOrDefault(i,0)+1);
6        }
7        if(map.size()<candyType.length/2){
8            return map.size();
9        }
10        return candyType.length/2;
11    }
12}