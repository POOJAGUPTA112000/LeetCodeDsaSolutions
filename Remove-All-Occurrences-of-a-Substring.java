1class Solution {
2    public String removeOccurrences(String s, String part) {
3        StringBuilder str =new StringBuilder(s);
4        int index=str.indexOf(part);
5        while(index>-1){
6            str.delete(index,index+part.length());
7            index=str.indexOf(part);
8        }
9        
10        return str.toString();
11    }
12}
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27// for( int i=0;i<=s.length()-part.length();i++){
28//             if(part.equals(s.substring(i,i+part.length()))){
29//                 str.delete(i,i+part.length());
30//             }
31//         }