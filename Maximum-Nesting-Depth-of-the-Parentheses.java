class Solution {
    public int maxDepth(String s) {
        Stack<Character> st = new Stack<>();
        int max=0;
        for( int i=0;i<=s.length()-1;i++){
            if(s.charAt(i)=='(' || s.charAt(i)==')'){
                if(st.size()>0){
                    if(s.charAt(i)==')'){
                        if(max<st.size()){
                            max=st.size();
                        }
                        st.pop();
                    }else{
                        st.push(s.charAt(i));
                    }
                }else{
                    st.push(s.charAt(i));
                }
            }
        }
        return max;
    }
}