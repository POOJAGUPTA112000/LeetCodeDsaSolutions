1class Solution {
2    public boolean checkRecord(String s) {
3        int count =0;
4        for(int i = 0 ;i<=s.length()-1;i++){
5            if(s.charAt(i)=='P'){
6                continue;
7            }else{
8                if(s.charAt(i)=='A'){
9                    count++;
10                    if(count>1){
11                        return false;
12                    }
13                }else{
14                    if(i<=s.length()-3){
15                    if(s.charAt(i)==s.charAt(i+1) && s.charAt(i+1)==s.charAt(i+2)){
16                        return false;
17                    }
18                    }
19                }
20            }
21        }
22        return true;
23    }
24}