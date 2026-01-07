1class Solution {
2    public boolean makeEqual(String[] words) {
3        HashMap<Character,Integer> map = new HashMap<>();
4        for( String str : words){
5            for( char c :  str.toCharArray()){
6                map.put(c,map.getOrDefault(c,0)+1);
7            }
8        }
9        for(Map.Entry<Character,Integer> entry : map.entrySet()){
10            if(!(entry.getValue()%words.length==0)){
11                return false;
12            }
13        }
14        return true;
15    }
16}