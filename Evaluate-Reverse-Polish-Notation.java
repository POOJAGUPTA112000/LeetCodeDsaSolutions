1class Solution {
2    public int evalRPN(String[] tokens) {
3     Stack<Integer> st =new Stack<>();
4     for( int i=0;i<=tokens.length-1;i++){
5        //  System.out.println(st);
6        if(st.size()>0){
7            if(isDigitCheck(tokens[i])){
8               st.push(Integer.parseInt(tokens[i])); 
9            }else{
10                int a= st.pop();
11                int b = st.pop();
12                st.push(findAllValue(a,b,tokens[i]));
13            }
14        }else{
15            st.push(Integer.parseInt(tokens[i]));
16        }
17       
18      }
19      return st.peek(); 
20    }
21    public static boolean isDigitCheck(String s){
22        switch(s){
23            case "+":
24            case "-":
25            case "*":
26            case "/":
27            return false;
28        }
29        return true;
30    }
31      public static int findAllValue( int a,int b, String c){
32        switch(c){
33            case "+":
34            return a+b;
35            case "-":
36            return b-a;
37            case "*":
38            return a*b;
39            case "/":
40            return b/a;
41        }
42        return 0;
43      }
44    }