1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        HashSet<Character> set =new HashSet<>();
4        int left=0,count=0;
5        for( int i=0;i<=s.length()-1;i++){
6            while(set.contains(s.charAt(i))){
7                set.remove(s.charAt(left));
8                left++;
9            }
10            set.add(s.charAt(i));
11            count=Math.max(count,i-left+1);
12        }
13        return count;
14    }
15}