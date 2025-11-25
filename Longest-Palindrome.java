import java.util.*;
class Solution {
    public int longestPalindrome(String s) {
        if(s.length()<=1){
            return 1;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<=s.length()-1;i++){
        map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        } 
        boolean oddmap=false;
        int sum=0;
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
        if(entry.getValue()>=2){
            if(entry.getValue()%2!=0 && oddmap==false){
                    sum+=entry.getValue();
                    oddmap=true;
            }else{
                if(entry.getValue()%2==0){
                    sum+=entry.getValue();
                }else{
                    sum+=(entry.getValue()-1);
                }
            }
        }else{
            if(oddmap==false){
                    sum+=entry.getValue();
                    oddmap=true;
             }
        }
        
    }
    return sum;
    }
}