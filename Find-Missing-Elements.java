1class Solution {
2    public List<Integer> findMissingElements(int[] nums) {
3        List<Integer> arr =new ArrayList<>();
4        int small =Integer.MAX_VALUE;
5        int lar = Integer.MIN_VALUE; 
6        HashSet<Integer> s =new HashSet<>();
7        for( int i : nums){
8            s.add(i);
9            if(i<small){
10                small=i;
11            }
12            if(i>lar){
13                lar=i;
14            }
15        }
16        if(lar-small==nums.length-1){
17            return arr;
18        }
19
20            for(int i=small ;i<=lar;i++){
21            if(!s.contains(i)){
22                arr.add(i);
23            }
24        }
25        return arr;
26    }
27}