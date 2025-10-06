class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<=s.length()-1;i++){
                if(st.size()>0){
                if(st.peek()==s.charAt(i)){
                    st.pop();
                }else{
                    st.push(s.charAt(i));
                }
                }else{
                    st.push(s.charAt(i));
                }
            }
            StringBuilder str = new StringBuilder("");
            for(Character c : st){
                str.append(c);
            }
        return str.toString();
    }
}