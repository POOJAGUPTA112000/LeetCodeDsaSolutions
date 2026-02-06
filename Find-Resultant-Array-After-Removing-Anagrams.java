1class Solution {
2    public List<String> removeAnagrams(String[] words) {
3         List<String> arr =new ArrayList<>();
4         arr.add(words[0]);
5        for( int i=1;i<=words.length-1;i++){
6           if(checkAnagram(arr.get(arr.size()-1),words[i])){
7               continue;
8            }else{
9                arr.add(words[i]);
10            }
11        }      
12        return arr;
13    }
14    public boolean checkAnagram(String str1,String str2){
15        char [] c1 =str1.toCharArray();
16        char [] c2 =str2.toCharArray();
17        Arrays.sort(c1);
18        Arrays.sort(c2);
19        String s1=new String(c1);
20        String s2=new String(c2);
21        if((s1).equals(s2)){
22            return true;
23        } 
24        return false;
25    }
26}