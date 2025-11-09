class Solution {
    public int prefixCount(String[] words, String pref) {
        int count=0;
        for(int i=0;i<=words.length-1;i++){
            if(pref.length()>words[i].length()){
                continue;
            }
            // System.out.println(pref+" " +words[i].substring(0,pref.length()));
            if(pref.equals(words[i].substring(0,pref.length()))){
                count++;
            }
        }
        return count;
    }
}