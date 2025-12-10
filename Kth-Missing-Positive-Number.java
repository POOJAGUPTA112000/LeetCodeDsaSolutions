1class Solution {
2    public int findKthPositive(int[] arr, int k){
3        int count=0;
4        ArrayList<Integer> a = new ArrayList<>();
5        for(int i=0;i<=arr.length-1;i++){
6            a.add(arr[i]);
7        }
8        int i=1;
9        while(k!=count){
10            if(!a.contains(i)){
11                count++;
12                if(count==k){
13                   return i;
14                }
15            }
16            i++;
17        }
18        return 1;   
19    }
20}