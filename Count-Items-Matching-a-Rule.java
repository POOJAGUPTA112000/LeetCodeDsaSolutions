1class Solution {
2    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
3        int i=0;
4        int count=0;
5        if(ruleKey.equals("type")){
6            i=0;
7        }else{
8            if(ruleKey.equals("color")){
9                i=1;
10            }else{
11                i=2;
12            }
13        }
14        for( int j=0;j<=items.size()-1;j++){
15            if(items.get(j).get(i).equals(ruleValue)){
16                count++;
17            }
18        }
19        return count;
20    }
21}