1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        Map<String ,List<String>> map = new HashMap<>();
4        for(String str : strs){
5            char [] arr = str.toCharArray();
6            Arrays.sort(arr);
7            String s =new String(arr);
8            map.computeIfAbsent(s,k->new ArrayList<>()).add(str);
9        }
10        return new ArrayList<>(map.values());
11    }
12}