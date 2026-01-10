1class Solution {
2    public String toGoatLatin(String sentence) {
3        StringBuilder str =new StringBuilder("");
4        String [] s =sentence.split(" "); 
5        for(int i=0;i<=s.length-1;i++){
6           String st =s[i];
7           if(!isVowel(st.charAt(0))){
8            str.append(st.substring(1,st.length()) + st.charAt(0));
9            str.append("ma" + counts(i)+" ");
10           }else{
11                str.append(st+"ma"+counts(i)+" ");
12           }
13        //    str.appned(" ");
14        }
15        str.deleteCharAt(str.length()-1);
16        return str.toString();
17    }
18    public static boolean isVowel(char c) {
19    // Check if the character's index in the vowel string is not -1
20    return "AEIOUaeiou".indexOf(c) != -1;
21    }
22    static public String counts(int i){
23        StringBuilder s =new StringBuilder("");
24        for( int j=1;j<=i+1;j++){
25            s.append("a");
26        }
27        return s.toString();
28
29    }
30}