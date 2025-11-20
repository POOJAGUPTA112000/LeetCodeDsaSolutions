class Solution {
    public int titleToNumber(String columnTitle) {
        int n=0;
        int j=0;
        for(int i=columnTitle.length()-1;i>=0;i--){
            n+=(columnTitle.charAt(i)-'A'+1)*(Math.pow(26,j));
            j++;
        }
        return n;
    }
}