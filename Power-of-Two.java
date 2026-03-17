1class Solution {
2    public boolean isPowerOfTwo(int n) {
3       HashMap<Integer,Integer> map =new HashMap<>();
4       while(n!=0){
5        int z= n%2;
6        map.put(z,map.getOrDefault(z,0)+1);
7        n=n/2;
8       }
9       if(map.containsKey(1)){
10            if(map.get(1)==1){
11                return true;
12            }
13       }
14       return false;
15    }
16}