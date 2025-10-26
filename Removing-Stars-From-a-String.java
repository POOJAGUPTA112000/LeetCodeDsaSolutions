class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        for( char ch : s.toCharArray()){
            if(st.size()>0){
                if(ch=='*'){
                    st.pop();
                }else{
                    st.push(ch);
                }
            }else{
                st.push(ch);
            }
        }
        StringBuilder str = new StringBuilder("");
        while(!st.empty()){
            str.append(st.pop());
        }
        return str.reverse().toString();
    }
}