1class Solution {
2    public int maximumLengthSubstring(String s) {
3        int length=0;
4        int left=0;
5        StringBuilder str = new StringBuilder("");
6        for(int i=1;i<=s.length()-1;i++){
7            if(str.isEmpty()){
8                str.append(s.charAt(left));
9            } 
10            str.append(s.charAt(i));
11            boolean flag=true;
12            HashMap<Character,Integer> map = new HashMap<>();
13            for(char c : str.toString().toCharArray()){
14                map.put(c,map.getOrDefault(c,0)+1);
15                if(map.containsKey(c)){
16                    if(map.get(c)>2){
17                        flag=false;
18                        break;
19                    }
20                }
21            }
22            if(flag==true){
23                if(length<str.toString().length()){
24                    length=str.toString().length();
25                }
26            }else{
27                str.deleteCharAt(left);
28            }
29        }
30        return length;
31    }
32}