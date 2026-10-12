class Solution {
    public int max=0;
    public int start=0;
    public String longestPalindrome(String s) {
        if(s.length()<2){
            return s;
        }
        for(int i=0 ; i<s.length()-1; i++){
            expandtocheck(s,i,i);// to odd length;

            expandtocheck(s,i,i+1);// to even length;
        }
        return s.substring(start,start+max);
    }
    public void expandtocheck(String s , int l ,int r){
        while(l>=0 && r <s.length() && s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }
        if(max<(r-l-1)){
            max=r-l-1;
            start=l+1;
        }
    }
}