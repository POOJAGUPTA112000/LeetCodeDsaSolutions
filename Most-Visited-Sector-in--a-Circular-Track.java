1class Solution {
2    public List<Integer> mostVisited(int n, int[] rounds) {
3        // HashMap<Integer,Integer> map =new HashMap<>();
4        ArrayList<Integer> list =new ArrayList<>();
5        if(rounds[0]<=rounds[rounds.length-1]){
6        for( int i=rounds[0];i<=rounds[rounds.length-1];i++){
7            list.add(i);
8        }
9        }else{
10            for(int i =rounds[0]; i<=n;i++){
11                list.add(i);
12            }
13            for( int i=1;i<=rounds[rounds.length-1];i++){
14                list.add(i);
15            }
16        }
17        Collections.sort(list);
18        return list;
19    //     for( int i=1;i<=rounds.length-1;i++){
20    //         if(rounds[i-1] > rounds[i]){
21    //             for( int j=rounds[i-1];j<=n;j++){
22    //                 map.put(j,map.getOrDefault(j,0)+1);
23    //             }
24    //             for(int j=1;j<=rounds[i];j++){
25    //                  map.put(j,map.getOrDefault(j,0)+1);
26    //             }
27    //         }else{
28    //             for( int j=rounds[i-1];j<=rounds[i];j++){
29    //                 map.put(j,map.getOrDefault(j,0)+1);
30    //             }
31    //         }
32    //     }
33    //     System.out.println(map);
34    //     // int max = Integer.MIN_VALUE;
35    //     // for(Map.Entry<Integer,Integer> entry : map.entrySet()){
36    //     //     if(entry.getValue()>max){
37    //     //         max=entry.getValue();
38    //     //     }
39    //     // }
40    //     ArrayList<Integer> arr =new ArrayList<>();
41    //     for(Map.Entry<Integer,Integer> entry : map.entrySet()){
42    //         if(entry.getValue()>1){
43    //             arr.add(entry.getKey());
44    //         }
45    //     }
46    //     Collections.sort(arr);
47    //     return arr;
48    //
49    }
50}