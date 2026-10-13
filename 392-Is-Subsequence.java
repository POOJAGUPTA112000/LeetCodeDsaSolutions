class Solution {
    public boolean isSubsequence(String s, String t){
    //    if(s.equals("") || s.equals(t)){
    //     return true;
    //    } 
       return callfun(0,0,s,t);
    }
    boolean callfun(int i, int j, String s,String t){
        if(i==s.length()){
            return true;
        }
        if(j==t.length()){
            return false;
        }
        if(s.charAt(i)==t.charAt(j) ){
            return callfun(i+1,j+1,s,t);
        }
        return callfun(i,j+1,s,t);
    }
}






// class Solution {
//     public boolean isSubsequence(String s, String t) {
//         int mark=0;
//         // boolean flag=false;
//         int spoint=0;
//         int tpoint=0;
//         while(spoint<=s.length()-1 && tpoint<=t.length()-1){
//             if(s.charAt(spoint)==t.charAt(tpoint)){
//                 spoint++;
//             }
//             tpoint++;
//         }
//         return spoint==s.length();
//     }
// }