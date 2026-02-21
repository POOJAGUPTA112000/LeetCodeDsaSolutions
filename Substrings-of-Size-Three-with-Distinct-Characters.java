1class Solution {
2    public int countGoodSubstrings(String s) {
3        if(s.length()<3){
4            return 0;
5        }
6        int count=0;
7        for( int i=0;i<=s.length()-3;i++){
8            String str =s.substring(i,i+3);
9            // System.out.println(str);
10            HashMap<Character,Integer> map=new HashMap<>();
11            for(char c : str.toCharArray()){
12                if(map.containsKey(c)){
13                    break;
14                }else{
15                    map.put(c,1);
16                }
17            }
18            if(map.size()==3){
19                count++;
20            }
21        }
22        return count;
23    }
24}