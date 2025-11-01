class Solution {
    public int findPermutationDifference(String s, String t) {
      int sum=0;
      for(int i=0;i<=s.length()-1;i++){
        sum+=Math.abs(s.indexOf(s.charAt(i)) - t.indexOf(s.charAt(i)));
      }  
      return sum;
    }
}