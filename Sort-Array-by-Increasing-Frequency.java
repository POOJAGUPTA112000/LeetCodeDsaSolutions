1class Solution {
2    public int[] frequencySort(int[] nums) {
3        HashMap<Integer,Integer> map =new HashMap<>();
4        for( int i :  nums){
5            map.put(i,map.getOrDefault(i,0)+1);
6        }
7        int [] arr =new int [nums.length];
8        int j=0;
9        while(j < nums.length){
10            int min =Integer.MAX_VALUE;
11            int key = 0;
12            for(Map.Entry<Integer,Integer> entry: map.entrySet()){
13              if (entry.getValue() < min || (entry.getValue() == min && entry.getKey() > key)) {
14                    min = entry.getValue();
15                    key = entry.getKey();
16                }
17            }
18            for(int k=j;k< min+j;k++){
19                arr[k]=key;
20            }
21            j+=min;
22            map.remove(key);
23        }
24        return arr;
25    }
26}