class Solution {
    public String reverseParentheses(String s) {
        Stack<StringBuilder> stack = new Stack<>();
        stack.push(new StringBuilder()); // base level

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                // start a new level
                stack.push(new StringBuilder());
            } else if (ch == ')') {
                // reverse the top level and append to previous
                StringBuilder top = stack.pop().reverse();
                stack.peek().append(top);
            } else {
                // just add characters
                stack.peek().append(ch);
            }
        }
        return stack.pop().toString();
    }
}





















// // class Solution{
// //     public String reverseParentheses(String s){
// //         Stack<Character> st = new Stack<>();
// //         for(int i=0;i<=s.length()-1;i++){
// //             if(st.size()>0){ 
// //                 if(s.charAt(i)==')'){
// //                     StringBuilder str = new StringBuilder("");
// //                     while(st.peek()!='('){
// //                        str.append(st.pop());
// //                     }
// //                     st.pop();
// //                     // is it optional to reverse here
// //                      str.reverse();
// //                     for(char c : str.toString().toCharArray()){
// //                         st.push(c);
// //                     }
// //                 }
// //                 else{
// //                     st.push(s.charAt(i));
// //                 }
// //             }
// //             else{
// //                 st.push(s.charAt(i));
// //             }
// //         }
// //         StringBuilder str = new StringBuilder("");
// //         // st.pop();
// //         for( char ch : st){
// //             str.append(ch);
// //         }
// //         return str.toString();
// //     }
// // }





// class Solution {
//     public String reverseParentheses(String s) {
//         Stack<Character> st = new Stack<>();
//         for (int i = 0; i < s.length(); i++) {
//             if (s.charAt(i) == ')') {
//                 StringBuilder str = new StringBuilder();
//                 while (st.peek() != '(') {
//                     str.append(st.pop());
//                 }
//                 st.pop(); // remove '('
//                 str.reverse(); // ✅ required
//                 for (char c : str.toString().toCharArray()) {
//                     st.push(c);
//                 }
//             } else {
//                 st.push(s.charAt(i));
//             }
//         }
//         StringBuilder str = new StringBuilder();
//         for (char ch : st) {
//             str.append(ch);
//         }
//         return str.toString(); // ✅ no need to reverse here
//     }
// }
