class Solution {
    public boolean isIsomorphic(String s, String t) {
        // if(s.length()!=t.length()){
        //     return false;
        // }
        HashMap<Character,Character> map1 = new HashMap<>();
        HashMap<Character,Character> map2 = new HashMap<>();
        for(int i=0;i<=s.length()-1;i++){
            char ch = s.charAt(i);
            char cs = t.charAt(i);

            if(map1.containsKey(ch)){
                if(map1.get(ch)!=cs){
                    return false;
                }
            }else{
                map1.put(ch,cs);
            }

            if(map2.containsKey(cs)){
                if(map2.get(cs)!=ch){
                    return false;
                }
            }else{
                map2.put(cs,ch);
            }
        }
        return true;
    }
}