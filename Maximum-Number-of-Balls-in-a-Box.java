1class Solution {
2    public int countBalls(int lowLimit, int highLimit) {
3        HashMap<Integer,Integer> map = new HashMap<>();
4        for( int i = lowLimit;i<=highLimit;i++){
5                int sum=0;
6                int j=i;
7                while(j!=0){
8                    sum+=(j%10);
9                    j=j/10;
10                }
11                map.put(sum,map.getOrDefault(sum,0)+1);
12        }
13        int max=Integer.MIN_VALUE;
14        // int key=0;
15        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
16            if(max<entry.getValue()){
17                max=entry.getValue();
18                // key=entry.getKey();
19            }
20        }
21        return max;
22        
23    }
24}