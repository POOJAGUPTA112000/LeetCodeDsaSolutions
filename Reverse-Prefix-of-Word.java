class Solution {
    public String reversePrefix(String word, char ch) {
    Stack<Character> st = new Stack<>();
    StringBuilder str = new StringBuilder("");
    int count=0;
    for( char c : word.toCharArray()){
        if(count>0){
            str.append(c);
            continue;
        }
        if(st.size()>0){
            if(c==ch){
                count++;
                str.append(c);
                while(!st.empty()){
                    str.append(st.pop());
                }
            }else{
                st.push(c);
            }
        }else{
            if(c==ch){
                count++;
                str.append(c);
                continue;
            }
            st.push(c);
        }
    }
    if(str.toString().length()<1){
        return word;
    }
    return str.toString();
    }
}

















    //     StringBuilder str = new StringBuilder("");
    //     // int count=0;
    //     int j=0;
    //     for( int i=0;i<=word.length()-1;i++){
    //         if(word.charAt(i)==ch){
    //             // count++;
    //             for( j=i;j>=0;j--){
    //                 str.append(word.charAt(i));
    //             }
    //         }
    //     }
    //     for( int i=j ; i<=word.length()-1;i++){
    //         str.append(word.charAt(i));
    //     }
    // return str.toString();























    //     Stack<Character> st = new Stack<>();
    //     for( char c : word.toCharArray()){
    //         if(st.size()>0){
    //             if(c==ch){
                    
    //             }else{
    //                 st.push(c);
    //             }
    //         }else{
    //             st.push(c);
    //         }
    //     }
    // }