class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int i=0;
        String str1 = strs[0];
        String str2= strs[strs.length-1];
        while(i<str1.length() && i< str2.length() && str1.charAt(i)==str2.charAt(i)){
            i++;
        }
        return str1.substring(0,i);
    }
}






// class Solution {
//     public String longestCommonPrefix(String[] strs) {
//         StringBuilder str= new StringBuilder("");
//         // boolean flag=true;
//         for( int i=0;i<=strs[0].length()-1;i++){
//             char ch = strs[0].charAt(i);
//             for( int j=1;j<=strs.length-1;j++){
//                 if(i>=strs[j].length() || strs[j].charAt(i)!=ch){
//                     return str.toString();
//                 }
//             }
//             str.append(ch);
//         }
//         // str.deleteCharAt(str.length()-1);
//         return str.toString();
//     }
// }