// import java.util.*;

// class Solution {
//     public boolean wordPattern(String pattern, String s) {
//         String[] words = s.split(" ");

//         // Step 1: Check if lengths match
//         if (pattern.length() != words.length) return false;

//         // Step 2: Initialize two maps for bijective mapping
//         HashMap<Character, String> mforp = new HashMap<>();
//         HashMap<String, Character> mfors = new HashMap<>();

//         for (int i = 0; i < pattern.length(); i++) {
//             char c = pattern.charAt(i);
//             String word = words[i];

//             // Check existing mapping from char to word
//             if (mforp.containsKey(c)) {
//                 if (!mforp.get(c).equals(word)) return false;
//             } else {
//                 mforp.put(c, word);
//             }

//             // Check existing mapping from word to char
//             if (mfors.containsKey(word)) {
//                 if (mfors.get(word) != c) return false;
//             } else {
//                 mfors.put(word, c);
//             }
//         }

//         return true;
//     }
// }


import java.util.*;
class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> mforp = new HashMap<>();
        HashMap<String,Character> mfors = new HashMap<>();
        String [] words = s.split(" ");
         if(words.length!=pattern.length()){
            return false;
        }
        for(int i=0;i<=words.length-1;i++){
            char c = pattern.charAt(i);
            String str = words[i];
            if(mforp.containsKey(c)){
                if(!mforp.get(c).equals(str)){
                    return false;
                }
                }else{
                mforp.put(c,str);
                }
            if(mfors.containsKey(str)){
                if(!mfors.get(str).equals(c)){
                    return false;
                }
                }
                else{
                mfors.put(str,c);
                }
            }
        return true;
    }
}



// import java.util.*;
// class Solution {
//     public boolean wordPattern(String pattern, String s) {
//         if(pattern.length()!=s.length()){
//             return false;
//         }
//     Hashtable<Character,String> list  = new Hashtable<>();
//        String str [] = s.split(" ");
//        //boolean flag=true;
//        for( int i=0;i<=str.length-1;i++){
//         if(list.containsKey(pattern.charAt(i))){
//             if(list.get(pattern.charAt(i)).equals(str[i])){
//                 continue;
//             }else{
//             return false;
//             }
//         }
//         list.put(pattern.charAt(i),str[i]);
//        }
//        return true;
//     }
// }