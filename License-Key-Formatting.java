1class Solution {
2    public String licenseKeyFormatting(String s, int k) {
3        StringBuilder str = new StringBuilder("");
4        int count=0;
5        for( int i=s.length()-1;i>=0;i--){
6            // System.out.println(Character.toUpperCase(s.charAt(i)) + " "+i);
7            if(s.charAt(i)=='-'){
8                continue;
9            }else{
10                str.append(Character.toUpperCase(s.charAt(i)));
11                count++;
12            }
13            if(count==k){
14                str.append(""+'-');
15                count=0;
16            }
17        }
18        if(  str.length()>0 && str.charAt(str.length()-1)== '-'){
19           str.deleteCharAt(str.length()-1);
20        }
21        return str.reverse().toString();
22    }
23}