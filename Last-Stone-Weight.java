1class Solution {
2    public int lastStoneWeight(int[] stones) {
3        if(stones.length==1){
4            return stones[0];
5        }
6        ArrayList<Integer> arr =new ArrayList<>();
7        for(int i :stones){
8            arr.add(i);
9        }
10        Collections.sort(arr);
11        while(arr.size()>1){
12            int i=arr.size()-1;
13            if(arr.get(i-1)==arr.get(i)){
14                arr.remove(i);
15                arr.remove(i-1);
16            }else{
17                    int a=arr.get(i);
18                    int b =arr.get(i-1);
19                    arr.remove(i);
20                    arr.remove(i-1);
21                    arr.add(Math.abs(b-a));
22            }
23            Collections.sort(arr);
24        }
25        if(arr.size()==0){
26            return  0; 
27        }
28        return arr.get(0);
29    }
30}