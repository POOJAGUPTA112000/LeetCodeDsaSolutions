1class Solution {
2    public int numEquivDominoPairs(int[][] dominoes) {
3        HashMap<String,Integer> map = new HashMap<>();
4        int num=0;
5        for(int i=0;i< dominoes.length;i++){
6            if(dominoes[i][0]<dominoes[i][1]){
7                map.put(dominoes[i][0]+""+dominoes[i][1],map.getOrDefault(dominoes[i][0]+""+dominoes[i][1],0)+1);
8            }else{
9                map.put(dominoes[i][1]+""+dominoes[i][0],map.getOrDefault(dominoes[i][1]+""+dominoes[i][0],0)+1);
10            }
11        }
12        System.out.println(map);
13        int min=0;
14        for(Map.Entry<String,Integer> entry:map.entrySet()){
15            // if(entry.getValue()>=2){
16            //     if(entry.getValue()%2==0){
17            //     min+=entry.getValue()/2;
18            //     }else{
19            //         min+=entry.getValue();
20            //     }
21            // }
22            int n=entry.getValue();
23            min+=(n)*(n-1)/2;
24        }
25        // if(min==2){
26        //     return 1;
27        // }
28        // if(dominoes.length%2==0){
29        //     return min/2;
30        // }
31        return min;
32    }
33}
34
35
36
37
38
39
40
41
42
43
44
45
46
47
48
49
50
51
52
53// class Solution {
54//     public int numEquivDominoPairs(int[][] dominoes) {
55//         int pair = 0;
56//         for(int i=0;i<dominoes.length;i++){
57//             for(int j=i+1;j<=dominoes.length-1;j++){
58//                 if((dominoes[i][0]==dominoes[j][0] && dominoes[i][1]==dominoes[j][1]) || 
59//                    (dominoes[i][0]==dominoes[j][1] && dominoes[i][1]==dominoes[j][0])){
60//                     pair++;
61//                 }
62//             }
63//         }
64//         System.out.println(pair);
65//         if(pair==1){
66//             return 1;
67//         }
68//         return pair;
69//     }
70// }