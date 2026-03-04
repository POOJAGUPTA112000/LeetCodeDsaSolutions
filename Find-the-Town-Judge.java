1class Solution {
2    public int findJudge(int n, int[][] trust) {
3        HashMap<Integer,Integer> truston = new HashMap<>(); 
4        HashMap<Integer,Integer> trustby =new HashMap<>();
5        for( int i=1;i<=n;i++){
6            truston.put(i,0);
7            trustby.put(i,0);
8        }
9        for( int i=0;i<=trust.length-1;i++){
10            truston.put(trust[i][0],truston.getOrDefault(trust[i][0],0)+1);
11            trustby.put(trust[i][1],trustby.getOrDefault(trust[i][1],0)+1);
12        }
13        for( int i=n;i>=1;i--){
14            if(truston.get(i)==0 && trustby.get(i)==n-1){
15                return i;
16            }
17        }
18        return -1;
19    }
20}