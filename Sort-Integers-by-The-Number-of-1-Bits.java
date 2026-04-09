1class Solution {
2    public int[] sortByBits(int[] arr) {
3        TreeMap<Integer,ArrayList<Integer>> map =new TreeMap<>();
4        for( int i : arr){
5            map.computeIfAbsent(bin(i),k->new ArrayList()).add(i);           
6        }
7        int [] newa = new int [arr.length];
8        int j=0;
9        System.out.println(map);
10        for(Map.Entry<Integer,ArrayList<Integer>> entry : map.entrySet()){
11            ArrayList<Integer> l1 = entry.getValue();
12            Collections.sort(l1);
13            for(int i=0;i<=l1.size()-1;i++){
14                newa[j]=l1.get(i);
15                j++;
16            }
17        }
18        return newa;         
19    }
20    public int bin(int i){
21        int count=0;
22        while(i!=0){
23            if(i%2==1){
24                count++;
25            }
26            i=i/2;
27        }
28        return count;
29    }
30}