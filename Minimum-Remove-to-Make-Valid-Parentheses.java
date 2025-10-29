class Solution {
    public String minRemoveToMakeValid(String s){
        Stack<Integer> st = new Stack<>();
        StringBuilder str =new StringBuilder("");
        for( int i=0;i<=s.length()-1;i++){
            if(s.charAt(i)==')' || s.charAt(i)=='('){
                if(st.size()>0){
                    if(s.charAt(i)==')' && s.charAt(st.peek())=='('){
                        st.pop();
                    }else{
                        st.push(i);
                    }
                }else{
                    if(s.charAt(i)==')'){
                        st.push(i);
                    }else{
                        st.push(i);
                    }
                }
            }
        }
        for( int i=0;i<=s.length()-1;i++){
            if(st.contains(i)){
                continue;
            }
            str.append(s.charAt(i));
        }
        return str.toString();
    }
}