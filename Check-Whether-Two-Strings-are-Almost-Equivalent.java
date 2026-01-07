1class Solution {
2    public boolean checkAlmostEquivalent(String word1, String word2) {
3        HashMap<Character,Integer> map1 = new HashMap<>();
4        HashMap<Character,Integer> map2 = new HashMap<>();
5        for( char c :  word1.toCharArray()){
6            map1.put(c,map1.getOrDefault(c,0)+1);
7        }
8        for( char c :  word2.toCharArray()){
9            map2.put(c,map2.getOrDefault(c,0)+1);
10        }
11        for(Map.Entry<Character,Integer> entry : map1.entrySet()){
12            if(map2.containsKey(entry.getKey())){
13                if((Math.abs(entry.getValue() - map2.get(entry.getKey())))>3){
14                    return false;
15                }
16            }else{
17                if(entry.getValue()>3){
18                    return false;
19                }
20            }
21        }
22        for(Map.Entry<Character,Integer> entry : map2.entrySet()){
23            if(map1.containsKey(entry.getKey())){
24                if((Math.abs(entry.getValue() - map1.get(entry.getKey())))>3){
25                    return false;
26                }
27            }else{
28                if(entry.getValue()>3){
29                    return false;
30                }
31            }
32        }
33        return true;
34
35    }
36}