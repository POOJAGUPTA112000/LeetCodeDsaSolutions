1class Solution {
2    public int[] intersection(int[] nums1, int[] nums2) {
3        HashMap<Integer,Integer> map1 =new HashMap<>();
4        HashMap<Integer,Integer> map2 = new HashMap<>();
5        if(nums1.length==0 || nums2.length==0){
6            return new int [] {};
7        }
8        for( int i : nums1){
9            map1.put(i,map1.getOrDefault(i,0)+1);
10        }
11        for(int i : nums2){
12            map2.put(i,map2.getOrDefault(i,0)+1);
13        }
14        ArrayList<Integer> arr =new ArrayList<>();
15        for(Map.Entry<Integer,Integer> entry :  map1.entrySet()){
16                if(map2.containsKey(entry.getKey())){
17                    // int a =Math.min(map2.get(entry.getKey()),entry.getValue());
18                    // for( int i=1;i<=a;i++){
19                    //     arr.add(entry.getKey());
20                    // }
21                    arr.add(entry.getKey());
22                }
23        }
24        int [] array = new int [arr.size()];
25        for( int i=0;i<=array.length-1;i++){
26            array[i]=arr.get(i);
27        }
28        return array;
29    }
30}