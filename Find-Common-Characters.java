1class Solution {
2    public List<String> commonChars(String[] words) {
3        HashMap<Character,Integer> map1 =new HashMap<>();
4        for( char c : words[0].toCharArray()){
5            map1.put(c,map1.getOrDefault(c,0)+1);
6        }
7        ArrayList<Character> arr =new ArrayList<>();
8        for( int i=1;i<=words.length-1;i++){
9           HashMap<Character,Integer> map2 =new HashMap<>();
10            for( char c : words[i].toCharArray()){
11                map2.put(c,map2.getOrDefault(c,0)+1);
12            }
13            
14            for(Map.Entry<Character,Integer> entry : map1.entrySet()){
15                 char key = entry.getKey();
16                int value = entry.getValue();
17                if(!map2.containsKey(key)){
18                    arr.add(key); // mark for removal
19                } else {
20                    map1.put(key, Math.min(value, map2.get(key))); // update to min frequency
21                }
22            }
23        }
24       ArrayList<String> final1 = new ArrayList<>();
25    //    for( char c : arr ){
26    //         map1.remove(c);
27    //    }
28       for(Map.Entry<Character,Integer> entry : map1.entrySet()){
29          if (!arr.contains(entry.getKey())){
30            for( int i=1;i<=entry.getValue();i++){
31                final1.add(entry.getKey()+"");
32            }
33          }
34            // for(int i = 0; i < entry.getValue(); i++){
35            //     final1.add(entry.getKey() + "");
36            // }
37        }
38        return final1;
39    
40    }
41}