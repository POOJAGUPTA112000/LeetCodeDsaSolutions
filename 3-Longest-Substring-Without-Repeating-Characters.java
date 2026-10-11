class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
        // HashMap<Character,Integer> map = new HashMap<>();
        int j=0;
        int max=1;
        // map.put(s.charAt(j),1);
        for(int i=1;i<s.length();i++){
            if(s.substring(j,i).contains(s.charAt(i)+"")){
                while(s.substring(j,i).contains(s.charAt(i)+"")){
                    j++;
                }
            }else{
                max=Math.max(max,s.substring(j,i+1).length());
            }
        }
        return max;
    }
}
















// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         HashSet<Character> set =new HashSet<>();
//         int left=0,count=0;
//         for( int i=0;i<=s.length()-1;i++){
//             while(set.contains(s.charAt(i))){
//                 set.remove(s.charAt(left));
//                 left++;
//             }
//             set.add(s.charAt(i));
//             count=Math.max(count,i-left+1);
//         }
//         return count;
//     }
// }