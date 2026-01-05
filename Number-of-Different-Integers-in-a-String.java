1class Solution {
2    public int numDifferentIntegers(String word) {
3       HashSet<String> set =new HashSet<>();
4       StringBuilder str =new StringBuilder("");
5       for( int i=0;i<=word.length()-1;i++){
6            if(Character.isDigit(word.charAt(i))){
7                str.append(word.charAt(i));
8            }else{
9                if(!(str.toString().length()<=0)){
10                    // set.add(Integer.parseInt(str.toString()));
11                    System.out.println(str.toString());
12                    set.add(str.toString().replaceFirst("^0+",""));
13                    str=new StringBuilder();
14                }                
15            }
16       }
17           if(!(str.toString().length()<=0)){
18                    // set.add(Integer.parseInt(str.toString()));
19                    System.out.println(str.toString());
20                    set.add(str.toString().replaceFirst("^0+",""));
21                    str=new StringBuilder();
22                } 
23
24       
25       return set.size();
26    }
27}