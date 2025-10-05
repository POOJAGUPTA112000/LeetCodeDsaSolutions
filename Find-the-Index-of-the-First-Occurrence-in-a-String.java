class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length()<needle.length()){
            System.out.println("pooja");
            return -1;
        }
        if(haystack.length()==needle.length()){
            if(haystack.equals(needle)){
                return 0;
            }
        }
        if(haystack.contains(needle)){
        for(int i=0;i<=haystack.length()-needle.length();i++){
            String str =haystack.substring(i,i+needle.length());
            if(str.equals(needle)){
                System.out.println("works");
                return i;
            }
          }
        }
        return -1;
    }
}