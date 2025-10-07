class Solution {
    public String clearDigits(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder str = new StringBuilder("");
        for(int i=0;i<=s.length()-1;i++){
            if(st.size()>0){
                if(Character.isDigit(s.charAt(i))){
                    st.pop();
                }else{
                    st.push(s.charAt(i));
                }
            }else{
                st.push(s.charAt(i));
            }
        }
        for( Character c : st){
            str.append(c);
        }
        return str.toString();
    }
}