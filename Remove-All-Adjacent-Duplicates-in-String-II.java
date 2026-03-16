1class Solution {
2    public String removeDuplicates(String s, int k) {
3        Stack<int [] > st =new Stack<>();
4        for(char c : s.toCharArray()){
5            if(st.size()>0 && st.peek()[0]==c){
6                st.peek()[1]++;
7                if(st.peek()[1]==k){
8                    st.pop();
9                }
10            }else{
11                st.push(new int []{c,1});
12            }
13        }
14        StringBuilder str =new StringBuilder("");
15        for( int [] p : st){
16            // str.append(((char)p[0]+"").repeat(p[1]));
17            for( int i=0;i<p[1];i++){
18                str.append((char)p[0]);
19            }
20        }
21        return str.toString();
22    }
23}