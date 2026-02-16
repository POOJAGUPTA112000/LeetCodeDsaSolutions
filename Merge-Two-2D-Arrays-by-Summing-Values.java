1class Solution {
2    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
3        TreeMap<Integer,Integer> map=new  TreeMap<>();
4        int i,j;
5        for( i=0,j=0;i<=nums1.length-1 && j<=nums2.length-1;i++,j++){
6            if(!map.containsKey(nums1[i][0])){
7            map.put(nums1[i][0],nums1[i][1]);
8            }else{
9                map.put(nums1[i][0],nums1[i][1]+map.get(nums1[i][0]));
10            }
11            if(!map.containsKey(nums2[j][0])){
12            map.put(nums2[j][0],nums2[j][1]);
13            }else{
14                map.put(nums2[j][0],nums2[j][1]+map.get(nums2[j][0]));
15            }
16        }
17        while(i<nums1.length){
18            if(!map.containsKey(nums1[i][0])){
19            map.put(nums1[i][0],nums1[i][1]);
20            }else{
21                map.put(nums1[i][0],nums1[i][1]+map.get(nums1[i][0]));
22            }
23            i++;
24        }
25        while(j<nums2.length){
26           if(!map.containsKey(nums2[j][0])){
27            map.put(nums2[j][0],nums2[j][1]);
28            }else{
29                map.put(nums2[j][0],nums2[j][1]+map.get(nums2[j][0]));
30            }
31            j++; 
32        }
33        int arr[][]=new int [map.size()][2];
34        int k=0;
35        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
36            arr[k][0]=entry.getKey();
37            arr[k][1]=entry.getValue();
38            k++;
39        }
40        return arr;
41    }
42}