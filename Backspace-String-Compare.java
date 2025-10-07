class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();
        // if(s.length()!=t.length()){
        //     return false;
        // }
        for( int i=0;i<=s.length()-1;i++){
            if(s1.size()>0){
                if(s.charAt(i)=='#'){
                    s1.pop();
                }else{
                    s1.push(s.charAt(i));
                }
            }else{
                s1.push(s.charAt(i));
            }
        }
        for( int i=0;i<=t.length()-1;i++){
            if(s2.size()>0){
                if(t.charAt(i)=='#'){
                    s2.pop();
                }else{
                    s2.push(t.charAt(i));
                }
            }else{
                s2.push(t.charAt(i));
            }
        }
        StringBuilder str1 = new StringBuilder("");
         StringBuilder str2 = new StringBuilder("");
         for(Character c : s1){
            if(c=='#'){
                continue;
            }
            str1.append(c);
         }
         for(Character c : s2){
             if(c=='#'){
                continue;
            }
            str2.append(c);
         }
         System.out.println(str1.toString() +" "+str2.toString());
         return str1.toString().equals(str2.toString());
    }
}