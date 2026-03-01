1class Solution {
2    public boolean isAlienSorted(String[] words, String order) {
3        HashMap<Character,Integer> map= new HashMap<>();
4        for( int i=0;i<order.length();i++){
5            map.put(order.charAt(i),i);
6        }
7        for( int i=1;i<=words.length-1;i++){
8            String str1=words[i-1];
9            String str2 =words[i];
10            int k=0;
11            while(k<str1.length() && k<str2.length()){
12                if(map.get(str1.charAt(k))>map.get(str2.charAt(k))){
13                    return false;
14                }else{
15                    if(map.get(str1.charAt(k))<map.get(str2.charAt(k))){
16                        break;
17                    }
18                }
19                k++;
20            }
21            if(k==str2.length() && str1.length()>str2.length()){
22                return false;
23            }
24        }
25        return true;
26    }
27}