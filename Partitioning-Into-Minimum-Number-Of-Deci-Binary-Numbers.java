class Solution {
    public int minPartitions(String n) {
       int max=Integer.MIN_VALUE;
       for( int i=0;i<=n.length()-1;i++){
        if(max<(n.charAt(i)-'0')){
            max=(n.charAt(i)-'0');
        }
       }
       return max;
    }
}