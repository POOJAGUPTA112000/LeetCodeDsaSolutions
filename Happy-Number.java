1class Solution{
2    public boolean isHappy(int n) {
3        if(n==1){
4            return true;
5        }
6        // if(n<10){
7        //     return false;
8        // }
9        HashMap<Integer,Integer> h =new HashMap<>();
10        while(n!=1){
11            int num=n;
12            int sum=0;
13            while(num!=0){
14                sum+=Math.pow((num%10),2);
15                // System.out.println(sum);
16                num=num/10;
17            }
18            if(h.containsKey(sum)){
19                return false;
20            }else{
21                h.put(sum,h.getOrDefault(sum,0)+1);
22            }
23            System.out.println(sum);
24            n=sum;
25        }
26        return true;
27    }
28}