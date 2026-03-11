1class Solution {
2    public boolean halvesAreAlike(String s) {
3        String s1 = s.substring(0,s.length()/2);
4        String s2 = s.substring((s.length()/2));
5        int a1=0;
6        int a2=0;
7        for( int i=0;i<=s1.length()-1;i++){
8            a1+=(isVowel(s1.charAt(i))?1:0);
9            a2+=(isVowel(s2.charAt(i))?1:0);
10        }
11        if(a1==a2){
12            return true;
13        }
14        return false;
15    }
16    public boolean isVowel(char c){
17        switch(c){
18            case 'a':
19            case 'A':
20            case 'e':
21            case 'E':
22            case 'i':
23            case 'I':
24            case 'o':
25            case 'O':
26            case 'u':
27            case 'U':
28            return true;
29        }
30        return false;
31    }
32}