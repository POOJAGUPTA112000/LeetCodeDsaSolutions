class Solution {
    public int numJewelsInStones(String jewels, String stones) {
    int count=0;
    for( int i=0;i<=jewels.length()-1;i++){
        char ch =jewels.charAt(i);
        for( int j=0;j<=stones.length()-1;j++){
            if(ch == (stones.charAt(j))){
                count++;
            }
            }
        } 
        return count;   
    }
}