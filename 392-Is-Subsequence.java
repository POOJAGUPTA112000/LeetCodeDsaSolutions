class Solution {
    public boolean isSubsequence(String s, String t) {
        int mark=0;
        // boolean flag=false;
        int spoint=0;
        int tpoint=0;
        while(spoint<=s.length()-1 && tpoint<=t.length()-1){
            if(s.charAt(spoint)==t.charAt(tpoint)){
                spoint++;
            }
            tpoint++;
        }
        return spoint==s.length();
    }
}