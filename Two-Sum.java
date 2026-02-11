1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        int [] a =new int [2];
4        HashMap<Integer,List<Integer>> map =new HashMap<>();
5        for( int i=0;i<=nums.length-1;i++){
6            int j=target-nums[i];
7            if(map.containsKey(j)){
8                a[0]=i;
9                a[1]=map.get(j).get(0);
10                return a;
11            }
12            map.computeIfAbsent(nums[i],k -> new ArrayList()).add(i);
13        }
14        
15        return a;
16    }
17}