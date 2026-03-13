1class Solution {
2    public List<Integer> findAnagrams(String s, String p) {
3        ArrayList<Integer> arr =new ArrayList<>();
4        if(p.length() > s.length()){
5            return arr;
6        }
7        char ch [] = p.toCharArray();
8        Arrays.sort(ch);
9        String str =String.valueOf(ch);
10
11        for(int i=0;i<=s.length()-p.length();i++){
12            char c [] =s.substring(i,i+p.length()).toCharArray();
13            Arrays.sort(c);
14            String s1 = new String(c);
15            if(str.equals(s1)){
16                arr.add(i);
17            }
18        }
19        return arr;
20    }
21}