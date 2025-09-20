class Solution {
    public boolean isValid(String s) {
        if(s.length()==1 || s.length()%2!=0 ){
            return false;
        }
        Stack<Character> myStack = new Stack<>();
       for(int i=0;i<=s.length()-1;i++){
        if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
            myStack.push(s.charAt(i));
        }else{
            if(s.charAt(i)==')' && !myStack.isEmpty() && myStack.peek()=='('){
                myStack.pop(); 
            }else{
                if(s.charAt(i)=='}' && !myStack.isEmpty()  && myStack.peek()=='{'){
                myStack.pop(); 
            }else{
                if(s.charAt(i)==']' && !myStack.isEmpty() && myStack.peek()=='['){
                myStack.pop(); 
            }else{
                return false;
            }
            }
        }
        }
       }
       if(myStack.isEmpty()){
        return true;
       }
       return false;
    }
}