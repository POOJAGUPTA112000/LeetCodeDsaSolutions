class Solution {
    public String makeGood(String s) {
        Stack<Character> st= new Stack<>();
        for( char i : s.toCharArray() ){
            if(st.size()>0){
                if(Character.toLowerCase(i)==Character.toLowerCase(st.peek()) 
                && 
                ((Character.isLowerCase(i) && Character.isUpperCase(st.peek())) || 
                (Character.isLowerCase(st.peek()) && Character.isUpperCase(i)))
                ){                    
                    st.pop();
                }else{
                    st.push(i);
                }
            }else{
                st.push(i);
            }
        }
        StringBuilder str=new StringBuilder("");
        for(char c : st){
            str.append(c);
        }
        return str.toString();
    }
}