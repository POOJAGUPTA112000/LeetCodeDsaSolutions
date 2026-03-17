1class Solution {
2    public int firstUniqChar(String s) {
3        LinkedHashMap<Character,Integer> map =new LinkedHashMap<>();
4        for( char c :  s.toCharArray()){
5            map.put(c,map.getOrDefault(c,0)+1);
6        }
7        for(int i=0;i<=s.length()-1;i++){
8            if(map.get(s.charAt(i))==1){
9                return i;
10            }
11        }
12        return -1;
13    }
14}
15
16
17// class Solution {
18//     public int firstUniqChar(String s) {
19//         LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
20//         for(int i=0;i<=s.length()-1;i++){
21//             map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
22//         }
23//         // char ch;
24//         // for(Map.Entry<Character,Integer> list : map.entrySet()){
25//         //     if(list.getValue()==1){
26//         //         ch = list.getKey();
27//         //         break;
28//         //     }
29//         // }
30//         for( int i=0;i<=s.length()-1;i++){
31//             if(map.get(s.charAt(i))==1){
32//                 return i;
33//             }
34//         }
35//         return -1;
36//     }
37// }