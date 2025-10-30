class Solution {
    public int minOperations(String[] logs) {
        Stack<String> st =new Stack<>();
        for(String str : logs ){
            if(st.size()>0){
                if(str .equals("../")){
                    st.pop();
                }else{
                    if(str .equals("./")){
                        continue;
                    }else{
                        st.push(str);
                    }
                }
            }else{
                if(str.equals("../") || str.equals("./")){
                    continue;
                }
                st.push(str);
            }
        }
        return st.size();
    }
}