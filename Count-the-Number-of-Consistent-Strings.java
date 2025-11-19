class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        HashMap<Character,Integer> maint = new HashMap<>();
        for( char c : allowed.toCharArray()){
            maint.put(c,maint.getOrDefault(c,0)+1);
        }
        for( String s : words){
            boolean flag1 = false;
            boolean flag2= true;
            // if(allowed.length() > s.length()){
            //     continue;
            // }
            for(Map.Entry<Character,Integer> entry : maint.entrySet()){
                if(s.contains(Character.toString(entry.getKey()))){
                    flag1=true;
                    break;
                }
            }
            for(char c : s.toCharArray()){
                if(!allowed.contains(Character.toString(c))){
                    flag2=false;
                    break;
                }
            }
            if(flag1 && flag2){
                count++;
            }
        }
        return count;
    }
}