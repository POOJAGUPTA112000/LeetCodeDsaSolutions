1class Solution {
2    public String largestMerge(String word1, String word2) {
3        StringBuilder str = new StringBuilder("");
4        int i=0,j=0;
5        while(i<word1.length() && j<word2.length()){
6            if(word1.substring(i).compareTo(word2.substring(j))>0){
7                str.append(word1.charAt(i));
8                i++;
9            }else{
10                str.append(word2.charAt(j));
11                j++;
12            }
13        }
14        // System.out.println(i+" "+j);
15        if(i<word1.length()){
16            str.append(word1.substring(i));
17        }
18        if(j<word2.length()){
19            str.append(word2.substring(j));
20        }
21        return str.toString();
22    }
23}