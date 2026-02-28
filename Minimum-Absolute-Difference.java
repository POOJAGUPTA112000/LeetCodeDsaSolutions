1class Solution {
2    public List<List<Integer>> minimumAbsDifference(int[] arr) {
3       Arrays.sort(arr);
4       int min=Integer.MAX_VALUE;;
5       List<List<Integer>> list =new ArrayList<>();
6       for(int i=1;i<=arr.length-1;i++){
7            int diff=Math.abs(arr[i-1]-arr[i]);
8            if(diff<min){
9                min=diff;
10                list.clear(); //delete whole list;
11            }
12            if(diff==min){
13                List<Integer> l1 =new ArrayList<>();
14                l1.add(arr[i-1]);
15                l1.add(arr[i]);
16                list.add(l1);
17            }
18       } 
19       return list;
20    }
21}