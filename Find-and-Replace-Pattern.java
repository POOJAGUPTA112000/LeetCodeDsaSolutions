import java.util.*;
class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        ArrayList<String> list  = new ArrayList<>();
        for(String str :  words){
            boolean flag = true;
            String st = str;
            HashMap<Character,Character> c1 = new HashMap<>();
            HashMap<Character,Character> c2 = new HashMap<>();
            for(int i=0;i<=st.length()-1;i++){
                char ch1 = st.charAt(i);
                char ch2 = pattern.charAt(i);
                if(c1.containsKey(ch1)){
                    if(c1.get(ch1)!=ch2){
                        flag=false;
                    }
                }else{
                    c1.put(ch1,ch2);
                }
                if(c2.containsKey(ch2)){
                    if(c2.get(ch2)!=ch1){
                       flag =false;
                    }
                }else{
                    c2.put(ch2,ch1);
                }
            }
            if(flag==true){
                list.add(str);
            }
        }
        return list;
    }
}