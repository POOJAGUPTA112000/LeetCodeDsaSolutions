class Solution {
    public int minLength(String s) {
        StringBuilder str = new StringBuilder("");
        Stack<Character> st = new Stack<>();
        for( int i=0;i<=s.length()-1;i++){
            if(st.size()>0){
                if(s.charAt(i)=='B' || s.charAt(i)=='D'){
                    if((s.charAt(i)=='B' && st.peek()=='A') || (s.charAt(i)=='D' && st.peek()=='C')){
                        st.pop();
                    }else{
                        st.push(s.charAt(i));
                    }
                    }else{
                        st.push(s.charAt(i));
                    }
                }else{
                st.push(s.charAt(i));
            }
            System.out.println(s.charAt(i)+" " + st.toString());
        }
        // for( Character c : st){
        //     str.append(c);
        // }
        // System.out.println(st.toString());
        return st.size();
    }
}