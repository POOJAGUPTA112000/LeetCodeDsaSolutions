class Solution {
    public String reverseWords(String s) {
        String [] str = s.split(" ");
        System.out.println(Arrays.toString(str));
        for(int i=0;i<=str.length-1;i++){
            str[i]=myreverse(str[i]);
        }
        StringBuilder st =new StringBuilder("");
        for( String c : str){
            st.append(c+" ");
        }
        st.deleteCharAt(st.length()-1);
        return st.toString();
    }
    public static String myreverse(String str){
        StringBuilder string =new StringBuilder("");
        for( int i=str.length()-1;i>=0;i--){
            string.append(str.charAt(i));
        }
        return string.toString();
    }
}