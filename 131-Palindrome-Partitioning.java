class Solution {
    static public List<List<String>> partition(String s) {
        List<List<String>> list =  new ArrayList<>();
        callfun(0,s,list,new ArrayList<>());
        return list;
    }
    static void callfun(int j,String s, List<List<String>> list, List<String> ds){
        if(j==s.length()){
            list.add(new ArrayList<>(ds));
            return;
        }
        for( int i=j;i<s.length();i++){
            // String snew = String.substring(s,0,i+1);
            if(isPalindrom(s.substring(j,i+1))){
                ds.add(s.substring(j,i+1));
                callfun(i+1,s,list,ds);
                ds.remove(ds.size()-1);
            }
        }

    }
    static boolean isPalindrom(String s){
            int l=0;
            int h=s.length()-1;
            while(l<=h){
                if(s.charAt(l)!=s.charAt(h)){
                    return false;
                }
                l++;
                h--;
            }
            return true;
    }
}