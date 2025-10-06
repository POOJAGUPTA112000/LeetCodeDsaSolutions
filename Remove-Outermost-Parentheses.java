class Solution {
    public String removeOuterParentheses(String s) {
        // String str="";
        StringBuilder str = new StringBuilder("");
        Stack<Character> st = new Stack<>();
        for(int i=0;i<=s.length()-1;i++){
            if(s.charAt(i)=='('){
                if(st.size()>0){
                 str.append(s.charAt(i));   
                }
                st.push(s.charAt(i));
            }else{
                st.pop();
                if(st.size()>0){
                    str.append(s.charAt(i));
                }
            }
        }
        return str.toString();
    }
}